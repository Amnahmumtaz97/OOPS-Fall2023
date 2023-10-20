package week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem(100);

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
                    System.out.print("Subcategory: ");
            String subcategory = scanner.nextLine();

                    Product newProduct;
            if (category.equals("Electronics")) {
                   newProduct = new ElectronicsProduct(id, name, price, stockQuantity, category, subcategory);
               } else if (category.equals("Furniture")) {
                    newProduct = new Furniture(id, name, price, stockQuantity, category, subcategory);
              } else if (category.equals("Groceries")) {
                   newProduct = new GroceriesProduct(id, name, price, stockQuantity, category, subcategory);
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
               System.out.print("Subcategory: ");
              String updateSubcategory = scanner.nextLine();

                    Product updatedProduct;
        if (updateCategory.equals("Electronics")) {
                        updatedProduct = new ElectronicsProduct(updateId, updateName, updatePrice, updateStockQuantity, updateCategory, updateSubcategory);
                    }
             else if (updateCategory.equals("Furniture")) {
                        updatedProduct = new Furniture(updateId, updateName, updatePrice, updateStockQuantity, updateCategory, updateSubcategory);
                    }
                  else if (updateCategory.equals("Groceries")) {
                        updatedProduct = new GroceriesProduct(updateId, updateName, updatePrice, updateStockQuantity, updateCategory, updateSubcategory);
                    }
               else {
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
                  System.out.println("Retrieved Product: " + retrievedProduct.getName());
             System.out.println("Price: " + retrievedProduct.getPrice());
              System.out.println("Stock Quantity: " + retrievedProduct.getStockQuantity());
               }
        else {
            System.out.println("Product not found.");
              }
              break;

                case 5:
                    scanner.close();
                 System.exit(0);

             default:
           System.out.println("Invalid choice. Please enter a valid option.");
        }
     }
  }
}
