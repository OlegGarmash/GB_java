package OOP.s7.task02_Home_Work.model;

public class Calculator {
    private Calculation calculation;
    public void calculatorOperation(Calculation calculation){
        this.calculation = calculation;
    }
    public double calculate(double firstNumber, double secondNumber){
        return calculation.calculateResult(firstNumber, secondNumber);
    }
}
