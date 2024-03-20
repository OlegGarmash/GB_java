package Tester.s3.home_work;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public void writeToFile(String path, UserData data) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(path, true);
            fw.write(String.valueOf(data));
            fw.flush();
            System.out.printf("Файл с именем [%s] успешно сохранён.\n\n", data.getSurName());
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
