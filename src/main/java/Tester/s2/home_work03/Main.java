package Tester.s2.home_work03;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 5; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(a, b);
        System.out.println(result);
    }

    class Expr {

        public static double expr(int a, int b) {
            // Введите свое решение ниже
            try {
                double result = a / b;
                return (double) a / b;
            } catch (ArithmeticException e) {
                return 0;
            } finally {
                printSum(a, b);
            }

        }

        public static void printSum(int a, int b) {
            // Введите свое решение ниже
            System.out.println(a + b);

        }
    }
}
