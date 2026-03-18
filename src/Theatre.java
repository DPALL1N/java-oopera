public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Ургант", Gender.MALE, 195);
        Actor actor2 = new Actor("Джонни", "Депп", Gender.MALE, 175);
        Actor actor3 = new Actor("Кира", "Найтли", Gender.FEMALE, 165);

        Director director1 = new Director("Кристофер", "Нолан", Gender.MALE, 10);
        Director director2 = new Director("Стивен", "Спилберг", Gender.MALE, 15);

        Person musicAuthor = new Person("Ханс", "Циммер", Gender.MALE);
        Person choreographer = new Person("Мэтью", "Борн", Gender.MALE);

        Show drama = new Show("Интерстеллар", 180, director1);
        Opera opera = new Opera("Щелкунчик", 120, director2, musicAuthor,
                "Хор: Хорошенькая пара, так чинно, благородно...\n" +
                "Томский: Чего ты смотришь на них?\n" +
                "Герман: (угрюмо) Не знаю. Всю ночь не спал.\n" +
                "Томский: Опять карты?\n" +
                "Герман: Хуже... Я влюбился.\n", 20);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director2, musicAuthor,
                "Эльза: (поет, ария)\n" +
                "Вновь тишина... лишь скрип полов.\n" +
                "Здесь время остановило бег.\n" +
                "О, если б знать секрет отцов,\n" +
                "О, если б смелость обрести навек!\n", choreographer);

        drama.addActorInList(actor1);
        drama.addActorInList(actor2);
        drama.addActorInList(actor3);
        System.out.println();
        opera.addActorInList(actor1);
        opera.addActorInList(actor2);
        System.out.println();
        ballet.addActorInList(actor1);
        ballet.addActorInList(actor3);
        System.out.println();
        drama.printListOfActors();
        System.out.println();
        opera.printListOfActors();
        System.out.println();
        ballet.printListOfActors();
        System.out.println();
        opera.changeActor(actor3, "Депп");
        ballet.changeActor(actor2, "Бей");
        System.out.println();
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
