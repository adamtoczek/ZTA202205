
public class Uczniowie {
    public static void main(String[] args) {
        Student michal = new Student("Michal", "Piotrkowski", 4.7, 180, "8465197");
        Licealista pawel = new Licealista("Pawel", "Kowalski", 3.25, 143);
        String imie = michal.imie;
        String nazwisko = michal.nazwisko;


    }
}


abstract class Uczen {
    public String imie;
    protected String nazwisko;
    public static final String PESEL = "123456";

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public abstract void recytuj();
}
class Podstawowkarz extends Uczen {
    double srednia;

    public Podstawowkarz(String imie, String nazwisko, double srednia) {
        super(imie, nazwisko);
        this.srednia = srednia;

    }


    @Override
    public void recytuj() {
        System.out.println("Pieksnie recytuje");
        System.out.println(imie);
        System.out.println(nazwisko);
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