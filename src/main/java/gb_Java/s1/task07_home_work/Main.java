package gb_Java.s1.task07_home_work;

public class Main {
    static class Answer {
        public void printPrimeNums() {
            // Напишите свое решение ниже

            for (int i = 1; i < 1001; i++) {
                boolean f = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) f = false;
                }
                if (f) System.out.println(i);
            }

        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
