package week6;

class GroceriesProduct extends Product {
    private String expiryDate;
    private int nutritionValue;


    public GroceriesProduct(int id, String name, double price, int stockQuantity, String expiryDate, int nutritionValue) {
        super(id, name, price, stockQuantity);
        this.expiryDate = expiryDate;
        this.nutritionValue = nutritionValue;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getNutritionValue() {
        return nutritionValue;
    }

    public void setNutritionValue(int nutritionValue) {
        this.nutritionValue = nutritionValue;
    }
}
