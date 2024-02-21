package gb_Java.l1.task03;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 1, 3, 3, 4, 5, 3, 8, 6, 3, 7};
        int[] result = new int[arr.length];
        int val = 3;

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                result[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < result.length; i++) {
            result[i] = val;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("arr[" + i + "] = " + result[i]);
        }
    }
}
