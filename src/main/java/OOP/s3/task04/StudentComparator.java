package OOP.s3.task04;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparator = o1.secondName.compareTo(o2)
    }
}
