package gb_Java.s5.task02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 4, 5, 0, 4, 6, 7, 2, 6));
        System.out.println("containsDubs(lst) = " + containsDubs(lst));
    }

    private static boolean containsDubs(List<Integer> lst) {
        Map<Integer,Integer> dubs = new HashMap<>();
        for (Integer elem : lst) {
            if (!dubs.containsKey(elem)) {
                dubs.put(elem, 1);
            } else {
                return true;
            }
//            dubs.putIfAbsent(elem, 0);
//            dubs.put(elem, dubs.get(elem)+1);

        }return false;
//        System.out.println("dubs = " + dubs);
//        System.out.println("containsDouble(dubs) = " + containsDouble(dubs));
    }

//    private static boolean containsDouble(Map<Integer, Integer> dubs) {
//        for (Map.Entry<Integer, Integer> elem : dubs.entrySet()) {
//            if (elem.getValue() >1){
//                return true;
//            }
//        }
//        return false;
//    }
}
