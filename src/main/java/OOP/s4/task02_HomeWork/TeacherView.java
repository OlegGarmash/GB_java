package OOP.s4.task02_HomeWork;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        int count = 1;
        for (Teacher teacher : list) {
            System.out.printf("Teacher %d: %s\n", count++, teacher);
        }
    }
}
