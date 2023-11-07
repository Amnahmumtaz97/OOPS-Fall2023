package week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem(10);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add a product");
            System.out.println("2. Update a product");
            System.out.println("3. Remove a product");
            System.out.println("4. Retrieve a product");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter product details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Stock Quantity: ");
                    int stockQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Category: ");
                    String category = scanner.nextLine();

                    Product newProduct;

                    if (category.equals("Electronics")) {
                        System.out.print("Power Consumption: ");
                        int powerConsumption = scanner.nextInt();
                        System.out.print("Warranty: ");
                        int warranty = scanner.nextInt();
                        newProduct = new ElectronicsProduct(id, name, price, stockQuantity, powerConsumption, warranty);
                    } else if (category.equals("Furniture")) {
                        System.out.print("Material: ");
                        String material = scanner.nextLine();
                        System.out.print("Dimensions: ");
                        int dimensions = scanner.nextInt();
                        newProduct = new Furniture(id, name, price, stockQuantity, material, dimensions);
                    } else if (category.equals("Groceries")) {
                        System.out.print("Expiration Date: ");
                        String expiryDate = scanner.nextLine();
                        System.out.print("Nutrition Value: ");
                        int nutritionValue = scanner.nextInt();
                        newProduct = new GroceriesProduct(id, name, price, stockQuantity, expiryDate, nutritionValue);
                    } else {
                        System.out.println("Invalid category");
                        continue;
                    }

                    inventorySystem.addProduct(newProduct);
                    break;

                case 2:
                    System.out.println("Enter product details for update:");
                    System.out.print("ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Price: ");
                    double updatePrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Stock Quantity: ");
                    int updateStockQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Category: ");
                    String updateCategory = scanner.nextLine();

                    Product updatedProduct;

                    if (updateCategory.equals("Electronics")) {
                        System.out.print("Power Consumption: ");
                        int updatePowerConsumption = scanner.nextInt();
                        System.out.print("Warranty: ");
                        int updateWarranty = scanner.nextInt();
                        updatedProduct = new ElectronicsProduct(updateId, updateName, updatePrice, updateStockQuantity, updatePowerConsumption, updateWarranty);
                    } else if (updateCategory.equals("Furniture")) {
                        System.out.print("Material: ");
                        String updateMaterial = scanner.nextLine();
                        System.out.print("Dimensions: ");
                        int updateDimensions = scanner.nextInt();
                        updatedProduct = new Furniture(updateId, updateName, updatePrice, updateStockQuantity, updateMaterial, updateDimensions);
                    } else if (updateCategory.equals("Groceries")) {
                        System.out.print("Expiration Date: ");
                        String updateExpiryDate = scanner.nextLine();
                        System.out.print("Nutrition Value: ");
                        int updateNutritionValue = scanner.nextInt();
                        updatedProduct = new GroceriesProduct(updateId, updateName, updatePrice, updateStockQuantity, updateExpiryDate, updateNutritionValue);
                    } else {
                        System.out.println("Invalid category");
                        continue;
                    }

                    inventorySystem.updateProduct(updatedProduct);
                    break;

                case 3:
                    System.out.print("Enter the ID of the product to remove: ");
                    int productId = scanner.nextInt();
                    inventorySystem.removeProduct(productId);
                    break;

                case 4:
                    System.out.print("Enter the ID of the product to retrieve: ");
                    int retrieveId = scanner.nextInt();
                    Product retrievedProduct = inventorySystem.getProduct(retrieveId);
                    if (retrievedProduct != null) {
                        System.out.println("Retrieved Product: " + retrievedProduct);
                        if (retrievedProduct instanceof ElectronicsProduct) {
                            ElectronicsProduct e = (ElectronicsProduct) retrievedProduct;
                            System.out.println("Power Consumption: " + e.getPowerConsumption());
                            System.out.println("Warranty: " + e.getWarranty());
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
