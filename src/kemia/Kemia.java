package kemia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kemia {

    public static void main(String[] args) throws IOException {
        Path utvonal= Paths.get("felfedezesek.csv");
        List<String> sorok=Files.readAllLines(utvonal);
        ArrayList<Elem> elemek=new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            elemek.add(new Elem(sorok.get(i)));
        }
        
    }
    
}
