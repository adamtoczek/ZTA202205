public class Uczniowie {
    public static void main(String[] args) {
        Student michal = new Student("Michal", "Piotrkowski", 4.7, 180, "8465197");
        Licealista pawel = new Licealista("Pawel", "Kowalski", 3.25, 143);

    }
}


class Uczen {
    String imie;
    String nazwisko;

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
class Podstawowkarz extends Uczen {
    double srednia;

    public Podstawowkarz(String imie, String nazwisko, double srednia) {
        super(imie, nazwisko);
        this.srednia = srednia;
    }
}

class Licealista extends Podstawowkarz {
    int wynikMatury;

    public Licealista(String imie, String nazwisko, double srednia, int wynikMatury) {
        super(imie, nazwisko, srednia);
        this.wynikMatury = wynikMatury;
    }
}

class Student extends Licealista {
    String numerIndeksu;

    public Student(String imie, String nazwisko, double srednia, int wynikMatury, String numerIndeksu) {
        super(imie, nazwisko, srednia, wynikMatury);
        this.numerIndeksu = numerIndeksu;
    }
}