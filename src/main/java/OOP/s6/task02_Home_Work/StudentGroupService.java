package OOP.s6.task02_Home_Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup){
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
        studentListSort.sort(new StudentComparator());
        return studentListSort;
    }
}
