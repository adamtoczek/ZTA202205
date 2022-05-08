public class Konstruktor {
    public static void main(String[] args) {

        Samochod auto1 = new Samochod(); //po staremu z domyslnym konstruktorem
        auto1.kolor = "czerwony";
        auto1.marka = "skoda";
        auto1.rokProdukcji = 1984;

        SamochodNowy auto2 = new SamochodNowy("czerwony", "skoda", 1984);
        SamochodNowy auto3 = new SamochodNowy("zielony", "bmw", -2000);

    }

}

class Samochod{
    int rokProdukcji;
    String marka;
    String kolor;
}

class SamochodNowy{
    int rokProdukcji;
    String marka;
    String kolor;

    public SamochodNowy(String kolor, String marka, int rokProdukcji) {
        this.kolor = kolor;
        this.marka = marka;
        this.setRokProdukcji(rokProdukcji);
    }

    public void setRokProdukcji(int rokProdukcji) {
        if (rokProdukcji < 1900)
            this.rokProdukcji = 1900;
        else
            this.rokProdukcji = rokProdukcji;
    }
}