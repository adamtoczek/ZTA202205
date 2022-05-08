public class Uczniowie {
    public static void main(String[] args) {
        Student michal = new Student();
        michal.imie = "Michal";
        michal.nazwisko = "Piorkowski";
        michal.srednia = 4.7;
        michal.wynikMatury = 180;
        michal.numerIndeksu = "846219";

        Licealista pawel = new Licealista();
        pawel.imie = "Pawel";
        pawel.nazwisko = "Kowalski";
        pawel.srednia = 3.25;
        pawel.wynikMatury = 143;


    }
}


class Uczen {
    String imie;
    String nazwisko;
}
class Podstawowkarz extends Uczen {
    double srednia;
}

class Licealista extends Podstawowkarz {
    int wynikMatury;
}

class Student extends Licealista {
    String numerIndeksu;
}