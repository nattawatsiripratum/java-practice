package employeetester;

public class Salesman extends Employee{
    private double sale;
    private double commRate;
    
    public Salesman(String name, int year, double salary, double sale, double commRate) {
        super(name, year, salary);
        this.sale = sale;
        this.commRate = commRate;
    }
    
    @Override
    public double getSalary() {
        return super.getSalary()+sale*commRate;
    }
    
    
    
}
