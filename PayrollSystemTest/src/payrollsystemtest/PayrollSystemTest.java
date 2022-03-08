package payrollsystemtest;

public class PayrollSystemTest {
    public static void main (String args[]) {
        //create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee ("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee ("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee ("Sue", "Jones", "333-33-3333", 10000, .06);

        System.out.println ("Employees processed individually:\n");
        System.out.println (salariedEmployee + " earned : " + salariedEmployee.earnings() + "\n");
        System.out.println (hourlyEmployee + " earned : " + hourlyEmployee.earnings() + "\n");
        System.out.println (commissionEmployee + " earned : " + commissionEmployee.earnings() + "\n");

        Employee employees[] = new Employee[3]; 
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee; 
        System.out.println("Employees processed polymorphically:\n");
        // generically process each element in array employees
        for (int i = 0; i<employees.length; i++) {
            if (employees[i] instanceof HourlyEmployee) {
                HourlyEmployee employee = (HourlyEmployee) employees[i];
                employee.setWage(18);
            }
            System.out.println(employees[i] + " earned: " + employees[i].earnings() + "\n");
        }
    }
}