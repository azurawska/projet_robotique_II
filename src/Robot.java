import java.util.ArrayList;

/**
 * Created by alexis on 01/01/2017.
 */
public class Robot extends AbstractObject {

    private int nbPointsVie;
    private int rayon;
    private ArrayList<String> messagesRecus;

    public Robot(Case position, int nbPointsVie, int rayon) {
        super(position);
        this.nbPointsVie=nbPointsVie;
        this.rayon=rayon;
        this.messagesRecus=new ArrayList<String>();
    }

    public ArrayList<String> getMessagesRecus() {
        return messagesRecus;
    }

    public void setMessagesRecus(ArrayList<String> messagesRecus) {
        this.messagesRecus = messagesRecus;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
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
        if(this.nbPointsVie==0) {
            return true;
        }
        else {
            return false;
        }
    }

    private void robotDetruit() {
        System.out.println("Le robot situé à la position (" + this.getPosition().getLettre()+this.getPosition().getNum() + ") est mort.");
    }

    public void communiquerMessage(Robot robot, String message) {
        robot.getMessagesRecus().add(message);
        this.setNbPointsVie(1);
        boolean robotMort=estMort();
        if(robotMort) {
            robotDetruit();
        }
    }

    public void deplacement() {

        int deplacement= (int) (Math.random()*6);

        switch (deplacement) {
            case 0:
                this.setPosition(new Case(this.getPosition().getLettre(), this.getPosition().getNum()+1, true));
                this.setNbPointsVie(1);
                if(estMort()) {
                    robotDetruit();
                }
                break;
            case 1:
                this.setPosition(new Case(this.getPosition().getLettre(), this.getPosition().getNum()-1, true));
                this.setNbPointsVie(1);
                if(estMort()) {
                    robotDetruit();
                }
                break;
            case 2:
                this.setPosition(new Case((char) (this.getPosition().getLettre()+1), this.getPosition().getNum(), true));
                this.setNbPointsVie(1);
                if(estMort()) {
                    robotDetruit();
                }
                break;
            case 3:
                this.setPosition(new Case((char) (this.getPosition().getLettre()-1), this.getPosition().getNum(), true));
                this.setNbPointsVie(1);
                if(estMort()) {
                    robotDetruit();
                }
                break;
            case 4:
                this.setPosition(new Case((char) (this.getPosition().getLettre()+1), this.getPosition().getNum()+1, true));
                this.setNbPointsVie(1);
                if(estMort()) {
                    robotDetruit();
                }
                break;
            case 5:
                this.setPosition(new Case((char) (this.getPosition().getLettre()-1), this.getPosition().getNum()-1, true));
                this.setNbPointsVie(1);
                if(estMort()) {
                    robotDetruit();
                }
                break;
            case 6:
                this.setPosition(new Case((char) (this.getPosition().getLettre()+1), this.getPosition().getNum()-1, true));
                this.setNbPointsVie(1);
                if(estMort()) {
                    robotDetruit();
                }
                break;
            default:
                this.setPosition(new Case((char) (this.getPosition().getLettre()-1), this.getPosition().getNum()+1, true));
                this.setNbPointsVie(1);
                if(estMort()) {
                    robotDetruit();
                }
                break;
        }

    }

    public boolean ilYACollision(Case position) {
        if(this.getPosition().equals(position) && position.isOccupe()==true) {
            return true;
        }
        else {
            return false;
        }
    }

    public void exploser() {
        this.nbPointsVie=0;
    }
}