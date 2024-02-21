package gb_Java.s3.task07_home_work;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9, 4, 7, 1, 2};
        analyzeNumbers(arr);

    }

    private static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> listOfIntegers = new ArrayList<>(List.of(arr));
        System.out.println("listOfIntegers = " + listOfIntegers);
        System.out.println("findMin(listOfIntegers) = " + findMin(listOfIntegers));
        System.out.println("findMax(listOfIntegers) = " + findMax(listOfIntegers));
        System.out.println("sortList(listOfIntegers) = " + sortList(listOfIntegers));
        System.out.println("listOfIntegers = " + listOfIntegers);
        System.out.println("avarage(listOfIntegers) = " + avarage(listOfIntegers));
    }

    private static ArrayList<Integer> sortList(ArrayList<Integer> listOfIntegers) {
        ArrayList<Integer> unSortedList = new ArrayList<>(listOfIntegers);
        ArrayList<Integer> sortedList = new ArrayList<>();
        while (!unSortedList.isEmpty()) {
            int n = unSortedList.indexOf(findMin(unSortedList));
            sortedList.add(unSortedList.get(n));
            unSortedList.remove(n);
        }
        return sortedList;
    }

    private static int findMin(ArrayList<Integer> listOfIntegers) {
        int minNum = listOfIntegers.getFirst();
        for (int i = 1; i < listOfIntegers.size(); i++) {
            if (minNum > listOfIntegers.get(i)) {
                minNum = listOfIntegers.get(i);
            }
        }
        return minNum;
    }

    private static int findMax(ArrayList<Integer> listOfIntegers) {
        int maxNum = listOfIntegers.getFirst();
        for (int i = 1; i < listOfIntegers.size(); i++) {
            if (maxNum < listOfIntegers.get(i)) {
                maxNum = listOfIntegers.get(i);
            }
        }
        return maxNum;
    }

    private static double avarage(ArrayList<Integer> listOfIntegers) {
        int result = 0;
        for (int item : listOfIntegers) {
            result += item;
        }
        return (double) result / listOfIntegers.size();
    }

    //Решение с ГБ:
    /*
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(nums); // сортировка списка по возрастанию
        System.out.println(nums); // вывод списка на экран
        System.out.println("Minimum is " + nums.get(0)); // нахождение минимального значения в списке и вывод на экран
        System.out.println("Maximum is " + nums.get(nums.size()-1)); // нахождение максимального значения в списке и вывод на экран

        int sum = 0;
        for(int i : nums){ // вычисление суммы всех элементов списка
            sum += i;
        }
        System.out.println("Average is = " + (double) sum / nums.size()); // вычисление среднего арифметического значений списка и вывод на экран
    }
     */
}
