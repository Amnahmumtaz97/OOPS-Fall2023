package week6;

class ElectronicsProduct extends Product {

    private int powerConsumption;
    private int warranty;


    public ElectronicsProduct(int id, String name, double price, int stockQuantity, int powerConsumption, int warranty) {
        super(id, name, price, stockQuantity);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public ElectronicsProduct(int powerConsumption, int warranty) {

    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
