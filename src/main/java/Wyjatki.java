public class Wyjatki {
    public static void main(String[] args) {
        /*
        Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę.
        Napisz pętlę, która wyjdzie poza długość tablicy. Przechwyć wyjątek ze stosownym komunikatem.

        1. zadeklaruj tablice 5 elementowa
        2. napisz petle ktora wyjdzie poza tablice

         */
        int[] tab = {3,8,4,6,8};

        try {
            for (int i=0; i<= tab.length; i++) {
                System.out.println(tab[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Zlapalismy wyjatek");
            System.out.println(e.getMessage());
        }

    }
}
