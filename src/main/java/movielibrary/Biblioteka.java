package movielibrary;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Biblioteka {
    public static void main(String[] args) {
        MovieLibrary lib = new MovieLibrary();
        Director polanski = new Director("Roman", "Polanski");
        Director woodyAllen = new Director("Woody", "Allen");
        Director dir3 = new Director("Wladyslaw", "Pasikowski");
        Director dir4 = new Director("Luc", "Besson");

        Actor a1 = new Actor("Jean", "Reno");
        Actor a2 = new Actor("Louis", "de Funes");
        Actor a3 = new Actor("Brad", "Pitt");
        Actor a4 = new Actor("Angelina", "Jolie");
        Actor a5 = new Actor("Isabela", "Skorupko");

        Movie goldenEye = new Movie("Golden Eye", 1995, dir3, Genere.THRILLER);
        goldenEye.addActor(a5);
        goldenEye.addActor(a1);
        goldenEye.addActor(a2);

        Movie graniceWytrzymalosci = new Movie("Granice Wytrzymalosci", 1989, woodyAllen, Genere.KOMEDIA);
        graniceWytrzymalosci.addActor(a5);
        graniceWytrzymalosci.addActor(a4);
        graniceWytrzymalosci.addActor(a3);

        Movie ogniemMieczem = new Movie("Ogniem i Mieczem", 1999, polanski, Genere.DRAMAT, Arrays.asList(new Actor[]{a1, a2, a3}));
        Movie naNoze = new Movie("Na noze", 2021, dir3, Genere.THRILLER, List.of(a2, a5, a1, a4));
        Movie wielkiBlekit = new Movie("Wielki Blekit", 1989, dir4, Genere.DRAMAT, List.of(a1, a3, a4));

        lib.add(goldenEye);
        lib.add(graniceWytrzymalosci);
        lib.add(ogniemMieczem);
        lib.add(naNoze);
        lib.add(wielkiBlekit);


        Scanner input = new Scanner(System.in);
        boolean isExit = false;
        String inputCommand;

        System.out.println("Komendy: " +
                "\ne - wyjscie\n" +
                "d - szukaj wg dat\n" +
                "r - pokaz losowy film\n" +
                "a - szukaj wg aktora\n");

        while(!isExit) {
            System.out.print("Podaj komende: ");
            inputCommand = input.nextLine();

            switch (inputCommand) {
                case "e" : isExit = true;
                break;
                case "d" :
                    System.out.println("Podaj date poczatkowa");
                    int start = Integer.parseInt(input.nextLine());
                    System.out.println("Podaj date koncowa");
                    int end = Integer.parseInt(input.nextLine());
                    lib.showMoviesBetweenDates(start, end);
                    break;
                case "r" :
                    lib.showRandomMovieDetails();
                    break;
                case "a" :
                    System.out.println("Podaj imie");
                    String imie = input.nextLine();
                    System.out.println("Podaj nazwisko");
                    String nazwiko = input.nextLine();
                    lib.showMoviesWithActor(imie, nazwiko);
                    break;

            }


        }



    }
}
