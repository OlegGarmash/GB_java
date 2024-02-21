package gb_Java.s1.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //boolean f = true;
        //f = isSimmetric(arr, f);
        System.out.println(isSimmetric(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr[" + i + "] = " + arr[i]);
//        }
    }

    /**
     * @apiNote проверить массив на симметричность
     * @param arr массив для проверки на симметричность
     * @return результат проверки
     */
    private static boolean isSimmetric(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                //f = false;
                return false;
            }
        }
        return true;
    }
}
