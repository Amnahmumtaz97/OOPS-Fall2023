package week6;

public class Smartphones   {
    ElectronicsProduct electronicsProduct;
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
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }

    public Smartphones(int id, String name, double price, int stockQuantity, int powerConsumption, int warranty, String operatingSystem, int storageCapacity, int cameraResolution) {
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }


}
