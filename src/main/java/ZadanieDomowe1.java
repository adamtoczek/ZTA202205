/*
Napisz metode ktora sprawdza czy podana przez uzytkownika liczba jest liczba pierwsza
liczby wpierwsze to takie ktore dziela sie tylko przez 1 oraz sama siebie:
2, 3, 5 ,7, 11, 13, .. ..


dodatkowo:
- uzyj osobnej metody do odczytywania danych od uzytkownika
- dodaj obsluge wyjatkow przy odczytywaniu danych
- zapetl program - komenda 'exit' powoduje zakonczenie programu

 */
public class ZadanieDomowe1 {
    public static void main(String[] args) {
        System.out.println("1:"+isPrime(1));
        System.out.println("2:"+isPrime(2));
        System.out.println("3:"+isPrime(3));
        System.out.println("4:"+isPrime(4));
        System.out.println("13:"+isPrime(13));
        System.out.println("15:"+isPrime(15));
    }

    public static boolean isPrime(int n) {
        if (n < 2 )
            return false;

        if (n == 2)
            return true;

        if (n%2  == 0) //oprocz liczby 2, wszystkie liczby parzyste nie sa pierwsze
            return false;
// for (int i = 2; i <= Math.sqrt(n); i=i+2) { // wersja z ograniczeniem sprawdzania dzielnikow do pierwiastka kwadratowego liczby n
        for (int i = 3; i < n; i=i+2) { //mozemy sprawdzac tylko nieparzyste dzielniki, bo wszystkie parzyste odpadly wczesniej
            if (n%i == 0)
                return false;
        }
        return true;
    }
}