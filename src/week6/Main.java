package week6;

public class Main {
    public static void main(String[] args) {

        InventoryManagementSystem inventorySystem = new InventoryManagementSystem(100);

        ElectronicsProduct electronicProduct = new ElectronicsProduct(1, "Smartphone", 599.99, 20, "Electronics", "Mobile");
        Furniture furnitureProduct = new Furniture(2, "Sofa", 499.99, 10, "Furniture", "Living Room");
        GroceriesProduct groceriesProduct = new GroceriesProduct(3, "Milk", 2.99, 50, "Groceries", "Dairy");

        inventorySystem.addProduct(electronicProduct);
        inventorySystem.addProduct(furnitureProduct);
        inventorySystem.addProduct(groceriesProduct);

        // Updating product details
        Product updatedProduct = new ElectronicsProduct(1, "Smartphone", 649.99, 15, "Electronics", "Mobile");
        inventorySystem.updateProduct(updatedProduct);

        // Removing a product
        inventorySystem.removeProduct(2);

        // Retrieving and displaying product details
        Product retrievedProduct = inventorySystem.getProduct(3);
        if (retrievedProduct != null) {
            System.out.println("Retrieved Product: " + retrievedProduct.getName());
            System.out.println("Price: " + retrievedProduct.getPrice());
            System.out.println("Stock Quantity: " + retrievedProduct.getStockQuantity());
        } else {
            System.out.println("Product not found.");
        }
    }
}
