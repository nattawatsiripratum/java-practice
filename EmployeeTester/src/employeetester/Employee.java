package employeetester;

public class Employee {
    private String name;
    private int year;
    private double salary;
    
    public Employee(String name, int year, double salary) {
        this.name = name;
        this.year = year;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getStartYear() {
        return year;
    }
    
    public double getSalary() {
        return salary;
    }
}