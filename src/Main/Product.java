package Main;

public class Product {
    private String name;
    private String color;
    private String category;
    private int stock;
    private double weight;
    private String description;

    public Product(String name, String color, String category, int stock, double weight, String description) {
        this.name = name;
        this.color = color;
        this.category = category;
        this.stock = stock;
        this.weight = weight;
        this.description = description;
    }

    public void orderProduct(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + name + "(s) ordered successfully.");
        } else {
            System.out.println("Insufficient stock for " + name + ".");
        }
    }

    // Getters and setters for the Product class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
