package Tester.s1.task04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        checkArray(new Integer[]{1, 2, 3, null, null, null});
    }

    public static void checkArray(Integer[] arr) {
        List<Integer> cash = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                cash.add(i);
//                throw new RuntimeException(String.format("В ячейке с индексом %s встретился null%n", i));
        }
        if (!cash.isEmpty()) {
            throw new RuntimeException(String.format("В ячейках с индексами %s встретился null%n", cash));
        } else {
            System.out.println("Null в массиве не встретился");
        }
    }
}
