package payrollsystemtest;

public class CommissionEmployee extends Employee{
    private double geossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName,String emplID,double geossSales, double commissionRate) {
        super(firstName, lastName, emplID);
        this.geossSales = geossSales;
        this.commissionRate = commissionRate;
    }
    
    public double earnings() {
        return this.commissionRate*this.geossSales;
    }
    
    public String toString() {
        return super.toString()+"\ngross sales: "+this.geossSales+"\ncommission rate: "+this.commissionRate;
    }
}