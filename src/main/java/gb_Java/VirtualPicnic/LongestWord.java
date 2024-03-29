package gb_Java.VirtualPicnic;

import java.util.ArrayList;
import java.util.Set;

public class LongestWord {
    public void printer(Set<String> set) {
        System.out.println("Самое длинное слово состоит из " + longestWord(set) + " букв.\nСамые длинные слова: " + longestWordList(longestWord(set), set).toString().replaceAll("^\\[|\\]$", "") + ".\n");
    }

    private Integer longestWord(Set<String> set) {
        int maxLength = 0;
        for (String string : set) {
            if (maxLength < string.length()) {
                maxLength = string.length();
            }
        }
        return maxLength;
    }

    private ArrayList<String> longestWordList(Integer longestWord, Set<String> set) {
        ArrayList<String> maxWordList = new ArrayList<>();
        for (String string : set) {
            if (longestWord == string.length()) {
                maxWordList.add(string);
            }
        }
        return maxWordList;
    }
}
