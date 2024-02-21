package gb_Java.s4.task04;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(-1, -2, -3, -4, -5));
        System.out.println("integerList = " + integerList);
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < 0) {
                integerList.remove(i);
                i--;
            }
        }
        System.out.println("integerList = " + integerList);
    }
}
