package OOP.s3.task04;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int index;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList;
    }

    public boolean hasNext() {
        return index < studentList.size();
    }

    public Student next() {
        if (!hasNext())
            return null;
        return studentList.get(index++);
    }

    public void remove() {
        studentList.remove(index);
        index = 0;
    }
}
