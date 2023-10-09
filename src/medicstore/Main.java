
package medicstore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("asprin", 10.4, 1, "PharmaHealth", 50);
        Medicine m2 = new Medicine("brufen", 12.6, 2, "PenPalsPharm", 100);
        Medicine m3 = new Medicine("panadol", 7.2, 4, "Medicare", 140);
        Product p4 = new Product("thermometer", 15.9, 3, ProductType.NON_MEDICINE);

        Customer customer1 = new Customer(01, "annaya");
        Customer customer2 = new Customer(02, "amnah");
        Customer customer3 = new Customer(03, "nimra");
        Customer customer4 = new Customer(04, "mannal");

        Medicine[] medicines = new Medicine[10];
        int medicineCounter = 0;

        MedicalStore store = new MedicalStore(5, 5, medicines, medicineCounter);

        store.addProduct(m1); store.addProduct(m2);
        store.addProduct(m3); store.addProduct(p4);

        store.addCustomer(customer1); store.addCustomer(customer2);
        store.addCustomer(customer3); store.addCustomer(customer4);

        store.displayProducts();
        System.out.println();

        store.displayCustomers();
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        //Loop to take inputs from customers one by one.
        Customer[] customers = {customer1, customer2, customer3, customer4};
        for (Customer customer : customers) {
            System.out.println();
            System.out.print("Customer (" + customer.getName() +
                    ") wants to purchase medicine. " +
                    "\n Enter Product ID: ");
            int productId = scanner.nextInt();
            int quantity = 0;

            if (productId != 3) {
                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();
            }

            store.sellMedicine(productId, customer.getCustomerId(), quantity);
        }

        // Display updated product stock
        System.out.println();
        System.out.println("Updated Product Stock:");
        System.out.println();
        store.displayProducts();

        scanner.close();
    }
}
