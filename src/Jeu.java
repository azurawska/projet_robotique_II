/**
 * Created by alexis on 12/01/2017.
 */
public class Jeu {

    private Piece piece;

    public Jeu() {
        this.piece=new Piece();
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jeu jeu = (Jeu) o;

        return piece.equals(jeu.piece);

    }

    @Override
    public int hashCode() {
        return piece.hashCode();
    }

    @Override
    public String toString() {
        return "Jeu{" +
                "piece=" + piece +
                '}';
    }
}