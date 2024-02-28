package OOP.s3.task05_Home_Work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> streamGroup = new ArrayList<>();

    public Stream(List<StudentGroup> studentGroupList) {
        this.streamGroup = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }

    public List<StudentGroup> getStreamGroup() {
        return streamGroup;
    }


}
