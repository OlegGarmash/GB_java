package OOP.s7.task01.decorator;

public class PeperoniDecorator extends PizzaDecorator{
    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription() + ", пепперони";
    }
}
