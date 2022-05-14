package movielibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class MovieLibrary {
    List<Movie> listaFilmow = new ArrayList<>();

    public void add (Movie movie) {
        listaFilmow.add(movie);
    }

    public List<Movie> getMoviesBetweenDates(int startYear, int endYear) {
        List<Movie> tmp = new ArrayList<>();
//        for (Movie item : listaFilmow) {
//            if (item.rokWydania >= startYear && item.rokWydania <= endYear)
//                tmp.add(item);
//        }
        // druga wersja filtrowania z uzyciem stream i lambdy
         tmp = listaFilmow.stream().filter(item -> item.rokWydania >= startYear && item.rokWydania <= endYear).collect(Collectors.toList());
        return tmp;
    }


    public void showMoviesBetweenDates(int startYear, int endYear) {
        for (Movie item : getMoviesBetweenDates(startYear, endYear)) {
                System.out.println(item);
        }
    }

    public void showRandomMovieDetails() {
        int r = ThreadLocalRandom.current().nextInt(0, listaFilmow.size());
        System.out.println(listaFilmow.get(r));
    }

    public List<Movie> getMoviesByActor(String imie, String nazwisko) {
        Actor tmpActor = new Actor(imie, nazwisko);
        List<Movie> tmp = new ArrayList<>();
        for (Movie item : listaFilmow)
            if (item.isActorOnTheList(tmpActor))
                tmp.add(item);
        return tmp;
    }

    public void showMoviesWithActor(String imie, String nazwisko) {
        for (Movie item : getMoviesByActor(imie, nazwisko))
            System.out.println(item.tytul);
    }



}
