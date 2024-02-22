package OOP.s2.Home_Work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        boolean b = true;
        while (b) {
            main_menu();
            Scanner scannerMenu = new Scanner(System.in);
            int menu_list = scannerMenu.nextInt();
            switch (menu_list) {
                case 1:
                    System.out.println("Введите имя покупателя:");
                    Scanner scannerName = new Scanner(System.in);
                    market.acceptToMarket(new Human(scannerName.nextLine()));
                    break;
                case 2:
                    market.actorsInMarket();
                    break;
                case 3:
                    market.takeInQueue();
                break;
                case 4:
                    market.takeOrders();
                    break;
                case 5:
                    market.update();
                    break;
                case 0:
                    b = false;
                    break;
            }
            System.out.println("--------");
            System.out.println();
        }
    }

    static void main_menu() {
        System.out.println("Выберете пункт меню:\n" +
                "-> 1. Добавить покупателя.\n" +
                "-> 2. Список покупателей в магазине.\n" +
                "-> 3. Поставить покупателя в очередь.\n" +
                "-> 4. Создать заказ.\n" +
                "-> 5. Забрать заказ и покуинуть магазин.\n" +
                "-> 0. Выйти из программы.");
    }
}