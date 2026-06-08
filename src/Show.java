import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printListOfActors() {
        System.out.println("Список актеров спектакля '" + this.title + "\':");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirectorInfo() {
        System.out.println("Информация о режиссере спектакля '" + this.title + "\':");
        System.out.println(this.director);
    }

    public void addActorToShow(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Такой актер уже принимает участие в спектакле!");
                break;
            }
        }

        listOfActors.add(newActor);
        System.out.println(newActor + " добавлен(а) в спектакль '" + this.title + "\'.");

    }

    public void replaceActor(Actor newActor, String existedActorSurname) {
        boolean isReplaced = false;
        System.out.println("Заменяем актера в спектакле '" + this.title + "\'.");
        for (Actor actor : listOfActors) {
            String actorSurname = actor.getSurname();
            if (actorSurname.equals(existedActorSurname)) {
                int index = listOfActors.indexOf(actor);
                listOfActors.set(index, newActor);
                isReplaced = true;
                System.out.println("Исключен:");
                System.out.println(existedActorSurname);
                System.out.println("Добавлен:");
                System.out.println(newActor);
                break;
            }
        }

        if (!isReplaced) {
            System.out.println("Выбранного на замену актера (" + existedActorSurname + ") нет в списке актеров спектакля!");
        }

    }

}
