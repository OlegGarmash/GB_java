package OOP.s5.task02_Home_Work.service;

import OOP.s5.task02_Home_Work.model.Student;
import OOP.s5.task02_Home_Work.model.Teacher;
import OOP.s5.task02_Home_Work.model.Type;
import OOP.s5.task02_Home_Work.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users = new ArrayList<>();
//    public DataService(){
//        this.users = new ArrayList<>();
//    }

    public void create(String firstName, String secondName, String lastName, Integer dateOfBirth, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT) {
            Student student = new Student(firstName, secondName, lastName, dateOfBirth, id);
            users.add(student);
        } else if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, dateOfBirth, id);
            users.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        boolean isStudent = Type.STUDENT == type;
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
    public List<Student> getStudentListById(List<Integer> id){
        List<Student> students = new ArrayList<>();
        for (Student student : getStudentList()){
            for (Integer i : id) {
                if (student.getStudentId().equals(i)){
                    students.add(student);
                }
            }
        }
        return students;
    }

    public List<Teacher> getTeacherList(){
        List<Teacher> studentList = new ArrayList<>();
        for (User user : users){
            if (user instanceof Teacher){
                studentList.add((Teacher) user);
            }
        }
        return studentList;
    }
    public Teacher getTeacherById(Integer teacherId, List<Teacher> teachers){
        for (Teacher teacher : teachers){
            if (teacherId.equals(teacher.getTeacherId())){
                return teacher;
            }
        }
        return null;
    }
}
