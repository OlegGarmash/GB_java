package Tester.s3.home_work;

import java.util.ArrayList;
import java.util.List;

public class UserList{
    List<Human> userList;

//    public UserList(List<Human> userList) {
//        this.userList = userList;
//    }

    @Override
    public String toString() {
        return userList + "\n";
    }

    public void add(Human human) {
        userList.add(human);
    }
}
