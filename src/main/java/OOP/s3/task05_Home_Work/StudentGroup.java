package OOP.s3.task05_Home_Work;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    public List<Student> studentList;

    public StudentGroup(List<Student> studentList){
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
