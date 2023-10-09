package medicstore;

public class Medicine extends Product {
    private final String manufacturer;
    private int stock;


    public Medicine(String name, double price, int productID,String manufacturer, int stock) {
        super(name,price,productID,ProductType.MEDICINE);
        this.manufacturer = manufacturer;
        this.stock = stock;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
