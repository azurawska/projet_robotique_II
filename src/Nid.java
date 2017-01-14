import java.util.Arrays;

/**
 * Created by alexis on 01/01/2017.
 */
public class Nid extends AbstractObject {

    private Robot[] robots;
    private int nbRobots;

    public Nid(Case position, int nbRobots) {
        super(position);
        this.nbRobots = nbRobots;
        this.robots=new Robot[this.nbRobots];

        int nbPointsVieRobot= (int) ((Math.random())*100)+1;
        int rayon = (int) (Math.random()*5)+1;

        for(int i=0;i<this.robots.length;i++) {
            this.robots[i]=new Robot(this.getPosition(), nbPointsVieRobot, rayon);
        }
    }

    public Robot[] getRobots() {
        return robots;
    }

    public void setRobots(Robot[] robots) {
        this.robots = robots;
    }

    public int getNbRobots() {
        return nbRobots;
    }

    public void setNbRobots(int nbRobots) {
        this.nbRobots = nbRobots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Nid nid = (Nid) o;

        if (nbRobots != nid.nbRobots) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(robots, nid.robots);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(robots);
        result = 31 * result + nbRobots;
        return result;
    }

    @Override
    public String toString() {
        return "Nid{" +
                "robots=" + Arrays.toString(robots) +
                ", nbRobots=" + nbRobots +
                '}';
    }
}