package week6;

class GroceriesProduct extends Product {
    private String category;
    private String subCategory;

    public GroceriesProduct(int id, String name, double price, int stockQuantity, String category, String subCategory) {
        super(id, name, price, stockQuantity);
        this.category = category;
        this.subCategory = subCategory;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

}
