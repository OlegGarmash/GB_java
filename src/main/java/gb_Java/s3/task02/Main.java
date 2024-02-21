package gb_Java.s3.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Petrov", 101, 5000, Arrays.asList(5, 4, 3));
//        Student student2 = new Student("Petrov", 102, 6000, Arrays.asList(5, 4, 5));
//        Student student3 = new Student("Petrov", 103, 7000, Arrays.asList(5, 3, 3));
//        Student student4 = new Student("Petrov", 104, 8000, Arrays.asList(3, 4, 3));

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Petrov", 101, 5000, Arrays.asList(5, 4, 3)),
                new Student("Smirnov", 102, 6000, Arrays.asList(5, 4, 5)),
                new Student("Sidorov", 103, 7000, Arrays.asList(5, 3, 3)),
                new Student("Ivanov", 104, 8000, Arrays.asList(3, 4, 3))
        ));

        for (Student student : studentList) {
            if (student.getSurname().endsWith("ov") && student.evenGrades()) {
                System.out.println("Stipendia = " + student.getStipendia());
            }
        }
    }
}
