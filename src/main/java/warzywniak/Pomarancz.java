package warzywniak;

public class Pomarancz extends Owoc {
    public Pomarancz() {
        kolor="pomaranczowy";
        cena = 4;
    }

    @Override
    public String toString() {
        return "Pomarancza jest "+kolor+" i kosztuje "+cena+"pln";
    }
}
