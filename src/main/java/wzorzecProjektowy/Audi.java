package wzorzecProjektowy;

public class Audi implements ISamochod{
    int cena = 150000;
    int maxPredkosc = 190;
    String kolor = "srebrny";

    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}
