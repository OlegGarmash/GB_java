package OOP.s3.task04;

import java.util.Collections;
import java.util.List;

public class StudentGroupServise {
    StudentGroup studentGroup;

    public StudentGroupServise(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = studentGroup.studentList;
        Collections.sort(studentList);
        return studentList;
        
    }

    public List<Student>
}
