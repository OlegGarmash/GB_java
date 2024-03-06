package OOP.s7.task01.decorator;

public class mainDec {
    public static void main(String[] args) {
        Pizza pizza = new CheeseDecorator(new CheeseDecorator(new PeperoniDecorator(new PizzaDough())));
        printPizza(pizza);
    }

    static void printPizza(Pizza pizza){
        System.out.println(pizza.getDiscription());
        System.out.println(pizza.getCost());
    }
}
