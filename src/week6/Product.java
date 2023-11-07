package week6;

class Product {
    private int id;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int id, String name, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    Product(){
        this.id=1;
        this.name="master";
        this.price=80.2;
        this.stockQuantity=100;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %.2f, Stock Quantity: %d", id, name, price, stockQuantity);
    }


    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

}

