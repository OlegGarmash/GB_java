package Tester.s2.home_work01;

public class Main {
    public static void main(String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "Ivan"; // По умолчанию используем "3.14", если аргумент не передан
        }
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }

    class IsFloat {
        public static float isFloat(String input) {
// Введите свое решение ниже
            try {
                Float.parseFloat(input);
            } catch (NumberFormatException e){
                System.out.println("Your input is not a float number. Please, try again.");
                return Float.NaN;
            }
            return Float.parseFloat(input);
        }
    }
}
