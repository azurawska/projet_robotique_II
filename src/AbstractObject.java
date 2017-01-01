/**
 * Created by alexis on 01/01/2017.
 */
public abstract class AbstractObject {

    private Case position;

    @Override
    public String toString() {
        return "AbstractObject{" +
                "position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractObject that = (AbstractObject) o;

        return position.equals(that.position);

    }

    @Override
    public int hashCode() {
        return position.hashCode();
    }

    public Case getPosition() {

        return position;
    }

    public void setPosition(Case position) {
        this.position = position;
    }

    public AbstractObject(Case position) {

        this.position = position;
    }
}