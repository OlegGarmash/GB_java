package OOP.s3.task02_Iterable;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.studentList.add(new Student(1, "German", "Stanislavovich", "Puzikov"));
        studentGroup.studentList.add(new Student(2, "Artyom", "Ivanovich", "Garmash"));
        studentGroup.studentList.add(new Student(3, "Jhon", "Man", "Weak"));

        for (Student student : studentGroup){
            System.out.println(student);
        }
    }
}
