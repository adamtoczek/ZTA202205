package wzorzecProjektowy;

public class Merceded implements ISamochod{
    int cena = 250000;
    int maxPredkosc = 195;
    String kolor = "granatowy";

    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}
