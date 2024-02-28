package OOP.s4.task02_HomeWork;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}