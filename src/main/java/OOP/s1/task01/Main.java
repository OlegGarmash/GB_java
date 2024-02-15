package OOP.s1.task01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("food", 123);
//        System.out.println("product.getName() = " + product.getName());
        BottleOfWater bottleOfWater = new BottleOfWater("drink",222, 2);
        List<Product> productList = new ArrayList<>();
        VendingMachine vendingMachine = new VendingMachine() {
            @Override
            public void initProducts(List<Product> list) {

            }

            @Override
            public List<Product> getProductList() {
                return null;
            }

            @Override
            public Product getProduct(String name) {
                return null;
            }
        }
    }
}
