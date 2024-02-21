package gb_Java.s2.task05_home_work;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        log = new File("log.txt");
        try {
            fileWriter = new FileWriter(log, false);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        SimpleDateFormat logFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    isSorted = false;
                    temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }

            try {
                fileWriter.write(logFormatter.format(new Date(System.currentTimeMillis())) + " " + Arrays.toString(mas) + "\n");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            //fileWriter.write(logFormatter.format(new Date(System.currentTimeMillis()))+" "+Arrays.toString(mas)+"\n");
            fileWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
