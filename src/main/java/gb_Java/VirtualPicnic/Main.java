package gb_Java.VirtualPicnic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String path = "src\\main\\java\\gb_Java\\VirtualPicnic\\input.txt";
        TreeMap<String, Integer> map = new TreeMap<>();
        TreeMap<Integer, ArrayList<String>> counterMap = new TreeMap<>();
        ArrayList<Integer> counterList = new ArrayList<>();

        String[] str = ReadFile(path).split(" ");
        Set<String> set = new TreeSet<>(Arrays.asList(str));

        int maxLength = 0;
        ArrayList<String> maxWordList = new ArrayList<>();

        int foodCounter = 0;
        for (String string : str) {
            if (!string.isEmpty()) {
                foodCounter++;
            }
        }
        System.out.println("Всего слов в файле \"input.txt\": " + foodCounter + " шт.\n");

        for (String string : set) {
            int count = 1;
            if (!string.isEmpty()) {
                for (String s : str) {
                    if (string.equals(s)) {
                        map.put(string, count);
                        count++;
                    }
                }
                counterList.add(count - 1);
            }
            if (maxLength < string.length()) {
                maxLength = string.length();
            }
        }

        for (String string : set) {
            if (maxLength == string.length()) {
                maxWordList.add(string);
            }
        }

        System.out.println("Самое длинное слово состоит из " + maxLength + " букв.\nСамые длинные слова: " + maxWordList + ".\n");

        Set<Integer> counterSet = new TreeSet<>(counterList);

        for (Integer i : counterSet) {
            ArrayList<String> counterWords = new ArrayList<>();
            for (Map.Entry<String, Integer> elem : map.entrySet()) {
                if (i.equals(elem.getValue())) {
                    counterWords.add(elem.getKey());
                }
                counterMap.put(i, counterWords);
            }
        }

        for (Map.Entry<Integer, ArrayList<String>> elem : counterMap.entrySet()) {
            System.out.println("В корзине по " + elem.getKey() + " шт лежат следующие продукты: " + elem.getValue() + '.');
        }

        /*for (Map.Entry<String, Integer> elem : map.entrySet()) {
            System.out.println("Продукт " + '\"' + elem.getKey() + '\"' + " встретился " + elem.getValue() + " раз.");
        }*/
    }

    public static String ReadFile(String path) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(path));
            String s = br.readLine();
            br.close();
            return s;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}