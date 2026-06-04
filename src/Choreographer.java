public class Choreographer extends Person {
    public Choreographer(String name, String surname, Gender gender) {
        super(name, surname, gender);

        System.out.println("В театре новый(ая) " + this);
    }

    @Override
    public String toString() {
        return "хореограф:" +
                " имя='" + name + '\'' +
                ", фамилия='" + surname + '\'';
    }
}
