package OOP.s7.task02_Home_Work.model;

public abstract class Operations {
    Calculator calculator = new Calculator();
//    public Logger logger = new Logger();
    private double result;

    public abstract double getResult();

    public double getResult(String operator, double firstNumber, double secondNumber) {
        switch (operator) {
            case "+":
                calculator.calculatorOperation(new Add());
                this.result = calculator.calculate(firstNumber, secondNumber);

//                logger.log("Operation ADD: " + firstNumber + " + " + secondNumber + " = " + result);
                break;
            case "-":
                calculator.calculatorOperation(new Subtract());
                this.result = calculator.calculate(firstNumber, secondNumber);
//                logger.log("Operation SUBTRACT: " + firstNumber + " - " + secondNumber + " = " + result);
                break;
            case "*":
                calculator.calculatorOperation(new Multiply());
                this.result = calculator.calculate(firstNumber, secondNumber);
//                logger.log("Operation MULTIPLY: " + firstNumber + " * " + secondNumber + " = " + result);
                break;
            case "/":
                calculator.calculatorOperation(new Divide());
                this.result = calculator.calculate(firstNumber, secondNumber);
//                logger.log("Operation DIVIDE: " + firstNumber + " + " + secondNumber + " = " + result);
                break;
            default:
                System.out.println("Error!");
        }

        return this.result;
    }
}
