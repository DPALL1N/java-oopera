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
        return Objects.equals(name, actor.name) && Objects.equals(surname, actor.surname) &&
                Objects.equals(height, actor.height) && Objects.equals(gender, actor.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }
}
