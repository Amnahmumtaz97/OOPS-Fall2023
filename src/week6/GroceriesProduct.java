package week6;

class GroceriesProduct extends Product {
    private int nutritionValue;
    private Date date;

    public GroceriesProduct(int id, String name, double price, int stockQuantity, int nutritionValue, Date date) {
        super(id, name, price, stockQuantity);
        this.nutritionValue = nutritionValue;
        this.date = date;
    }

    public int getNutritionValue() {
        return nutritionValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNutritionValue(int nutritionValue) {
        this.nutritionValue = nutritionValue;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +
                ", Name: " + getName() +
                ", Price: " + getPrice() +
                ", Stock Quantity: " + getStockQuantity() +
                ", Nutrition Value: " + nutritionValue +
                ", Date: " + date;
    }
}
