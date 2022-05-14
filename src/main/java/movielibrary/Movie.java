package movielibrary;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String tytul;
    int rokWydania;
    Director director;
    List<Actor> actorList = new ArrayList<>();
    Genere genere;

    public Movie(String tytul, int rokWydania, Director director, Genere genere, List<Actor> actorList) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.director = director;
        this.actorList = actorList;
        this.genere = genere;
    }

    public Movie(String tytul, int rokWydania, Director director, Genere genere) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.director = director;
        this.genere = genere;
    }

    public void addActor(Actor actor) {
        actorList.add(actor);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tytul='" + tytul + '\'' +
                ", genere=" + genere +
                ", rokWydania=" + rokWydania +
                ", director=" + director +
                ", Aktorzy: " + actorList +
                '}';
    }

    public boolean isActorOnTheList(Actor actor) {
        return actorList.contains(actor);
    }
}
