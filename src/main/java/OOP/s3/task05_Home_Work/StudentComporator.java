package OOP.s3.task05_Home_Work;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.secondName.compareTo(o2.secondName);
        if (resultOfComparing == 0) {
            resultOfComparing = o1.firstName.compareTo(o2.firstName);
            if (resultOfComparing == 0) {
                resultOfComparing = o1.lastName.compareTo(o2.lastName);
                if (resultOfComparing == 0){
                    return o1.studentId.compareTo(o2.studentId);
                } else {
                    return resultOfComparing;
                }
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
