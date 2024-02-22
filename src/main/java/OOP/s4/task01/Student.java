package OOP.s4.task01;

public class Student extends User implements Comparable<Student>{
    public Long studentId;

    public Student(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentId > o.studentId)
            return 1;
        else if (this.studentId < o.studentId)
            return -1;
        else
            return 0;
        //return this.studentId.compareTo(o.studentId);
    }
}
