package Tester.s1.task01;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkArrayLength(new int[]{1, 2, 3}, 5));
    }

    public static int checkArrayLength(int[] arr, int min) {
        if (arr.length < min)
            return -1;
        else return arr.length;
    }
}
