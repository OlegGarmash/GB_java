package gb_Java.VirtualPicnic;

public class WordsCounter {
    public void wordsCounter(String[] strings) {
        int foodCounter = 0;
        for (String string : strings) {
            if (!string.isEmpty()) {
                foodCounter++;
            }
        }
        System.out.println("Всего слов в файле \"input.txt\": " + foodCounter + " шт.\n");
    }
}
