package MarketPlace;

import java.util.ArrayList;
import java.util.List;

public class Marketplace {

    private List<Seller> allSellers;
    private List<Buyer> allBuyers;

    public Marketplace() {
        this.allSellers = new ArrayList<>();
        this.allBuyers = new ArrayList<>();
    }

    //add a seller
    public void addSeller(Seller seller) {
        allSellers.add(seller);
    }

    //add a buyer
    public void addBuyer(Buyer buyer) {
        allBuyers.add(buyer);
    }

    //display sellers
    public void displayAllSellers() {
        System.out.println("These are the sellers in the Marketplace: ");
        for (Seller seller : allSellers) {
            System.out.println("Name - " + seller.getName() + ", Email - " + seller.getEmail());
            seller.displayProducts();
        }
    }

    //display buyers
    public void displayAllBuyers() {
        System.out.println("These are the buyers in the Marketplace: ");
        for (Buyer buyer : allBuyers) {
            System.out.println("Name - " + buyer.getName() + ", Email - " + buyer.getEmail());
            buyer.displayPurchasedProducts();
        }
    }

}
