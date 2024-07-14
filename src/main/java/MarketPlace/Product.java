package MarketPlace;

public class Product {

    private String typeOfProduct;
    private double price;

    public Product() {
    }

    public Product(String typeOfProduct, double price) {
        this.typeOfProduct = typeOfProduct;
        this.price = price;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type of product is: " + typeOfProduct + "\nPrice of product is: " + price;
    }
}
