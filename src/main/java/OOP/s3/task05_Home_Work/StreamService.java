package OOP.s3.task05_Home_Work;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public List<StudentGroup> getSortedStream() {
        List<StudentGroup> streamGroup = new ArrayList<>(stream.getStreamGroup());
        streamGroup.sort(new StreamComparator());
        return streamGroup;
    }

    public void soutList(List<StudentGroup> studentGroupList) {
        for (StudentGroup s : studentGroupList) {
            System.out.println(s);
        }
    }
}
