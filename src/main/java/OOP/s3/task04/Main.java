package OOP.s3.task04;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(1, "German", "Stanislavovich", "Puzikov"),
                new Student(2, "Artyom", "Ivanovich", "Garmash"),
                new Student(3, "Jhon", "Man", "Weak"))));
        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------");
        iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
//            Student student = iterator.next();
            if (iterator.next().studentId == 1)
                iterator.remove();
            System.out.println(iterator.next());
        }
    }
}
