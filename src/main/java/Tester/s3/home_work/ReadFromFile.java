package Tester.s3.home_work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public void readFromFile(String path){
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
