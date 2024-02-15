package OOP.s1.task01;

import java.util.List;

public interface VendingMachine {

    void initProducts(List<Product> list);

    Product getProduct(String name);
}