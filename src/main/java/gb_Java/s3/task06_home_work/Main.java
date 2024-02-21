package gb_Java.s3.task06_home_work;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9, 4, 7, 1, 2};
        Integer[] arr2 = {4, 2, 4, 6};
        analyzeNumbers(arr2);

    }

    private static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> listOfIntegers = new ArrayList<>(List.of(arr));
        System.out.println("listOfIntegers = " + listOfIntegers);
        System.out.println("removeIfEven(listOfIntegers) = " + removeIfEven(listOfIntegers));
    }

    private static ArrayList<Integer> removeIfEven(ArrayList<Integer> listOfIntegers) {
        ArrayList<Integer> notEvenList = new ArrayList<>(listOfIntegers);
        for (int i = 0; i < notEvenList.size(); i++) {
            if (notEvenList.get(i) % 2 == 0) {
                notEvenList.remove(i);
                i--;
            }
        }
        return notEvenList;
    }
}
