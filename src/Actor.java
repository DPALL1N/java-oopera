import java.util.Objects;

public class Actor extends Person {

    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(getName(), actor.getName()) && Objects.equals(getSurname(), actor.getSurname()) &&
                Objects.equals(getHeight(), actor.getHeight()) && Objects.equals(getGender(), actor.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getGender(), getHeight());
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + getHeight() + ")";
    }
}
