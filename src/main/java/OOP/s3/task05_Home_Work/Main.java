package OOP.s3.task05_Home_Work;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.getStudentList().add(new Student(2L, "German", "Stanislavovich", "Puzikov"));
        studentGroup.getStudentList().add(new Student(1L, "Artyom", "Ivanovich", "Garmash"));
        studentGroup.getStudentList().add(new Student(3L, "Jhon", "Man", "Weak"));
        studentGroup.getStudentList().add(new Student(5L, "Jhon", "Man", "Weak"));
        studentGroup.getStudentList().add(new Student(4L, "Jhon", "Man", "Weak"));

        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>());
        studentGroup2.getStudentList().add(new Student(2L, "German", "Stanislavovich", "Puzikov"));
        studentGroup2.getStudentList().add(new Student(1L, "Artyom", "Ivanovich", "Garmash"));
        studentGroup2.getStudentList().add(new Student(3L, "Jhon", "Man", "Weak"));
        studentGroup2.getStudentList().add(new Student(5L, "Jhon", "Man", "Weak"));

        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>());
        studentGroup3.getStudentList().add(new Student(2L, "German", "Stanislavovich", "Puzikov"));
        studentGroup3.getStudentList().add(new Student(1L, "Artyom", "Ivanovich", "Garmash"));
        studentGroup3.getStudentList().add(new Student(3L, "Jhon", "Man", "Weak"));

        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(studentGroup);
        studentGroupList.add(studentGroup2);
        studentGroupList.add(studentGroup3);

        Stream stream = new Stream(studentGroupList);
        StreamService sortedStream = new StreamService(stream);
        sortedStream.soutList(sortedStream.getSortedStream());
    }
}
