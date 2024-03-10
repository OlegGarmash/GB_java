package OOP.s7.task02_Home_Work.model;

public class Multiply implements Calculation {
    @Override
    public double calculateResult(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
