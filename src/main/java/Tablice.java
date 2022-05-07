import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        String[] tablica = new String[5]; //indeksy 0-4
        Scanner in = new Scanner(System.in);

        for (int i=0; i< tablica.length; i++ ) {
            System.out.print("Podaj "+(i+1)+" imie: ");
            tablica[i] = in.nextLine();
        }

        int i = 0;
        while (i < tablica.length) {
            System.out.println(tablica[i]);
            i++;
        }

        /*
        * */
        System.out.print("Podaj rozmiar tablicy: ");
        int n = in.nextInt();
        int[] tab = new int[n];
        for (int k = 0; k<n; k++) {
            tab[k] = k+1;
            System.out.println(tab[k]);
        }
    }
}
