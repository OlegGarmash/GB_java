package OOP.s7.task01.decorator;

public class PizzaDough implements Pizza{

    @Override
    public double getCost() {
        return 150;
    }

    @Override
    public String getDiscription() {
        return "Тесто";
    }
}
