package OOP.s1.task01;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{

    List<Product> hotDrinkList = new ArrayList<>();

    public void addHotDrink (HotDrink bottle){
        hotDrinkList.add(bottle);
    }

    @Override
    public void initProducts(List<Product> list) {
        hotDrinkList = list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product i : hotDrinkList) {
            if (i.getName().equals(name))
                return i;
        }
        return null;
    }

    public Product getProduct(String name, int temperature, double volume) {
        for (Product i : hotDrinkList) {
            if (i instanceof HotDrink hotDrink && i.getName().equals(name)){
                if (hotDrink.getTemperature() == temperature && hotDrink.getVolume() == volume){
                    return hotDrink;
                }
            }
        }
        return null;
    }


}
