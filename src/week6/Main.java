package week6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem(10);
//        Scanner scanner = new Scanner(System.in);
//
//        int option = -1;
//
//        while (option != 0) {
//            System.out.println("Select an option:");
//            System.out.println("1. Add Product");
//            System.out.println("2. Update Product");
//            System.out.println("3. Remove Product");
//            System.out.println("4. Retrieve Product");
//            System.out.println("0. Exit");
//            option = scanner.nextInt();
//
//            switch (option) {
//                case 1:
                    ims.addProduct(new ElectronicsProduct(1,
                            "Laptop", 829.32, 10,
                            65, 24));
                    ims.addProduct(new Furniture(2,
                            "Sofa", 200.45,23,
                            "Leather",3));
                    ims.addProduct(new GroceriesProduct(3,
                            "Biscuits", 0.49, 100,
                            50, new Date(2,"january",2023)));
//                    break;
//
//                case 2:
                    ims.updateProduct(3,new GroceriesProduct(3,
                            "Almond", 0.49, 100,2,
                            new Date(1,"february",2023)));

                    ims.updateProduct(1, new ElectronicsProduct(1, "Laptop Pro", 1027.39, 15, 75,
                            36));
//                    break;
//                case 3:
//                    ims.removeProduct(2);
//                    break;
//                case 4:
        ims.retrieveProduct(1);
        ims.retrieveProduct(2);
        ims.retrieveProduct(3);
//                    break;
            }
        }
//
//        scanner.close();
//    }
//}