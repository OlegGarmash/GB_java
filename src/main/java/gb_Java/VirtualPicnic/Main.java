package gb_Java.VirtualPicnic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String path = "src\\main\\java\\gb_Java\\VirtualPicnic\\input.txt";
        ReadFromFile fr = new ReadFromFile();
        String[] str = fr.readFile(path).split(" ");
        Set<String> set = new TreeSet<>(Arrays.asList(str));
        WordsCounter wc = new WordsCounter();
        LongestWord lw = new LongestWord();
        ProductCounter pc = new ProductCounter();
        wc.wordsCounter(str);
        lw.printer(set);
        pc.printer(set, str);
    }
}