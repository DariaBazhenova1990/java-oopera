import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
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

        return hash;
    }

    @Override
    public String toString() {
        return "сотрудник:" +
                " имя='" + name + '\'' +
                ", фамилия='" + surname + '\'';
    }

}
