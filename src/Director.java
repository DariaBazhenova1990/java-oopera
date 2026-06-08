public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;

        System.out.println("В театре новый " + this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();

        if (numberOfShows != 0) {
            hash = hash + numberOfShows;
        }

        return hash;
    }

    @Override
    public String toString() {
        return "режиссер:" +
                " имя='" + name + '\'' +
                ", фамилия='" + surname + '\'';
    }

}
