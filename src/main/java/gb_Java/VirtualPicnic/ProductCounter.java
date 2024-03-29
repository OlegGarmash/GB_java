package gb_Java.VirtualPicnic;

import java.util.*;

public class ProductCounter {
    private TreeMap<String, Integer> map = new TreeMap<>();
    private TreeMap<Integer, ArrayList<String>> counterMap = new TreeMap<>();

    public void printer(Set<String> set, String[] str) {
        for (Integer i : counterSet(set, str)) {
            ArrayList<String> counterWords = new ArrayList<>();
            for (Map.Entry<String, Integer> elem : map.entrySet()) {
                if (i.equals(elem.getValue())) {
                    counterWords.add(elem.getKey());
                }
                counterMap.put(i, counterWords);
            }
        }
        for (Map.Entry<Integer, ArrayList<String>> elem : counterMap.entrySet()) {
            System.out.println("В корзине по " + elem.getKey() + " шт лежат следующие продукты: " + elem.getValue().toString().replaceAll("^\\[|\\]$", "") + '.');
        }
    }

    private Set<Integer> counterSet(Set<String> set, String[] str) {
        ArrayList<Integer> counterList = new ArrayList<>();
        for (String string : set) {
            int count = 0;
            if (!string.isEmpty()) {
                for (String s : str) {
                    if (string.equals(s)) {
                        count++;
                        map.put(string, count);
                    }
                }
                counterList.add(count);
            }
        }
        Set<Integer> counterSetList = new TreeSet<>(counterList);
        return counterSetList;
    }
}
