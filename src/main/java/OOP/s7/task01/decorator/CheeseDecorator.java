package OOP.s7.task01.decorator;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription() + ", сыр";
    }
}
