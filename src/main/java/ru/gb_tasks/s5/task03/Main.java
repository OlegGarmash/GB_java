package ru.gb_tasks.s5.task03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> num = new HashMap<>(Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        ));
        System.out.println("num = " + num);
        String str = "LVIII";
        Integer result = 0;

        for (int i = 0; i < str.length(); i++) {
            result += num.get(str.charAt(i));
        }
        System.out.println("result = " + result);
    }
}
