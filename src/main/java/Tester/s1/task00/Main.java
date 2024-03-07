package Tester.s1.task00;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkArrayLenght(new int[]{1,2,3},2));
    }
    public static int checkArrayLenght (int[] arr, int min){
        if(arr.length < min)
            return -1;
        else return arr.length;
    }
}
