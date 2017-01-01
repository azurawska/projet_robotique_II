/**
 * Created by alexis on 01/01/2017.
 */
public class Robot extends AbstractObject {

    private int nbPointsVie;

    public Robot(Case position, int nbPointsVie) {
        super(position);
        this.nbPointsVie = nbPointsVie;
    }

    public int getNbPointsVie() {
        return nbPointsVie;
    }

    public void setNbPointsVie(int nbPointsVie) {
        this.nbPointsVie = nbPointsVie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Robot robot = (Robot) o;

        return nbPointsVie == robot.nbPointsVie;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + nbPointsVie;
        return result;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nbPointsVie=" + nbPointsVie +
                '}';
    }
}