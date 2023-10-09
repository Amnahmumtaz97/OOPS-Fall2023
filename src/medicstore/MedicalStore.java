package medicstore;

public class MedicalStore {
    private final Product[] products;
    private int productCounter;
    private final Customer[] customers;
    private int customerCounter;

    private final Medicine[] medicines;
    private int medicineCounter;

    public MedicalStore(int maximumProducts, int maximumCustomers, Medicine[] medicines, int medicineCounter) {
        products = new Product[maximumProducts];
        customers = new Customer[maximumCustomers];
        this.medicines = medicines;
        this.medicineCounter = medicineCounter;
        productCounter = 0;
        customerCounter = 0;
    }

    public void addProduct(Product product) {
        if (productCounter < products.length) {
            products[productCounter++] = product;
        } else {
            System.out.println("Product inventory is full.");
        }
    }

    public void addCustomer(Customer customer) {
        if (customerCounter < customers.length) {
            customers[customerCounter++] = customer;
        } else {
            System.out.println("Customer database is full.");
        }
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < productCounter; i++) {
            Product product = products[i];
            System.out.println("Product ID: " + product.getProductID() +
                    ", Name: " + product.getName() +
                    ", Price: " + product.getPrice() +
                    ", Type: " + product.getTypeOfProduct());

            if (product.getTypeOfProduct() == ProductType.MEDICINE) {
                Medicine medicine = (Medicine) product;
                System.out.println("Manufacturer: " + medicine.getManufacturer() +
                        ", Stock: " + medicine.getStock());
            }
        }
    }

    public void displayCustomers() {
        System.out.println("Registered Customers:");
        for (int i = 0; i < customerCounter; i++) {
            System.out.println("Customer ID: " + customers[i].getCustomerId() +
                    ", Name: " + customers[i].getName());
        }
    }

    public void sellMedicine(int productId, int customerId, int quantity) {
        for (int i = 0; i < productCounter; i++) {
            Product product = products[i];
            if (product.getProductID() == productId) {
                if (product.getTypeOfProduct() == ProductType.MEDICINE) {
                    Medicine medicine = (Medicine) product;
               int currentStock = medicine.getStock();
               if (currentStock >= quantity) {

                 if(productId==4)
                  {
                      System.out.println("Sold units of Product ID: " + productId + " to customer"+ customerId);
                 }
               else {
                   medicine.setStock(currentStock - quantity);
                   System.out.println("Sold " + quantity + " units of medicine (Product ID: " +
                           productId + ") to customer " + customerId);
               }
                }
             else {
               System.out.println("Insufficient stock for product (Product ID: " + productId + ")");
                    }
                } else {
                    System.out.println("Product (Product ID: " + productId + ") is not a medicine.");
                    System.out.println("Product (Product ID: " + productId + ") sold to customer"+customerId);
                }
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }
}

