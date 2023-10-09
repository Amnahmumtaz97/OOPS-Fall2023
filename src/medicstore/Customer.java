package medicstore;

public class Customer {
    private final int customerId;
    private String name;
//
//    public Customer() {
//        this.customerId = 001;
//        this.name = "amnah";
//    }

    //default constructor is linked to toString
    @Override
    public String toString() {
        return
                "customerId= " + customerId + ", name= " + name;
    }

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

