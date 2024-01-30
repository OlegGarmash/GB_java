package ru.gb_tasks.l1.task03;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 1, 3, 3, 4, 5, 3, 8, 6, 3, 7};
        int val = 3;
        int n = 0;
        int j = arr.length - 1;

        while (n < j) {
            if (arr[j] == val){
                j--;
            }
            if (arr[n] == val){
                arr[n] = arr[j];
                arr[j] = val;
            }
        }


//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == val) count++;
//        }
//        for (int i = 0; i < arr.length - count; i++) {
//            if (arr[i] == val) {
//                arr[i] = arr[]
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
