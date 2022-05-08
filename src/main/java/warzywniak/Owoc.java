package warzywniak;

public abstract class Owoc implements IOwoce{
    int cena;
    int waga;
    String kolor;

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }


}
