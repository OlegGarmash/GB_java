package ru.gb_tasks.l1.task01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя пользователя:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        Date current = new Date();

        System.out.println("Привет, " + userName + "!");
        System.out.println(LocalTime.now());
        if (current.getHours() >= 5 && current.getHours() < 12){
            System.out.println("Доброе утро, " + userName + "!");
        } else if (current.getHours() >= 12 && current.getHours() < 18) {
            System.out.println("Добрый день, " + userName + "!");
        }else if (current.getHours() >= 18 && current.getHours() < 23) {
            System.out.println("Добрый вечер, " + userName + "!");
        }else {
            System.out.println("Доброй ночи, " + userName + "!");
        }
    }
}
