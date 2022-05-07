
public class Kalkulator {
    public static void main(String[] args) {
        System.out.println(add(2,5));
        System.out.println(substract(10,2));
        System.out.println(multiply(2,5));
        System.out.println(divide(10,2));

    }

    private static int multiply(int a, int b) {
        return a*b;
    }

    private static int divide(int a, int b) {
        return a/b;
    }

    private static int substract(int a, int b) {
        return a-b;
    }

    private static int add(int a, int b) {
        return a+b;
    }
}
