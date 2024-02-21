package gb_Java.s1.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = resultPrMinusSum(n);
        System.out.println("pr-sum = " + result);
    }

    /**
     * @apiNote расширенное описание
     * @param n
     * @return произв минус сумма
     */
    public static int resultPrMinusSum(int n) {
        int pr = 1;
        int sum = 0;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}