package ru.gb_tasks.s4.task08_home_work;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        int a, b, c, d;
        char op, op2, undo;
        a = 3;
        op = '+';
        b = 7;
        c = 4;
        op2 = '+';
        d = 7;
        undo = '<';
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}

class Calculator {
    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        if (op == '+') {
            a += b;
            enqueue(a);
        } else if (op == '-') {
            a -= b;
            enqueue(a);
        } else if (op == '*') {
            a *= b;
            enqueue(a);
        } else if (op == '/') {
            a /= b;
            enqueue(a);
        } else if (op == '<') {
            a = prevElem();
        }
        return a;
    }


    private LinkedList<Integer> elements = new LinkedList<>();

    public void enqueue(int element) {
        // Напишите свое решение ниже
        elements.addLast(element);
    }

    public int prevElem() {
        // Напишите свое решение ниже
        return elements.size() > 1 ? elements.get(elements.size() - 2) : elements.getFirst();
    }
}

//Решение с ГБ:
/*
class Calculator {
    public Deque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        if (op == '<') {
            if (resultsStack.size() >= 2) {
                resultsStack.pop();
                prevResult = resultsStack.peek();
            }
            return prevResult;
        } else {
            double result = performOperation(op, a, b);
            resultsStack.push(result);
            prevResult = result;
            return result;
        }
    }

    private double performOperation(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = minus(a, b);
                break;
            case '*':
                result = mult(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
        }
        return result;
    }

    private double divide(int a, int b) {
        if (b != 0)
            return (double) a / b;
        return -1;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }
}
 */
