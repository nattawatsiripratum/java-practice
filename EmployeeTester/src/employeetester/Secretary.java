package employeetester;

public class Secretary extends Employee {
    private int typing;
    
    public Secretary(String name, int year, double salary, int typing) {
        super(name, year, salary);
        this.typing = typing;
    }
    
    public int getTyping() {
        return typing;
    }
}
