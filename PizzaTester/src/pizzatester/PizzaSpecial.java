package pizzatester;

public class PizzaSpecial extends Pizza{
    private String special;
    
    public PizzaSpecial(String name, double price, String special) {
        super(name, price);
        this.special = special;
    }
    
    public String toString() {
        return super.toString()+" special : "+special;
    }
}