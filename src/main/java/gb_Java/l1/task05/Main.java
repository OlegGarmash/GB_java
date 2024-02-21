package gb_Java.l1.task05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] arrStr = str.split(" ");

        for (int i = 0; i < arrStr.length / 2; i++) {
            String temp = arrStr[i];
            arrStr[i] = arrStr[arrStr.length - 1- i];
            arrStr[arrStr.length - 1 - i] = temp;
        }
        System.out.println("arrStr = " + String.join(" ", arrStr));
    }
}
