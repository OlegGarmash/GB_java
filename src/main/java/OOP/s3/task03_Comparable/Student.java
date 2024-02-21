package OOP.s3.task03_Comparable;

public class Student implements Comparable<Student>{
    public Long studentId;
    private String firstName;
    private String secondName;
    private String lastName;
    public Student(Long studentId, String firstName, String secondName, String lastName){
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
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
