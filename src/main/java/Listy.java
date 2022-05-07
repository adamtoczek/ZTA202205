import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


        // wersja z foreach do mnozenia
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0 ; i<=k; i++)
            list2.add(i);

        for (int v : list2)
            if (v%2 == 0)
                list2.set(v, v*2);
        for (int v : list2)
            System.out.println(v);


    }
}
