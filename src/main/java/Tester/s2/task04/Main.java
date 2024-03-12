package Tester.s2.task04;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String str = strings[1];
            test();
            int a = 1 / 0;

            inputStream = new FileInputStream("sdafgdsaf");
        } catch (StackOverflowError error) {
            System.err.println("stack overflow error");
            throw new StackOverflowError("Stack overflow");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        File file = new File("src\\main\\java\\Tester\\s2\\task04\\1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
