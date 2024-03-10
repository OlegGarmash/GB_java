package OOP.s7.task02_Home_Work.model;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<String> logs;

    public Logger(){
        logs = new ArrayList<>();
    }
    public void log(String message){
        logs.add(message);
    }
    public void printLogs(){
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
