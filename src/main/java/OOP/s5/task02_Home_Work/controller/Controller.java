package OOP.s5.task02_Home_Work.controller;

import OOP.s5.task02_Home_Work.model.Student;
import OOP.s5.task02_Home_Work.model.Teacher;
import OOP.s5.task02_Home_Work.model.Type;
import OOP.s5.task02_Home_Work.model.User;
import OOP.s5.task02_Home_Work.service.DataService;
import OOP.s5.task02_Home_Work.service.StudyGroupService;
import OOP.s5.task02_Home_Work.view.StudentView;
import OOP.s5.task02_Home_Work.view.StudyGroupView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupView groupView = new StudyGroupView();
    private final StudyGroupService groupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName, Integer dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName, Integer dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth, Type.TEACHER);
    }

    public void createStudyGroup(Integer teacherId, List<Integer> studentId) {
        Teacher teacher = dataService.getTeacherById(teacherId, dataService.getTeacherList());
        List<Student> students = dataService.getStudentListById(studentId);
        groupService.createStudyGroup(teacher, students);
    }

    public void printAllUsers() {
        for (User user : dataService.getUsers()) {
            System.out.println(user);
        }
    }

    public void printAllStudents() {
        List<Student> studentList = dataService.getStudentList();
        for (Student student : studentList) {
            studentView.printOnConsole((Student) student);
        }
    }

    public void getStudyGroup() {
        groupView.printOnConsole(groupService.getStudyGroup());
    }
}
