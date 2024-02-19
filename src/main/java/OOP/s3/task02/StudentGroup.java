package OOP.s3.task02;


import java.util.Iterator;
import java.util.List;

public class StudentGroup {
    public List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

//    @Override
//    public Iterator<Student> iterator(){
//        return new StudentGroupIterator(this);
//    }
}
