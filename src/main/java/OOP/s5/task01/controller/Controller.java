package OOP.s5.task01.controller;

import OOP.s5.task01.model.Student;
import OOP.s5.task01.model.Type;
import OOP.s5.task01.service.DataService;
import OOP.s5.task01.view.StudentView;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName, Integer dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth, Type.STUDENT);
    }

    public void printAllStudents() {
        for (Student student : dataService.getStudentList()){
            studentView.printOnConsole(student);
        }
    }
}
