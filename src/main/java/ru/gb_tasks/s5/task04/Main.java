package ru.gb_tasks.s5.task04;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println("getArabicNumber(str) = " + getArabicNumber(str));
    }

    private static Integer getArabicNumber(String str) {
        Map<Character, Integer> num = new HashMap<>(Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        ));
        Integer result = num.get(str.charAt(str.length()-1));
        for (int i = 0; i < str.length()-1; i++) {
            if (num.get(str.charAt(i)) < num.get(str.charAt(i+1))){
                result -= num.get(str.charAt(i));
            } else {
                result += num.get(str.charAt(i));
            }
        }
        return result;
    }
}
