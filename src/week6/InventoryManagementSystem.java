package week6;

class InventoryManagementSystem {
    private Product[] products;
    private int productCount;

    public InventoryManagementSystem(int capacity) {
        products = new Product[capacity];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Inventory is full. Cannot add more products.");
        }
    }

    public void updateProduct(int id, Product newProduct) {
        int index = findProductIndexById(id);
        if (index != -1) {
            products[index] = newProduct;
        } else {
            System.out.println("Product not found.");
        }
    }

    public void removeProduct(int productId) {
        int index = findProductIndexById(productId);
        if (index != -1) {
            removeProductAtIndex(index);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void retrieveProduct(int productId) {
        int index = findProductIndexById(productId);
        if (index != -1) {
            Product retrievedProduct = products[index];
            System.out.println(retrievedProduct);
//            if (retrievedProduct instanceof ElectronicsProduct) {
//                ElectronicsProduct e = (ElectronicsProduct) retrievedProduct;
//                System.out.println("Power Consumption: " + e.getPowerConsumption());
//                System.out.println("Warranty: " + e.getWarranty());
//            }
        } else {
            System.out.println("Product not found.");
        }
    }

    private int findProductIndexById(int productId) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == productId) {
                return i;
            }
        }
        return -1; // Product not found
    }

    private void removeProductAtIndex(int index) {
        for (int j = index; j < productCount - 1; j++) {
            products[j] = products[j + 1];
        }
        products[productCount - 1] = null;
        productCount--;
    }
}