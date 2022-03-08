package pizzatester;

public class Pizza {
    private String name;
    private double price;
    
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String toString() {
        return name+" price : "+price;
    }
}