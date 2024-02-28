package OOP.s3.task05_Home_Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getSortedStudentGroup() {
        List<Student> studentListSort = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentListSort);
        return studentListSort;
    }

    public void soutList(List<Student> studentList) {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public List<Student> getSortedStudentGroupFIO() {
        List<Student> studentListSort = new ArrayList<>(studentGroup.getStudentList());
        studentListSort.sort(new StudentComporator());
        return studentListSort;
    }
}
