package Tester.s2.home_work04;

public class Main {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = ' '; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    class Expr {
        public static String expr(char a) throws Exception {
// Введите свое решение ниже
            if (a == ' '){
                throw new Exception("Empty string has been input.");
            }
            return "Your input was - " + a;
        }
    }
}
