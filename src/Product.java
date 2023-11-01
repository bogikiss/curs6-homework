// ex 3
public class Product {
    private String name;
    private double price;
    private Integer quantity;
    private String category;

    public Product(String name, double price, Integer quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (quantity != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategory(String category) {
        if (this.category.equals(category)) {
            return true;
        } else {
            return false;
        }
    }
}
