package OOP.s3.task05_Home_Work;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.studentList.add(new Student(2L, "German", "Stanislavovich", "Puzikov"));
        studentGroup.studentList.add(new Student(1L, "Artyom", "Ivanovich", "Garmash"));
        studentGroup.studentList.add(new Student(3L, "Jhon", "Man", "Weak"));
        studentGroup.studentList.add(new Student(5L, "Jhon", "Man", "Weak"));
        studentGroup.studentList.add(new Student(4L, "Jhon", "Man", "Weak"));

        System.out.println(studentGroup.studentList.get(2).compareTo(studentGroup.studentList.get(1)));

        StudentGroupServise servise = new StudentGroupServise(studentGroup);
        System.out.println("----");
        servise.soutList(studentGroup.studentList);

        System.out.println("----");
        servise.soutList(servise.getSortedStudentGroup());

        System.out.println("----");
        servise.soutList(studentGroup.studentList);

        System.out.println("----");
        servise.soutList(servise.getSortedStudentGroupFIO());
    }
}
