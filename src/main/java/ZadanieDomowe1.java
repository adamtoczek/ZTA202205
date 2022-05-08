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

    }

    public static boolean isPrime(int n) {
        if (n < 2 )
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i < n; i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}