/**
 * Created by alexis on 01/01/2017.
 */
public class ObjetADetruire extends AbstractObject {

    private int taille;

    public ObjetADetruire(Case position, int taille) {
        super(position);
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ObjetADetruire that = (ObjetADetruire) o;

        return taille == that.taille;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + taille;
        return result;
    }

    @Override
    public String toString() {
        return "ObjetADetruire{" +
                "taille=" + taille +
                '}';
    }
}