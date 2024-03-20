package Tester.s3.home_work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {

    public void writeToFile(String path, Human human) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(path, true);
            fw.write(String.valueOf(human));
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
