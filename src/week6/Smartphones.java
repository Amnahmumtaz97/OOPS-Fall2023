package week6;

public class Smartphones extends ElectronicsProduct {
    private String operatingSystem;
    private int storageCapacity;
    private int cameraResolution;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public Smartphones(int powerConsumption, int warranty, String operatingSystem, int storageCapacity, int cameraResolution) {
        super(powerConsumption, warranty);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }

    public Smartphones(int id, String name, double price, int stockQuantity, int powerConsumption, int warranty, String operatingSystem, int storageCapacity, int cameraResolution) {
        super(id, name, price, stockQuantity, powerConsumption, warranty);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Smartphones Details:\n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Stock Quantity: " + getStockQuantity() + "\n" +
                "Power Consumption: " + getPowerConsumption() + "\n" +
                "Warranty: " + getWarranty() + "\n" +
                "Operating System: " + getOperatingSystem() + "\n" +
                "Storage Capacity: " + getStorageCapacity() + "\n" +
                "Camera Resolution: " + getCameraResolution();
    }

}
