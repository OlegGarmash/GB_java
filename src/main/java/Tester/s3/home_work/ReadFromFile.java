package Tester.s3.home_work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public void readFromFile() {
        System.out.print("Введите имя файла:\n-> ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
