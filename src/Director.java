public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;

        System.out.println("В театре новый " + this);
    }

    @Override
    public String toString() {
        return "режиссер:" +
                " имя='" + name + '\'' +
                ", фамилия='" + surname + '\'';
    }

    public void printDirectorInfo() {
        System.out.println(this);
    }
}
