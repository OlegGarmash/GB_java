package Tester.s3.home_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Garmash", "Oleg", "Yurevich", "21.01.1985", "89023223023", "M");
        Human human1 = new Human("Garmash", "1Oleg", "Yurevich", "21.01.1985", "89023223023", "M");
//        System.out.println(human);

//        Scanner scanner = new Scanner(System.in);
//        String[] userName = scanner.nextLine().split(" ");
//        UserList userList = new UserList();
//        Human human1 = new Human(userName[0],userName[1],userName[2],userName[3],userName[4],userName[5]);
//        userList.add(human);
//        userList.add(human1);
//        System.out.println(userList);
        WriteToFile fw = new WriteToFile();
        fw.writeToFile(human.surName, human);
        fw.writeToFile(human1.surName, human1);


    }
}
