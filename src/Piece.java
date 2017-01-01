

/**
 * Created by alexis on 01/01/2017.
 * Classe modélisant le plateau du jeu.
 */
public class Piece {

    private Case[] cases;

    public Piece() {

        this.cases = new Case[100];
    }

    public Case[] getCases() {
        return cases;
    }
}