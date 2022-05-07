import java.util.Scanner;

public class Bomba {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int sec;
        System.out.print("Podaj ilosc sekund: ");
        sec = in.nextInt();

        for (int i = sec; i > 0 ; i--) {
            System.out.println("Bomba wybuchnie za "+i+"s");
            Thread.sleep(1000);
        }
        System.out.println("Buuuuuuuuuuuuum");
        System.out.println("==================");
        int i = sec;
        while (i > 0) {
            System.out.println("Bomba wybuchnie za "+i+"s");
            Thread.sleep(1000);
            i--;
        }
        System.out.println("Buuuuuuuuuuuuum");

        System.out.println("==================");


        i=sec;
        do {
            System.out.println("Bomba wybuchnie za "+i+"s");
            Thread.sleep(1000);
            i--;
        }
        while (i>0);
        System.out.println("Buuuuuuuuuuuuum");

    }

}
