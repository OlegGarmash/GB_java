package OOP.s5.task02_Home_Work;

import OOP.s5.task02_Home_Work.controller.Controller;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("11", "22", "33", 1900);
        controller.createStudent("22", "22", "33", 1900);
        controller.createStudent("33", "22", "33", 1900);
        controller.createStudent("44", "22", "33", 1900);
        controller.createStudent("55", "22", "33", 1900);
        controller.createStudent("66", "22", "33", 1900);
        controller.printAllStudents();
        controller.createTeacher("aaa","zzz", "qqq", 1850);
        controller.printAllUsers();
        controller.createStudyGroup(1, new ArrayList<>(Arrays.asList(1,2)));
        controller.getStudyGroup();
    }
}
