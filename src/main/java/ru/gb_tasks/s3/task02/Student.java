package ru.gb_tasks.s3.task02;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String surname;
    private Integer group;
    private Integer stipendia;
    private List<Integer> grades;

    public Student(String surname, Integer group, Integer stipendia, List<Integer> grades) {
        this.surname = surname;
        this.group = group;
        this.stipendia = stipendia;
        this.grades = grades;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getGroup() {
        return group;
    }

    public Integer getStipendia() {
        return stipendia;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public void setStipendia(Integer stipendia) {
        this.stipendia = stipendia;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", group=" + group +
                ", stipendia=" + stipendia +
                ", grades=" + grades +
                '}';
    }

    public boolean evenGrades(){
        Integer sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum % 2 == 0;
    }
}
