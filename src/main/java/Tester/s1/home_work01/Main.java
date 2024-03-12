package Tester.s1.home_work01;

public class Main {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[2];
        arr[3] = 0;

    }

    public static void divisionByZero() {
        int x = 5 / 0;

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        Integer.parseInt("abc");

    }
}
