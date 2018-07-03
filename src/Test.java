import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Produkty[] tablicaProduktow = new Produkty[2];
        File file = new File ("Produkty.csv");
        FileReader fileReader = new FileReader (file);
        BufferedReader bufferedReader = new BufferedReader (fileReader);
        String line = "";
        int i = 0;
        while ((line = bufferedReader.readLine ( )) != null) {
            String[] pokolei = line.split (";");

            String a = pokolei[0];
            String b = pokolei[1];
            String c = pokolei[2];
            tablicaProduktow[i] = new Produkty (a, b, c);
            i++;

        }
        System.out.println (tablicaProduktow[0].getProducent ( ));
        System.out.println (tablicaProduktow[0].getNazwa ( ));
        System.out.println (tablicaProduktow[0].getCena ( ));
        System.out.println (tablicaProduktow[1].getProducent ( ));
        System.out.println (tablicaProduktow[1].getNazwa ( ));
        System.out.println (tablicaProduktow[1].getCena ( ));
        int suma = 0;
        int najdrozszyProdukt2 = 0;
        String najdroższyProdutk = "";
        for (i = 0; i < tablicaProduktow.length; i++) {
            int cena = Integer.parseInt (tablicaProduktow[i].getCena ( ));

            suma = suma + cena;
            if (cena > najdrozszyProdukt2) {
                najdrozszyProdukt2= Integer.parseInt (tablicaProduktow[i].getCena ());
                najdroższyProdutk = tablicaProduktow[i].getNazwa ( );
            }

        }

        System.out.println ("Suma wszystkich produtków to: " + suma);
        System.out.println ("Najdroższy produkt to: "+najdroższyProdutk);
        int iloscDanegoProduktu = 1;
for (i=0; i<tablicaProduktow.length;i++){
    String nazwa = tablicaProduktow[i].getNazwa ();
//    for (int j =0; j<tablicaProduktow.length;j++){
//        if (tablicaProduktow[i].getNazwa ().equals (tablicaProduktow[j].getNazwa ())){
//
//                        iloscDanegoProduktu++;
//            }
//
//        }
//    }
}

    }

}
