package week6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem(100);
        Scanner scanner = new Scanner(System.in);

        int option = -1;

        while (option != 0) {
            System.out.println("Select an option:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Retrieve Product");
            System.out.println("0. Exit");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    ims.addProduct(new ElectronicsProduct(1, "Laptop", 999.99, 10, 65, 24));
                    ims.addProduct(new Furniture(2, "Sofa", 499.99, 5, "Leather", 3));
                    ims.addProduct(new GroceriesProduct(3, "Banana", 0.49, 100, "02/09/23", 50));
                    break;
                case 2:
                    ims.updateProduct(3,new GroceriesProduct(3, "Almond", 0.49, 100, "02/09/23", 50));

                    ims.updateProduct(1, new ElectronicsProduct(1, "Laptop Pro", 1099.99, 15, 75, 36));
                    break;
                case 3:
                    ims.removeProduct(2);
                    break;
                case 4:
                    ims.retrieveProduct(3);
                    break;
            }
        }

        scanner.close();
    }
}