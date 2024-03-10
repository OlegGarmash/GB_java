package OOP.s7.task02_Home_Work;

import OOP.s7.task02_Home_Work.controller.Controller;
import OOP.s7.task02_Home_Work.model.Logger;
import OOP.s7.task02_Home_Work.model.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Logger logger = new Logger();
        boolean b = true;
        while (b) {
            main_menu ();
            Scanner scannerMenu = new Scanner(System.in);
            int menu_list = scannerMenu.nextInt();
            switch (menu_list){
                case (1):
//                    controller.printResult();
                    logger.log("Result = " + controller.getResult());
                    break;
                case (2):
                    b = false;
                    logger.printLogs();
                    break;
                default:
                    System.out.println("Input ERROR!");
            }
        }

    }
    static void main_menu () {
        System.out.println("Start calculator:\n" +
                "-> 1. Yes\n" +
                "-> 2. Exit");
    }
}
