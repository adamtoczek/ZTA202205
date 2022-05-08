package wzorzecProjektowy;

public class BMW implements ISamochod{
    int cena = 200000;
    int maxPredkosc = 200;
    String kolor = "czarny";
    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}
