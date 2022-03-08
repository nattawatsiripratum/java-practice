package payrollsystemtest;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    
    public HourlyEmployee(String firstName, String lastName,String emplID,double wage, double hours) {
        super(firstName, lastName, emplID);
        this.hours = hours;
        this.wage = wage;
    }
    
    public double earnings() {
        double sum = 0;
        if (hours<=40) sum=wage*hours;
        else sum=40*wage+(hours-40)*wage*1.5;
        return sum;
    }
    
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public String toString() {
        return super.toString()+"\nhourly wage: "+wage+"\nhourly worked: "+hours;
    }
}
