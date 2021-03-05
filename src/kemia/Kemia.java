package kemia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Kemia {

    public static void main(String[] args) throws IOException {
        Path utvonal = Paths.get("felfedezesek.csv");
        List<String> sorok = Files.readAllLines(utvonal);
        ArrayList<Elem> elemek = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            elemek.add(new Elem(sorok.get(i)));
        }
        //3.feladat
        System.out.println("3. feladat");
        System.out.println("Elemek száma: " + elemek.size());

        //4.feladat
        System.out.println("3. feladat");
        int okorbanfelfedezett = 0;
        for (Elem elem : elemek) {
            if (elem.getFelfedezesKora().equals("Ókor")) {
                okorbanfelfedezett++;

            }

        }
        System.out.println(okorbanfelfedezett);

        //5.feladat
        System.out.println("5.feladat");
        Scanner sc = new Scanner(System.in);
        String vegyjel = "";
        do {
            vegyjel = sc.nextLine();
        } while (vegyjel.length() > 3);
        System.out.println("vegyjel: " + vegyjel);

        //6.feladat
        System.out.println("6.feladat");

        for (Elem elem : elemek) {

            if (elem.getVegyJel().equalsIgnoreCase(vegyjel)) {
                System.out.println("a választott elem adatai");
                System.out.println(elem.toString());
            }

        }

        System.out.println("7. Feladat : Határozza meg és írja ki a képernyőre a minta szerint, hogy év volt"
                + "a leghosszabb időszak két elem felfedezése között az ókor után!");

        int leghosszabbev = 0;
        int N = elemek.size();
        int i = 0;
        for (int j = 0; j < N - 1; j++) {
            if (!elemek.get(j).getFelfedezesKora().equals("Ókor")) {
                if (Integer.parseInt(elemek.get(j + 1).getFelfedezesKora()) - Integer.parseInt(elemek.get(j).getFelfedezesKora()) > leghosszabbev) {
                    leghosszabbev = Integer.parseInt(elemek.get(j + 1).getFelfedezesKora()) - Integer.parseInt(elemek.get(j).getFelfedezesKora());
                }
            }
        }
        System.out.println("A legtöbb eltelt év: " + leghosszabbev);

        System.out.println("8. Feladat: Statisztika");
        HashMap<String, Integer> statisztika = new HashMap<>();
        for (Elem elem : elemek) {
            String kulcs = elem.getFelfedezesKora();
            if (!statisztika.containsKey(kulcs)) {
                statisztika.put(kulcs, 1);

            } else {
                int ertek = statisztika.get(kulcs);
                statisztika.put(kulcs, ++ertek);
            }
        }
        
        for (Map.Entry<String, Integer> entry : statisztika.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 3 && !(key.equals("Ókor"))) {
                System.out.println(key + " " + value + " db");
            }
            
        }
       
    }

}
