package MarketPlace;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends Person {
    private List<Product> purchasedProducts;

    public Buyer() {
        this.purchasedProducts = new ArrayList<>();
    }

    public Buyer(String name, String email) {
        super(name, email);
        this.purchasedProducts = new ArrayList<>();
    }

    //to buy products
    public void buyProduct(Product product) {
        purchasedProducts.add(product);
    }

    //to display purchased products
    public void displayPurchasedProducts() {
        System.out.println("Purchased Products from Buyer " + getName() + ":");
        for (Product product : purchasedProducts) {
            System.out.println("This is product: " + product);
        }
    }

    @Override
    public void displayRole() {
        System.out.println("Hi, I am a buyer");
    }

}
