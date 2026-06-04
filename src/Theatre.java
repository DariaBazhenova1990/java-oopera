public class Theatre {

    public static void main(String[] args) {

        String separator = "-".repeat(100);

        Actor leadMaleActor = new Actor("Брэд", "Питт", Gender.MALE, 180);
        Actor leadFemaleActor = new Actor("Джулия", "Робертс", Gender.FEMALE, 173);
        Actor supportingMaleActor = new Actor("Мэтт", "Деймон", Gender.MALE, 178);
        System.out.println(separator);

        Director mainDirector = new Director("Стивен", "Содерберг", Gender.MALE, 37);
        Director coDirector = new Director("София", "Коппола", Gender.FEMALE, 9);
        System.out.println(separator);

        MusicAuthor musicAuthor = new MusicAuthor("Дэвид", "Холмс", Gender.MALE);
        Choreographer choreographer = new Choreographer("Басби", "Беркли", Gender.MALE);
        System.out.println(separator);

        Show show = new Show("Горе от ума", 100500, mainDirector);
        show.addActorToShow(leadMaleActor);
        show.addActorToShow(leadFemaleActor);
        show.printListOfActors();
        System.out.println(separator);

        Ballet ballet = new Ballet("Щелкунчик", 120, mainDirector, musicAuthor,
                "Либретто балета", choreographer);
        ballet.addActorToShow(supportingMaleActor);
        ballet.addActorToShow(leadFemaleActor);
        ballet.printListOfActors();
        System.out.println(separator);

        Opera opera = new Opera("Иоланта", 180, coDirector, musicAuthor, "Оперное либретто",
                100);
        opera.addActorToShow(leadMaleActor);
        opera.addActorToShow(leadFemaleActor);
        opera.printListOfActors();
        System.out.println(separator);

        show.replaceActor(supportingMaleActor, leadMaleActor);
        show.printListOfActors();
        System.out.println(separator);

        Actor doctorWho = new Actor("Anonimous", "Who", Gender.MALE, 250);
        ballet.replaceActor(doctorWho, leadMaleActor);
        System.out.println(separator);

        ballet.printLibrettoText();
        opera.printLibrettoText();

    }
}
