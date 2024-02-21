package gb_Java.l1.task02;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] == 0) {
                count = 0;
            }
        }
        System.out.println("count = " + count);
    }
}
