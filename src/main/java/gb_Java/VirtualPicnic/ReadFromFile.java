package gb_Java.VirtualPicnic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public String readFile(String path) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(path));
            String s = br.readLine();
            br.close();
            return s;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
