package warzywniak;

import java.util.ArrayList;
import java.util.List;

public class Warzywniak {
    public static void main(String[] args) {
        Jablko japko = new Jablko();
        Banan banan = new Banan();
        Pomarancz pomarancz = new Pomarancz();

        //lista jablek List<Jablko> moze przechowywac tylko elementy typu Jablko
        List<Jablko> listaJablek = new ArrayList<>();
        listaJablek.add(japko);

        //List<Owoc> moze przechowywac jablka, pomarancze i banany poniewaz wszystkie dziedzicza po Owoc
        List<Owoc> koszykOwocow = new ArrayList<>();
        koszykOwocow.add(japko);
        koszykOwocow.add(pomarancz);
        koszykOwocow.add(banan);

        System.out.println(koszykOwocow);

        for(Owoc item : koszykOwocow) {
            System.out.println(item.pobierzCene());
        }




    }
}
