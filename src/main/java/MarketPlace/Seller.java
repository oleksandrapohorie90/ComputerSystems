package MarketPlace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seller extends Person {
    private List<Product> products;

    public Seller() {
    }

    public Seller(String name, String email) {
        super(name, email);
        this.products = new ArrayList<>();
    }

    //add product
    public void addProduct(Product product) {
        products.add(product);
    }

    //display products
    public void displayProducts() {
        System.out.println("These are products of seller " + getName() + ":");
        for (Product product : products) {
            System.out.println("This is product: " + product);
        }
    }

    @Override
    public void displayRole() {
        System.out.println("Hi, I am a seller");
    }
}
