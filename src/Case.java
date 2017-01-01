import java.awt.Point;

/**
 * Created by alexis on 01/01/2017.
 * Classe modélisant chaque case du plateau de notre jeu.
 */
public class Case {

    private Point position;
    private boolean estOccupe;
    private AbstractObject abstractObject;

    public Case(Point position, AbstractObject abstractObject) {
        this.position = position;
        this.abstractObject=abstractObject;
        this.estOccupe=true;
    }

    public Case(Point position) {
        this.position=position;
        this.estOccupe=false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Case aCase = (Case) o;

        if (estOccupe != aCase.estOccupe) return false;
        return position.equals(aCase.position);

    }

    @Override
    public int hashCode() {
        int result = position.hashCode();
        result = 31 * result + (estOccupe ? 1 : 0);
        return result;
    }

    public Point getPosition() {

        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public boolean isEstOccupe() {
        return estOccupe;
    }

    public void setEstOccupe(boolean estOccupe) {
        this.estOccupe = estOccupe;
    }

    public int getX() {
        return (int) this.position.getX();
    }

    public int getY() {
        return (int) this.position.getY();
    }

    @Override
    public String toString() {
        return "Case{" +
                "position=" + position +
                ", estOccupe=" + estOccupe +
                '}';
    }
}