package medicstore;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Medicine m1 = new Medicine("asprin", 10.4, 1, "PharmaHealth", 50);
        Medicine m2 = new Medicine("brufen", 12.6, 2, "PenPalsPharm", 100);
        Medicine m3 = new Medicine("panadol", 7.2, 3, "Medicare", 140);
        Product p4 = new Product("thermometer", 15.9, 4, ProductType.NON_MEDICINE);

        Customer customer1 = new Customer(01, "annaya");
        Customer customer2 = new Customer(02, "amnah");
        Customer customer3 = new Customer(03, "nimra");
        Customer customer4 = new Customer(04, "mannal");


//        System.out.println("CUSTOMERS");
//        Customer c1=new Customer();
//        System.out.println(c1);
//        here customer1 info is displayed using toString string format
//        System.out.println(customer1.toString());
//        System.out.println(customer2.toString());
//        System.out.println(customer3.toString());
//        System.out.println(customer4.toString());


        Medicine[] medicines = new Medicine[10]; // Define an array for medicines
        int medicineCounter = 0; // Initialize the medicine count

        MedicalStore store = new MedicalStore(5, 5, medicines, medicineCounter);


        store.addProduct(m1);
        store.addProduct(m2);
        store.addProduct(m3);
        store.addProduct(p4);


        store.addCustomer(customer1);
        store.addCustomer(customer2);
        store.addCustomer(customer3);
        store.addCustomer(customer4);


        store.displayProducts();
        System.out.println();
        store.displayCustomers();
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        medicines[medicineCounter++] = m1;
        medicines[medicineCounter++] = m2;
        medicines[medicineCounter++] = m3;
        // Customer 1 purchases medicine
        System.out.println();
        System.out.print("Customer 1 (" + customer1.getName() + ") wants to purchase medicine. \n Enter Product ID: ");
        int productId = scanner.nextInt();
        int quantity = 0;

        if (productId != 3) {
            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
        }

        store.sellMedicine(productId, customer1.getCustomerId(), quantity);

        // Customer 2 purchases medicine
        System.out.println();
        System.out.print("Customer 2 (" + customer2.getName() + ") wants to purchase medicine. \n Enter Product ID: ");
        productId = scanner.nextInt();
        quantity = 0;

        if (productId != 3) {
            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
        }

        store.sellMedicine(productId, customer2.getCustomerId(), quantity);

        // Customer 3 attempts to purchase medicine (insufficient stock)
        System.out.println();
        System.out.print("Customer 3 (" + customer3.getName() + ") wants to purchase medicine. \n Enter Product ID: ");
        productId = scanner.nextInt();
        quantity = 0;

        if (productId != 3) {
            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
        }


        store.sellMedicine(productId, customer3.getCustomerId(), quantity);

        // Customer 4 attempts to purchase medicine (insufficient stock)
        System.out.println();
        System.out.print("Customer 4 (" + customer4.getName() + ") wants to purchase medicine. \n Enter Product ID: ");
        productId = scanner.nextInt();
        quantity = 0;

        if (productId != 3) {
            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
        }

        store.sellMedicine(productId, customer4.getCustomerId(), quantity);

        // Display updated product stock
        System.out.println();
        System.out.println("Updated Product Stock:");
        System.out.println();
        store.displayProducts();

        scanner.close();
    }
}
