package gb_Java.s1.task08_home_work;

public class Main {
    static class Calculator {
        public int calculate(char op, int a, int b) {
            // Введите свое решение ниже
            if (op == '+') {
                return a + b;
            } else if (op == '-') {
                return a - b;
            } else if (op == '*') {
                return a * b;
            } else {
                return a / b;
            }
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator;
        calculator = new Calculator();
        if (op == '-' || op == '*' || op == '+' || op == '/') {
            int result = calculator.calculate(op, a, b);
            System.out.println(result + ".0");
        } else {
            System.out.println("Некорректный оператор: '" + op + "'");
        }
    }
}
