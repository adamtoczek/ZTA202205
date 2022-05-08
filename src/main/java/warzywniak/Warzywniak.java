package warzywniak;

import java.util.ArrayList;
import java.util.List;

public class Warzywniak {
    public static void main(String[] args) {
        Jablko japko = new Jablko();
        Banan banan = new Banan();
        Pomarancz pomarancz = new Pomarancz();

//        System.out.println(japko);
//        System.out.println(banan);
//        System.out.println(pomarancz);

        List<Jablko> listaJablek = new ArrayList<>();
        listaJablek.add(japko);

        List<Owoc> koszykOwocow = new ArrayList<>();
        koszykOwocow.add(japko);
        koszykOwocow.add(pomarancz);
        koszykOwocow.add(banan);

        System.out.println(koszykOwocow);




    }
}
