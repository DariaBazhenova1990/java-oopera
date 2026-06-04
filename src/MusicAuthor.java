public class MusicAuthor extends Person {
    public MusicAuthor(String name, String surname, Gender gender) {
        super(name, surname, gender);

        System.out.println("В театре новый(ая) " + this);
    }

    @Override
    public String toString() {
        return "композитор:" +
                " имя='" + name + '\'' +
                ", фамилия='" + surname + '\'';
    }
}
