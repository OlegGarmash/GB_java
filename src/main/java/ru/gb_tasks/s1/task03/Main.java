package ru.gb_tasks.s1.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String fisrtPart = str.substring(0, str.length() / 2);
        String secondPart = str.substring(str.length() / 2);
        System.out.println(secondPart + fisrtPart);
    }
}
