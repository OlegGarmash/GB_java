package OOP.s1.task01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine();
        HotDrinkVendingMachine hotMachine = new HotDrinkVendingMachine();

        machine.addBottleOfWater(new BottleOfWater("Water1", 100, 5));
        machine.addBottleOfWater(new BottleOfWater("Water2", 20, 1.5));
        machine.addBottleOfWater(new BottleOfWater("Water3", 300, 2.5));
        machine.addBottleOfWater(new BottleOfWater("Water4", 40, 4));

        hotMachine.addHotDrink(new HotDrink("coffee", 10.5, 100, 90));
        hotMachine.addHotDrink(new HotDrink("tea", 5, 250, 85));
        hotMachine.addHotDrink(new HotDrink("iceTea", 15, 150, 15));
        hotMachine.addHotDrink(new HotDrink("hotMilk", 25, 200, 70));

        System.out.println(machine.getProduct("Water1"));
        System.out.println(hotMachine.getProduct("iceTea",15,150));

    }
}
