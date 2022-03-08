package pizzatester;

public class Customer {
    private String name;
    private String tel;
    
    public Customer(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    
    public String toString() {
        return name+" tel : "+tel;
    }
}
