package OOP.s4.task02_HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService {
    public void getSortedTeacherList(List<Teacher> teacherList){
        Collections.sort(teacherList);
    }

    public void soutList(List<Teacher> teacherList){
        for (Teacher s : teacherList){
            System.out.println(s);
        }
    }
    public List<Teacher> getSortedTeacherListFIO(List<Teacher> teacherList){
        List<Teacher> teacherListSort = new ArrayList<>(teacherList);
        teacherListSort.sort(new UserComparator<Teacher>());
        return teacherListSort;
    }
}
