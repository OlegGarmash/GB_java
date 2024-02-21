package OOP.s3.task04_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupServise {
    StudentGroup studentGroup;

    public StudentGroupServise(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> studentListSort = new ArrayList<>(studentGroup.studentList);
        Collections.sort(studentListSort);
        return studentListSort;
    }
    public void soutList(List<Student> studentList){
        for (Student s : studentList){
            System.out.println(s);
        }
    }
    public List<Student> getSortedStudentGroupFIO(){
        List<Student> studentListSort = new ArrayList<>(studentGroup.studentList);
        studentListSort.sort(new StudentComporator());
        return studentListSort;
    }
}
