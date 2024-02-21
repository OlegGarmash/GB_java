package gb_Java.s4.task07_home_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> listOfIntegers = new ArrayList<>(List.of(arr));
        System.out.println("listOfIntegers = " + listOfIntegers);

    }
}
