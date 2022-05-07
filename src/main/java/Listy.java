import java.util.ArrayList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        int k = 100;
        List<Integer> lista = new ArrayList<>();

        for (int i=0; i<=k; i++) {
            if (i%2==0)
                lista.add(i*2);
            else
                lista.add(i);
            System.out.println(lista.get(i));
        }


    }
}
