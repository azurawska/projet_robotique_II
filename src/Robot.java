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
        this.nbPointsVie = this.nbPointsVie - nbPointsVie;
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

    public boolean estMort() {
        if(nbPointsVie==0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void robotDetruit() {
        System.out.println("Le robot situé à la position (" + this.getPosition().getLettre()+this.getPosition().getNum() + ") est mort.");
    }

    public void communiquerMessage(Robot robot, String message) {

    }

    public void deplacement(Case position) {
        this.setPosition(position);
    }

    public boolean ilYACollision(Case position) {
        if(this.getPosition().equals(position) && position.isOccupe()==true) {
            return true;
        }
        else {
            return false;
        }
    }
}