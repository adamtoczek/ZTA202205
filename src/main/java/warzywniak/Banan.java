package warzywniak;

public class Banan extends Owoc {
    public Banan() {
        kolor="zolty";
        cena = 5;
    }

    @Override
    public String toString() {
        return "Banan jest "+kolor+" i kosztuje "+cena+"pln";
    }
}
