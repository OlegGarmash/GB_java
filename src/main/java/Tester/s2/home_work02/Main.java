package Tester.s2.home_work02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
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
//            try{
                return (double) intArray[8] / d;
//            } catch (ArithmeticException e){
//                throw new ArithmeticException("test");
//            } catch (ArrayIndexOutOfBoundsException e){
//                throw new ArrayIndexOutOfBoundsException("test2");
//            }

        }
    }
}
