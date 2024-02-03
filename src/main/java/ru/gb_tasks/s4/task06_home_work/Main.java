package ru.gb_tasks.s4.task06_home_work;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>(Arrays.asList(1, "One", 2, "Two"));
        System.out.println("list = " + list);
        System.out.println("revert(list) = " + revert(list));


    }

    private static LinkedList<Object> revert(LinkedList<Object> list) {
        System.out.println("list.size() = " + list.size());
        for (int i = 0; i < list.size() / 2; i++) {
            Object temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
        return list;
    }

}
