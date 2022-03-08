package payrollsystemtest;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String emplID;
    
    public Employee(String firstName, String lastName,String emplID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emplID = emplID;
    }
    
    public abstract double earnings();
    
    public String toString() {
        return getClass().getSimpleName()+":"+firstName+" "+lastName+"\nID : "+emplID;
    }
}