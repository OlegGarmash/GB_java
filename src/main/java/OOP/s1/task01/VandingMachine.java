package OOP.s1.task01;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    private List<Product> productList;

    public VendingMachine() {
        productList = new ArrayList<>();
    }

    public Product getProduct(String name) {
        for (Product i : productList) {
            if (i.getName().equals(name))
                return i;
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}

/*
public class VendingMachine {
    private List<Product> productList;

    public VendingMachine() {
        productList = new ArrayList<>();
    }

    public Product getProduct(String name) {
        for (Product i : productList) {
            if (i.getName().equals(name))
                return i;
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
 */