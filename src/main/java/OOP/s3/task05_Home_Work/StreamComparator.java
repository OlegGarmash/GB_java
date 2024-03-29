package OOP.s3.task05_Home_Work;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getStudentList().size() - o2.getStudentList().size();
    }
}
