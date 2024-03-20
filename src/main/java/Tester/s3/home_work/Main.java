package Tester.s3.home_work;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        UserDataInput dataInput = new UserDataInput();
        ReadFromFile fr = new ReadFromFile();

        dataInput.userDataInput();
        fr.readFromFile();
    }
}
