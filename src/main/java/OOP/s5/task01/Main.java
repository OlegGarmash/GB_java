package OOP.s5.task01;

import OOP.s5.task01.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("11", "22", "33", 1900);
        controller.createStudent("22", "22", "33", 1900);
        controller.createStudent("33", "22", "33", 1900);
        controller.printAllStudents();
        System.out.println("-----------");
        controller.createStudent("44", "22", "33", 1900);
        controller.createStudent("55", "22", "33", 1900);
        controller.createStudent("66", "22", "33", 1900);
        controller.printAllStudents();
    }
}
