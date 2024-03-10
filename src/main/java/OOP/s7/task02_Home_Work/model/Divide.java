package OOP.s7.task02_Home_Work.model;

public class Divide implements Calculation {
    @Override
    public double calculateResult(double firstNumber, double secondNumber) {
        if (secondNumber == 0){
            System.out.println("Dividing by zero is impossible");
            throw new ArithmeticException();
        }
        return firstNumber / secondNumber;
    }
}
