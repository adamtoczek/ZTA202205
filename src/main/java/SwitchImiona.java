import java.util.Scanner;

public class SwitchImiona {
    public static void main(String[] args) {
        String imie;
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        imie = in.nextLine();
        String odpowiedz = "Czesc ";
        switch (imie) {
            case "Dorota" :
                odpowiedz += imie;
                break;
            case "Marcin" :
                odpowiedz += imie;
                break;
            default:
                odpowiedz = "Nie znam cie";
        }
        System.out.println(odpowiedz);
    }
}
