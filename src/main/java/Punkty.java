public class Punkty {
/*
roznica miedzy argumentem metody typu
    - prymitywnego (int, char, boolean, ... )
    - zlozonego - czyli obiektu klasy - tutaj klasy Punkt
 */
    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        p1.x = 10;
        p1.y = 1;
        zmienPunkt(p1);  //metoda zmienPunkt operuje i zmienia obiekt p1
        System.out.println(p1.x+","+p1.y); //da 11,0

        int a = 10;
        zmienA(a); // metoda zmienA operuje na kopii wartosci zmiennej a
        System.out.println(a); //zwroci 10

    }

    static void zmienPunkt (Punkt punkt) {
        punkt.x++;
        punkt.y--;
    }

    static int zmienA(int a) {
        return a = a * a;
    }

}
class Punkt {
    int x;
    int y;
}

