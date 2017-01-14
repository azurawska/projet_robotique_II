/**
 * Created by alexis on 11/01/2017.
 */
public class Main {

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        for(int i=0;i<jeu.getPiece().getCases().length;i++) {
            System.out.println(jeu.getPiece().getCases()[i]);
        }
    }
}