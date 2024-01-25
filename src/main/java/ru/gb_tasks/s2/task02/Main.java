package ru.gb_tasks.s2.task02;

/**
 * Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 2, 3, 6, 3, 5, 10, 8, 9};
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] * 2) count++;
        }
        System.out.println(count);
    }
}
