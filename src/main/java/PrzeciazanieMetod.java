public class PrzeciazanieMetod {
    public static void main(String[] args) {
        Dzialania.mnozenie(5, 4);
        Dzialania.mnozenie(5, 4, 3);
        Dzialania.mnozenie(5.5, 3);
        Dzialania.mnozenie(5.5, 3.3);
    }

}

class Dzialania {
    public static void mnozenie (int a, int b) {
        System.out.println(a*b);
    }

    public static void mnozenie (int a, int b, int c) {
        System.out.println(a*b*c);
    }

    public static void mnozenie (double a, double b) {
        System.out.println(a*b);
    }

    public static void mnozenie (double a, int b) {
        System.out.println(a*b);
    }

    public static void mnozenie (int a, double b) {
        System.out.println(a*b);
    }
}

