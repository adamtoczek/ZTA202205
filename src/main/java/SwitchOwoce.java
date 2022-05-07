import java.util.Scanner;

public class SwitchOwoce {
    public static void main(String[] args) {
        int ilosc;
        String owoc;
        Scanner in = new Scanner(System.in);
        System.out.print("Owoc: ");
        owoc = in.nextLine();

        switch (owoc) {
            case "banany":
            case "pomarancze":
            case "Jablka" :
                System.out.print("Ilosc: ");
                ilosc = in.nextInt();
                if (ilosc<100)
                    System.out.println(owoc + " jest za w sam raz, zostalo "+(100-ilosc) + "kg miejsca");
                else
                    System.out.println(owoc + "jest za duzo o "+(ilosc -100) + "kg");
                break;
            default:
                System.out.println("W hurtowni nie ma "+owoc);
        }


    }
}
