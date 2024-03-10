package OOP.s6.task02_Home_Work;


public class Teacher extends User implements Comparable<Teacher> {
    private Integer teacherId;
    public Teacher(Integer teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
