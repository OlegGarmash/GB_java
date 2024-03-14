package Tester.s2.home_work02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9};
            d = 0; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }

    class Expr {

        public static double expr(int[] intArray, int d) {
            // Введите свое решение ниже
//            if (d == 0){
//                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
//                return d.NaN;
//            }
            try {
                double result = intArray[8] / d;
                System.out.printf("intArray[8] / d = %s / %s = %s\n", intArray[8], d, result);
                return result;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("test");
                return Double.NaN;
//                throw new ArrayIndexOutOfBoundsException("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            } catch (ArithmeticException e) {
                System.out.println("test2");
                return Double.NaN;
//                throw new ArithmeticException("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            }
        }
    }
}
