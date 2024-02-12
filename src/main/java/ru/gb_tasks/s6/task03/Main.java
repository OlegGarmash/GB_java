package ru.gb_tasks.s6.task03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] mas1 = {"qwe", "asd", "qwe", "x"};
        String[] mas2 = {"qwe", "v", "asd"};
        Set<String> set3 = new HashSet<>(Arrays.asList(mas1));

        set3.retainAll(new HashSet<>(Arrays.asList(mas2)));
        System.out.println("set3 = " + set3);
        List<String> lst = new ArrayList<>(Arrays.asList(mas1));
        lst.addAll(Arrays.asList(mas2));

        for (String elem : set3) {
            int count = 0;
            for (String s : lst) {
                if (elem == s) {
                    count++;
                }
            }
            System.out.println("count = " + elem + " " + count);
        }
    }
}
