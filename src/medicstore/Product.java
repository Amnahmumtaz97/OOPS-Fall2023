package medicstore;

public class Product {
    private String name;
    private final double price;
    private final int productID;

    private final ProductType typeOfProduct;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductID() {
        return productID;
    }

    public ProductType getTypeOfProduct() {
        return typeOfProduct;
    }

    public Product(String name, double price, int productID, ProductType typeOfProduct) {
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.typeOfProduct = typeOfProduct;
    }

    @Override
    public String toString() {
        return "Product: " +
                "name= " + name + '\'' +
                ", price= " + price +
                ", productID= " + productID +
                ", typeOfProduct= " + typeOfProduct;
    }
}
