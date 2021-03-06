/**
 * Created by alexis on 01/01/2017.
 * Classe modélisant chaque case du plateau de notre jeu.
 */
public class Case {

    private char lettre;
    private int num;
    private boolean occupe;
    private AbstractObject abstractObject;

    public Case(char lettre, int num, AbstractObject abstractObject) {
        this.lettre = lettre;
        this.num = num;
        this.abstractObject=abstractObject;
        this.occupe=false;
    }

    public Case(char lettre, int num, boolean occupe) {
        this.lettre=lettre;
        this.num=num;
        this.occupe=occupe;
    }

    public char getLettre() {
        return lettre;
    }

    public void setLettre(char lettre) {
        this.lettre = lettre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }

    public AbstractObject getAbstractObject() {
        return abstractObject;
    }

    public void setAbstractObject(AbstractObject abstractObject) {
        this.abstractObject = abstractObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Case aCase = (Case) o;

        if (lettre != aCase.lettre) return false;
        if (num != aCase.num) return false;
        if (occupe != aCase.occupe) return false;
        return abstractObject != null ? abstractObject.equals(aCase.abstractObject) : aCase.abstractObject == null;

    }

    @Override
    public int hashCode() {
        int result = (int) lettre;
        result = 31 * result + num;
        result = 31 * result + (occupe ? 1 : 0);
        result = 31 * result + (abstractObject != null ? abstractObject.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Case{" +
                "lettre=" + lettre +
                ", num=" + num +
                ", occupe=" + occupe +
                ", abstractObject=" + abstractObject +
                '}';
    }

    public int retournerNumeroLettre(char lettre) {

        if(lettre=='A') {
            return 0;
        }
        else if(lettre=='B') {
            return 1;
        }
        else if(lettre=='C') {
            return 2;
        }
        else if(lettre=='D') {
            return 3;
        }
        else if(lettre=='E') {
            return 4;
        }
        else if(lettre=='F') {
            return 5;
        }
        else if(lettre=='G') {
            return 6;
        }
        else if(lettre=='H') {
            return 7;
        }
        else if(lettre=='I') {
            return 8;
        }
        else {
            return 9;
        }
    }
}