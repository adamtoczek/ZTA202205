package wzorzecProjektowy;

public class Auta {
    public static void main(String[] args) {
        ISamochod auto1 = FabrykaSamochodow.getSamochod(110);
        ISamochod autoDlaMlodego = FabrykaSamochodow.getSamochod(250);

        System.out.println(auto1.maxPredkosc());
        System.out.println(auto1.getClass().toString());
        System.out.println(autoDlaMlodego.maxPredkosc());
        System.out.println(autoDlaMlodego.getClass().toString());

    }
}
