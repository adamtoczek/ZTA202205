public class MetodyStatyczne {
    public static void main(String[] args) {
//        OperacjeMatematyczne op = new OperacjeMatematyczne();
        OperacjeMatematyczne.dodaj(4,5);

        OperacjeMatematyczne op1 = new OperacjeMatematyczne();
        OperacjeMatematyczne op2 = new OperacjeMatematyczne();

        System.out.println(OperacjeMatematyczne.counterOperacji);
        System.out.println(op1.counterOperacji);
        System.out.println(op2.counterOperacji);
        op2.counterOperacji = 10;

        System.out.println(OperacjeMatematyczne.counterOperacji); // 10

    }
}

class OperacjeMatematyczne {
    public static int counterOperacji=0;


    public static int dodaj(int a, int b) {
        counterOperacji++;
        return a+b;
    }
    public static int pomnoz(int a, int b) {
        return a*b;
    }
}
