public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;

        System.out.println("В театре новый(ая) " + this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();

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

