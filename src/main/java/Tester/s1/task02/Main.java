package Tester.s1.task02;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkArrayLength(new int[]{1, 2, 3}, 2,2));
    }

    public static int checkArrayLength(int[] arr, int min, int findNum) {
        if (arr == null) {
            System.out.println("Array can't be null");
            return -3;
        }
        else if (arr.length < min) {
            System.out.println("Length of the array is less then min");
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == findNum)
                    return i;
            }
            System.out.println("The number isn't in the array");
            return -2;
        }
    }
}
