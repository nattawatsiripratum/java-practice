package payrollsystemtest;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName,String emplID, double weeklySalary) {
        super(firstName, lastName, emplID);
        this.weeklySalary = weeklySalary;
    }
    
    public double earnings() {
        return weeklySalary;
    }
    
    public String toString() {
        return super.toString()+"\nweekly salary: "+weeklySalary;
    }
}