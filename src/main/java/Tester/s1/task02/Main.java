package Tester.s1.task02;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1},
        };
        System.out.println(sumOfMatrixItems(arr));
    }

    public static int sumOfMatrixItems(int[][] arr) {
        int height = arr.length;
        int sum = 0;
        for (int[] ints : arr) {
            if (ints.length != height)
                throw new RuntimeException("Array isn't squared");
            for (int anInt : ints) {
                if (anInt == 0 || anInt == 1) {
                    sum += anInt;
                } else {
                    throw new RuntimeException("Unacceptable value");
                }
            }
        }
        return sum;
    }

}
