package OOP.s5.task02_Home_Work.model;

public class Student extends User {

    private Integer studentId;

    public Student(String firstName, String secondName, String lastName, Integer dateOfBirth, Integer studentId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

//    public void setStudentId(Integer studentId) {
//        this.studentId = studentId;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                super.toString() +
                '}';
    }
}
