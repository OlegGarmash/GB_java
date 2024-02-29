package OOP.s5.task02_Home_Work.controller;

import OOP.s5.task02_Home_Work.model.Student;
import OOP.s5.task02_Home_Work.model.Type;
import OOP.s5.task02_Home_Work.service.DataService;
import OOP.s5.task02_Home_Work.view.StudentView;

public class Controller {
    private DataService dataService = new DataService();
    private StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName, Integer dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth, Type.STUDENT);
    }

    public void printAllStudents() {
        for (Student student : dataService.getStudentList()){
            studentView.printOnConsole(student);
        }
    }
}
