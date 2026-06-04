import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;

        System.out.println("В театре новый(ая) " + this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                (height == otherActor.height);
    }

    @Override
    public int hashCode() {
        int hash = 17;

        if (name != null) {
            hash = hash + name.hashCode();
        }
        hash = hash * 31;

        if (surname != null) {
            hash = hash + surname.hashCode();
        }

        if (height != 0) {
            hash = hash + height;
        }

        return hash;
    }

    @Override
    public String toString() {
        return "актер/актриса:" +
                " имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                " (" + height + " см)";
    }
}

