public class Firma {
    public static void main(String[] args) {
        Pracownik programistaAdam; //deklaracja zmiennej o nazwie programistaAdam typu klasa Pracownik
        Pracownik tester; //deklaracja zmiennej o nazwie tester typu klasa Pracownik

        programistaAdam = new Pracownik(); //inicjalizacja/stworzenie obiektu klasy Pracownik i przypisanie go do zmiennej
        tester = new Pracownik();

        programistaAdam.imie = "Adam"; // przypisanie wartosci atrybutu imie do obiektu programistaAdam
        programistaAdam.nazwisko = "Kowalski";
        programistaAdam.wiek = 18;

        tester.setImie("Joanna");
        tester.setNazwisko("Dark");
        tester.setWiek(22);

        System.out.println(programistaAdam.imie + " " + programistaAdam.nazwisko);
        System.out.println(tester.wiek);

        programistaAdam.wyswietlDane();
        tester.wyswietlDane();


    }
}

class Pracownik {
    String imie;
    String nazwisko;
    int wiek;

    public void wyswietlDane() {
        System.out.println("Pracownik: "+imie+" "+nazwisko+"\t"+wiek+" lat");
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWiek() {
        return wiek;
    }

    public void setWiek (int wiek) {
        this.wiek = wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}




