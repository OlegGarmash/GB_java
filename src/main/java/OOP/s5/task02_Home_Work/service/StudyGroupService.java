package OOP.s5.task02_Home_Work.service;

import OOP.s5.task02_Home_Work.model.Student;
import OOP.s5.task02_Home_Work.model.StudyGroup;
import OOP.s5.task02_Home_Work.model.Teacher;

import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;
    public void createStudyGroup(Teacher teacher, List<Student> students){
        this.studyGroup = new StudyGroup(teacher, students);
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
}
