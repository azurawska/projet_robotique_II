

/**
 * Created by alexis on 01/01/2017.
 * Classe modélisant le plateau du jeu.
 */
public class Piece {

    private Case[] cases;

    public Piece() {

        this.cases = new Case[100];

        int caseNid= (int) (Math.random()*100);
        int caseObjetADetruire = (int) (Math.random()*100);
        int nbRobots= (int) ((Math.random())*10)+1;
        int tailleObjetADetruire = (int) (Math.random()*100)+1;

        while(caseObjetADetruire==caseNid) {
            caseObjetADetruire= (int) (Math.random()*100);
        }

        int i=0;

            for(int j=0;j<10;j++) {
                for (int k = 0; k < 10; k++) {

                    if (!(i >= this.cases.length)) {

                        if (j % 10 == 1 && k % 10 == 1) {
                            cases[i] = new Case('B', 1, null);
                        } else if (j % 10 == 1 && k % 10 == 2) {
                            cases[i] = new Case('B', 2, null);
                        } else if (j % 10 == 1 && k % 10 == 3) {
                            cases[i] = new Case('B', 3, null);
                        } else if (j % 10 == 1 && k % 10 == 4) {
                            cases[i] = new Case('B', 4, null);
                        } else if (j % 10 == 1 && k % 10 == 5) {
                            cases[i] = new Case('B', 5, null);
                        } else if (j % 10 == 1 && k % 10 == 6) {
                            cases[i] = new Case('B', 6, null);
                        } else if (j % 10 == 1 && k % 10 == 7) {
                            cases[i] = new Case('B', 7, null);
                        } else if (j % 10 == 1 && k % 10 == 8) {
                            cases[i] = new Case('B', 8, null);
                        } else if (j % 10 == 1 && k % 10 == 9) {
                            cases[i] = new Case('B', 9, null);
                        } else if (j % 10 == 1 && k % 10 == 0) {
                            cases[i] = new Case('B', 0, null);
                        } else if (j % 10 == 2 && k % 10 == 1) {
                            cases[i] = new Case('C', 1, null);
                        } else if (j % 10 == 2 && k % 10 == 2) {
                            cases[i] = new Case('C', 2, null);
                        } else if (j % 10 == 2 && k % 10 == 3) {
                            cases[i] = new Case('C', 3, null);
                        } else if (j % 10 == 2 && k % 10 == 4) {
                            cases[i] = new Case('C', 4, null);
                        } else if (j % 10 == 2 && k % 10 == 5) {
                            cases[i] = new Case('C', 5, null);
                        } else if (j % 10 == 2 && k % 10 == 6) {
                            cases[i] = new Case('C', 6, null);
                        } else if (j % 10 == 2 && k % 10 == 7) {
                            cases[i] = new Case('C', 7, null);
                        } else if (j % 10 == 2 && k % 10 == 8) {
                            cases[i] = new Case('C', 8, null);
                        } else if (j % 10 == 2 && k % 10 == 9) {
                            cases[i] = new Case('C', 9, null);
                        } else if (j % 10 == 2 && k % 10 == 0) {
                            cases[i] = new Case('C', 0, null);
                        } else if (j % 10 == 3 && k % 10 == 1) {
                            cases[i] = new Case('D', 1, null);
                        } else if (j % 10 == 3 && k % 10 == 2) {
                            cases[i] = new Case('D', 2, null);
                        } else if (j % 10 == 3 && k % 10 == 3) {
                            cases[i] = new Case('D', 3, null);
                        } else if (j % 10 == 3 && k % 10 == 4) {
                            cases[i] = new Case('D', 4, null);
                        } else if (j % 10 == 3 && k % 10 == 5) {
                            cases[i] = new Case('D', 5, null);
                        } else if (j % 10 == 3 && k % 10 == 6) {
                            cases[i] = new Case('D', 6, null);
                        } else if (j % 10 == 3 && k % 10 == 7) {
                            cases[i] = new Case('D', 7, null);
                        } else if (j % 10 == 3 && k % 10 == 8) {
                            cases[i] = new Case('D', 8, null);
                        } else if (j % 10 == 3 && k % 10 == 9) {
                            cases[i] = new Case('D', 9, null);
                        } else if (j % 10 == 3 && k % 10 == 0) {
                            cases[i] = new Case('D', 0, null);
                        } else if (j % 10 == 4 && k % 10 == 1) {
                            cases[i] = new Case('E', 1, null);
                        } else if (j % 10 == 4 && k % 10 == 2) {
                            cases[i] = new Case('E', 2, null);
                        } else if (j % 10 == 4 && k % 10 == 3) {
                            cases[i] = new Case('E', 3, null);
                        } else if (j % 10 == 4 && k % 10 == 4) {
                            cases[i] = new Case('E', 4, null);
                        } else if (j % 10 == 4 && k % 10 == 5) {
                            cases[i] = new Case('E', 5, null);
                        } else if (j % 10 == 4 && k % 10 == 6) {
                            cases[i] = new Case('E', 6, null);
                        } else if (j % 10 == 4 && k % 10 == 7) {
                            cases[i] = new Case('E', 7, null);
                        } else if (j % 10 == 4 && k % 10 == 8) {
                            cases[i] = new Case('E', 8, null);
                        } else if (j % 10 == 4 && k % 10 == 9) {
                            cases[i] = new Case('E', 9, null);
                        } else if (j % 10 == 4 && k % 10 == 0) {
                            cases[i] = new Case('E', 0, null);
                        } else if (j % 10 == 5 && k % 10 == 1) {
                            cases[i] = new Case('F', 1, null);
                        } else if (j % 10 == 5 && k % 10 == 2) {
                            cases[i] = new Case('F', 2, null);
                        } else if (j % 10 == 5 && k % 10 == 3) {
                            cases[i] = new Case('F', 3, null);
                        } else if (j % 10 == 5 && k % 10 == 4) {
                            cases[i] = new Case('F', 4, null);
                        } else if (j % 10 == 5 && k % 10 == 5) {
                            cases[i] = new Case('F', 5, null);
                        } else if (j % 10 == 5 && k % 10 == 6) {
                            cases[i] = new Case('F', 6, null);
                        } else if (j % 10 == 5 && k % 10 == 7) {
                            cases[i] = new Case('F', 7, null);
                        } else if (j % 10 == 5 && k % 10 == 8) {
                            cases[i] = new Case('F', 8, null);
                        } else if (j % 10 == 5 && k % 10 == 9) {
                            cases[i] = new Case('F', 9, null);
                        } else if (j % 10 == 5 && k % 10 == 0) {
                            cases[i] = new Case('F', 0, null);
                        } else if (j % 10 == 6 && k % 10 == 1) {
                            cases[i] = new Case('G', 1, null);
                        } else if (j % 10 == 6 && k % 10 == 2) {
                            cases[i] = new Case('G', 2, null);
                        } else if (j % 10 == 6 && k % 10 == 3) {
                            cases[i] = new Case('G', 3, null);
                        } else if (j % 10 == 6 && k % 10 == 4) {
                            cases[i] = new Case('G', 4, null);
                        } else if (j % 10 == 6 && k % 10 == 5) {
                            cases[i] = new Case('G', 5, null);
                        } else if (j % 10 == 6 && k % 10 == 6) {
                            cases[i] = new Case('G', 6, null);
                        } else if (j % 10 == 6 && k % 10 == 7) {
                            cases[i] = new Case('G', 7, null);
                        } else if (j % 10 == 6 && k % 10 == 8) {
                            cases[i] = new Case('G', 8, null);
                        } else if (j % 10 == 6 && k % 10 == 9) {
                            cases[i] = new Case('G', 9, null);
                        } else if (j % 10 == 6 && k % 10 == 0) {
                            cases[i] = new Case('G', 0, null);
                        } else if (j % 10 == 7 && k % 10 == 1) {
                            cases[i] = new Case('H', 1, null);
                        } else if (j % 10 == 7 && k % 10 == 2) {
                            cases[i] = new Case('H', 2, null);
                        } else if (j % 10 == 7 && k % 10 == 3) {
                            cases[i] = new Case('H', 3, null);
                        } else if (j % 10 == 7 && k % 10 == 4) {
                            cases[i] = new Case('H', 4, null);
                        } else if (j % 10 == 7 && k % 10 == 5) {
                            cases[i] = new Case('H', 5, null);
                        } else if (j % 10 == 7 && k % 10 == 6) {
                            cases[i] = new Case('H', 6, null);
                        } else if (j % 10 == 7 && k % 10 == 7) {
                            cases[i] = new Case('H', 7, null);
                        } else if (j % 10 == 7 && k % 10 == 8) {
                            cases[i] = new Case('H', 8, null);
                        } else if (j % 10 == 7 && k % 10 == 9) {
                            cases[i] = new Case('H', 9, null);
                        } else if (j % 10 == 7 && k % 10 == 0) {
                            cases[i] = new Case('H', 0, null);
                        } else if (j % 10 == 8 && k % 10 == 1) {
                            cases[i] = new Case('I', 1, null);
                        } else if (j % 10 == 8 && k % 10 == 2) {
                            cases[i] = new Case('I', 2, null);
                        } else if (j % 10 == 8 && k % 10 == 3) {
                            cases[i] = new Case('I', 3, null);
                        } else if (j % 10 == 8 && k % 10 == 4) {
                            cases[i] = new Case('I', 4, null);
                        } else if (j % 10 == 8 && k % 10 == 5) {
                            cases[i] = new Case('I', 5, null);
                        } else if (j % 10 == 8 && k % 10 == 6) {
                            cases[i] = new Case('I', 6, null);
                        } else if (j % 10 == 8 && k % 10 == 7) {
                            cases[i] = new Case('I', 7, null);
                        } else if (j % 10 == 8 && k % 10 == 8) {
                            cases[i] = new Case('I', 8, null);
                        } else if (j % 10 == 8 && k % 10 == 9) {
                            cases[i] = new Case('I', 9, null);
                        } else if (j % 10 == 8 && k % 10 == 0) {
                            cases[i] = new Case('I', 0, null);
                        } else if (j % 10 == 9 && k % 10 == 1) {
                            cases[i] = new Case('J', 1, null);
                        } else if (j % 10 == 9 && k % 10 == 2) {
                            cases[i] = new Case('J', 2, null);
                        } else if (j % 10 == 9 && k % 10 == 3) {
                            cases[i] = new Case('J', 3, null);
                        } else if (j % 10 == 9 && k % 10 == 4) {
                            cases[i] = new Case('J', 4, null);
                        } else if (j % 10 == 9 && k % 10 == 5) {
                            cases[i] = new Case('J', 5, null);
                        } else if (j % 10 == 9 && k % 10 == 6) {
                            cases[i] = new Case('J', 6, null);
                        } else if (j % 10 == 9 && k % 10 == 7) {
                            cases[i] = new Case('J', 7, null);
                        } else if (j % 10 == 9 && k % 10 == 8) {
                            cases[i] = new Case('J', 8, null);
                        } else if (j % 10 == 9 && k % 10 == 9) {
                            cases[i] = new Case('J', 9, null);
                        } else if (j % 10 == 9 && k % 10 == 0) {
                            cases[i] = new Case('J', 0, null);
                        } else if (j % 10 == 0 && k % 10 == 1) {
                            cases[i] = new Case('A', 1, null);
                        } else if (j % 10 == 0 && k % 10 == 2) {
                            cases[i] = new Case('A', 2, null);
                        } else if (j % 10 == 0 && k % 10 == 3) {
                            cases[i] = new Case('A', 3, null);
                        } else if (j % 10 == 0 && k % 10 == 4) {
                            cases[i] = new Case('A', 4, null);
                        } else if (j % 10 == 0 && k % 10 == 5) {
                            cases[i] = new Case('A', 5, null);
                        } else if (j % 10 == 0 && k % 10 == 6) {
                            cases[i] = new Case('A', 6, null);
                        } else if (j % 10 == 0 && k % 10 == 7) {
                            cases[i] = new Case('A', 7, null);
                        } else if (j % 10 == 0 && k % 10 == 8) {
                            cases[i] = new Case('A', 8, null);
                        } else if (j % 10 == 0 && k % 10 == 9) {
                            cases[i] = new Case('A', 9, null);
                        } else if (j % 10 == 0 && k % 10 == 0) {
                            cases[i] = new Case('A', 0, null);
                        }
                        i++;
                    }
                }
            }
        for(int l=0;l<cases.length;l++) {
            if(l==caseNid) {
                cases[l].setAbstractObject(new Nid(cases[l], nbRobots));
                cases[l].setOccupe(true);
            }
            if(l==caseObjetADetruire) {
                cases[l].setAbstractObject(new ObjetADetruire(cases[l], tailleObjetADetruire));
                cases[l].setOccupe(true);
            }
        }
    }

    public Case[] getCases() {
        return cases;
    }
}