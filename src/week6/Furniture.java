package week6;


class Furniture extends Product {
    private String material;
    private int dimension;

    public Furniture(int id, String name, double price, int stockQuantity, String material, int dimension) {
        super(id, name, price, stockQuantity);
        this.material = material;
        this.dimension = dimension;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
