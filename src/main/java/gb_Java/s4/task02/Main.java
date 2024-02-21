package gb_Java.s4.task02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
*/
public class Main {
    private static int sumIsEven(LinkedList<Integer> integerList) {
        int result = 0;
        for (Integer item : integerList) {
            if (item % 2 == 0) result += item;
        }
        return result;
    }

    private static int sumNotEven(LinkedList<Integer> integerList) {
        int result = 0;
        for (Integer item : integerList) {
            if (item % 2 != 0) result += item;
        }
        return result;
    }

    private static LinkedList<Integer> getIntegers() {
        LinkedList<Integer> integerList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerList.add(scanner.nextInt());
        }
        scanner.close();
        return integerList;
    }

    public static void main(String[] args) {
        //LinkedList<Integer> integerList = getIntegers();
        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(-1, 2, 3, -4, -5, 6));
        System.out.println("integerList = " + integerList);
        System.out.println("sumIsEven(integerList) = " + sumIsEven(integerList));
        System.out.println("sumNotEven(integerList) = " + sumNotEven(integerList));


        /*System.out.println("integerList.peek() = " + integerList.peek());
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.pop() = " + integerList.pop());
        System.out.println("integerList = " + integerList);
        integerList.addLast(7);
        System.out.println("integerList = " + integerList);
        integerList.addFirst(8);
        System.out.println("integerList = " + integerList);
        integerList.set(3, 100);
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.contains(3) = " + integerList.contains(3));
        System.out.println("integerList.indexOf(3) = " + integerList.indexOf(3));
        integerList.remove( 4);
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.remove( (Integer) 4) = " + integerList.remove((Integer) 4));*/
    }




}
