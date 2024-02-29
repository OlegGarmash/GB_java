package OOP.s5.task02_Home_Work.service;

import OOP.s5.task02_Home_Work.model.Student;
import OOP.s5.task02_Home_Work.model.Teacher;
import OOP.s5.task02_Home_Work.model.Type;
import OOP.s5.task02_Home_Work.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Integer dateOfBirth, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT) {
            users.add(new Student(firstName, secondName, lastName, dateOfBirth, id));
        } else if (type == Type.TEACHER) {
            users.add(new Teacher(firstName, secondName, lastName, dateOfBirth, id));
        }
    }

    private int getFreeId(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int lastId = 1;
        for (User user : users) {
            if (user instanceof Student && isStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            } else if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student) {
                studentList.add((Student) user);
            }
        }
        return studentList;
    }
}
