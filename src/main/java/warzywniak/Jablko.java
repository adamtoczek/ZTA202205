package warzywniak;

public class Jablko extends Owoc {
    public Jablko() {
        kolor = "czerwony";
        cena = 3;
    }

    @Override
    public String toString() {
        return "Jablko jest "+kolor+" i kosztuje "+cena+"pln";
    }
}
