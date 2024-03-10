package OOP.s7.task02_Home_Work.controller;

import OOP.s7.task02_Home_Work.model.Logger;
import OOP.s7.task02_Home_Work.model.Operations;
import OOP.s7.task02_Home_Work.view.Input;
import OOP.s7.task02_Home_Work.view.View;

import java.util.Scanner;

public class Controller extends Operations implements Input{
    private final Scanner scanner;
    View print = new View();
    Logger logger = new Logger();

    public Controller() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String inputOperator() {
        System.out.println("Enter operator: ");
        return scanner.next();
    }

    @Override
    public double inputFirstNumber() {
        System.out.println("Enter first number: ");
        return scanner.nextDouble();
    }

    @Override
    public double inputSecondNumber() {
        System.out.println("Enter second number: ");
        return scanner.nextDouble();
    }

    @Override
    public double getResult() {
        return super.getResult(inputOperator(), inputFirstNumber(), inputSecondNumber());
    }
    public void printResult(){
        print.view(getResult());
    }

}
