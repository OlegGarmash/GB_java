package OOP.s6.task02_Home_Work;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}