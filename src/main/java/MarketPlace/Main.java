package MarketPlace;

public class Main {
    public static void main(String[] args) {

        Marketplace marketplace = new Marketplace();

        Seller seller1 = new Seller("Amber", "amber_seller1@gmail.com");
        Seller seller2 = new Seller("John", "john_seller2@gmail.com");

        Buyer buyer1 = new Buyer("Olive", "olive_buyer1@gmail.com");
        Buyer buyer2 = new Buyer("Gavin", "gavin_buyer2@gmail.com");

        marketplace.addSeller(seller1);
        marketplace.addSeller(seller2);

        marketplace.addBuyer(buyer1);
        marketplace.addBuyer(buyer2);

        Product product1 = new Product("Monitor", 350);
        Product product2 = new Product("Keyboard", 75);
        Product product3 = new Product("Mouse", 15);

        seller1.addProduct(product3);
        seller2.addProduct(product2);
        seller2.addProduct(product1);

        buyer1.buyProduct(product1);
        buyer2.buyProduct(product3);

        marketplace.displayAllSellers();
        marketplace.displayAllBuyers();
    }
}
