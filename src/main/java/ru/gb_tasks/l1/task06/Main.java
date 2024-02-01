package ru.gb_tasks.l1.task06;

public class Main {
    public static void main(String[] args) {
        System.out.println("powRec = " + powRec(2, 2));
        System.out.println("powIter = " + powIter(2, 10));
    }

    private static double powIter(double a, int b) {
        if (a == 0 || a == 1) return a;
        if (b == 0) return 1;
        if (b < 0) {
            b = -b;
            a = 1 / a;
        }
        double result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result *= a;
            }
            a *= a;
            b /= 2;
        }
        return result;
    }

    private static double powRec(double a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            return powRec(1 / a, -b);
        }
        double res = powRec(a, b / 2);
        return b % 2 == 0 ? res * res : res * res * a;
    }
}
