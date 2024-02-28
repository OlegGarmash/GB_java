package OOP.s3.task05_Home_Work;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private List<StudentGroup> studentGroupList;
    int index = 0;

    public StreamIterator(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext())
            return null;
        return studentGroupList.get(index++);
    }

    public void remove() {
        studentGroupList.remove(--index);
        index = 0;
    }
}
