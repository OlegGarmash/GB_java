package Tester.s2.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элементе массива, " +
                "в который хотите записать значение 1");
        try {
            int index = scanner.nextInt();
            arr[index] = 1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Указанный индекс за пределами массива");
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
