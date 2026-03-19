import java.util.ArrayList;
import java.util.Arrays;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public ArrayList<Actor> addActorInList(Actor newActor) {
            if (listOfActors.contains(newActor)) {
                System.out.println("Актёр уже есть в спектакле.");
            } else  {
                listOfActors.add(newActor);
                System.out.println("Актёр: " + newActor.name + " " + newActor.surname +
                        " добавлен в спектакль " + this.title + ".");
            }
        return listOfActors;
    }

    public void changeActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Такого актёра нет в списке.");
    }

    public void printDirector() {
        System.out.println(director);
    }

}
