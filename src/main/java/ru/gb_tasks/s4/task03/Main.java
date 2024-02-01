package ru.gb_tasks.s4.task03;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(-1, 2, 3, -4, -5, 6));
        System.out.println("integerList = " + integerList);
        System.out.println("sumNotEven(integerList) = " + sumNotEven(integerList));
        System.out.println("sumNotDivThree(integerList) = " + sumNotDivThree(integerList));
    }

    private static int sumNotEven(LinkedList<Integer> integerList) {
        int result = 0;
        for (Integer item : integerList) {
            if (item %2 != 0) result += item;
        }
        return result;
    }

    private static LinkedList<Integer> sumNotDivThree(LinkedList<Integer> integerList) {
        int sum = sumNotEven(integerList);
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 3 != 0) {
                integerList.set(i, sum);
            }
        }
        return integerList;
    }
}
