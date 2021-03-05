package kemia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kemia {

    public static void main(String[] args) throws IOException {
        Path utvonal= Paths.get("felfedezesek.csv");
        List<String> sorok=Files.readAllLines(utvonal);
        ArrayList<Elem> elemek=new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            elemek.add(new Elem(sorok.get(i)));
        }
        //3.feladat
        System.out.println("3. feladat");
        System.out.println("Elemek száma: "+elemek.size());
        
         //4.feladat
         int okorbanfelfedezett=0;
         for (Elem elem : elemek)
         {
             if (elem.getFelfedezesKora().equals("Ókor"))
             {
                 okorbanfelfedezett++;
                 
             }
            
        }
         System.out.println(okorbanfelfedezett);
         
         
         //5.feladat
         System.out.println("5.feladat");
         Scanner sc=new Scanner(System.in);
         String vegyjel="";
         do {
             vegyjel=sc.nextLine();
        } while (vegyjel.length()>3);
         System.out.println("vegyjel: "+vegyjel);
         
         
         
         //6.feladat
         System.out.println("6.feladat");
    
         for (Elem elem : elemek)
         {
             
             if (elem.getVegyJel().equalsIgnoreCase(vegyjel)) 
             {
                 System.out.println("a választott elem adatai");
                 System.out.println(elem.toString());
             }
            
        }
        
    
         
         
         
        
        
    }
    
}
