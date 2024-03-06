package OOP.s6.task02_Home_Work.SRP;

public class CalculateSalary {
    private int baseSalary;

    public CalculateSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return baseSalary * 1.5;
    }
}
