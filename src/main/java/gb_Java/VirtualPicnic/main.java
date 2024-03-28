package gb_Java.VirtualPicnic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) {

        String path = "src\\main\\java\\gb_Java\\VirtualPicnic\\input.txt";
        TreeMap<String, Integer> map = new TreeMap<>();

        String[] str = ReadFile(path).split(" ");
        Set<String> set = new TreeSet<>(Arrays.asList(str));

        System.out.println("В файле input.txt " + str.length + " слов.\n");

        int maxLength = str[0].length();
        String maxWord = str[0];

        int c = 0;
        for (String string : str) {
            if (!string.isEmpty()) {
                c++;
            }
        }

        for (String string : set) {
            int count = 1;
            if (!string.isEmpty()) {
                for (String s : str) {
                    if (string.equals(s)) {
                        map.put(string, count);
                        count++;
                    }
                }
            }
            if (maxLength < string.length()) {
                maxLength = string.length();
                maxWord = string;
            }
        }

        System.out.println("Самое длинное слово - " + '\"' + maxWord + '\"' + " состоит из " + maxLength + " букв.\n");
        System.out.println(c);

        for (Map.Entry<String, Integer> elem : map.entrySet()) {
            System.out.println("Продукт " + '\"' + elem.getKey() + '\"' + " встретился " + elem.getValue() + " раз.");
        }
    }

    public static String ReadFile(String path) {
        BufferedReader br = null;
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