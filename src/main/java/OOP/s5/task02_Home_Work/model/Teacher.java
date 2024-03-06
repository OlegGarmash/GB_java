package OOP.s5.task02_Home_Work.model;

public class Teacher extends User {

    private Integer teacherId;

    public Teacher(String firstName, String secondName, String lastName, Integer dateOfBirth, Integer teacherId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                super.toString() +
                '}';
    }
}
