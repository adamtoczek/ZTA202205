import java.util.Scanner;

public class Porownanie {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj a: ");
        a = in.nextInt();
        System.out.print("Podaj b: ");
        b = in.nextInt();

        if (a>b)
            System.out.println("a jest wieksze od b");
        else if (a<b)
            System.out.println("a jest mniejsze od b");
        else
            System.out.println("a jest rowne b");
    }
}

// main
// sout