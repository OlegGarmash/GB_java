package Tester.s3.home_work;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human("Garmash", "Oleg", "Yurevich", "21.01.1985", "89023223023", "M");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные через пробел в формате:\n" +
                "Фамилия Имя Отчество 00.00.0000 81234567890 M\\F\n" +
                "-> ");
        String[] userName = scanner.nextLine().split(" ");
        Human human = new Human(userName[0],userName[1],userName[2],userName[3],userName[4],userName[5]);
        new WriteToFile().writeToFile(human.surName, human);
        new ReadFromFile().readFromFile("test2");
    }
}
