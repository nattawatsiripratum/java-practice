package employeetester;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee emp = new Employee("Nattawat",2012,35000);
        Salesman sale = new Salesman("Pornnapa",2020,40000,500,0.2);
        Secretary sec = new Secretary("Somkran",1982,50002.30,180);
        
        System.out.println("Employee:\n"+"\tname: "+emp.getName()+"\n\tYear: "+emp.getStartYear()+"\n\tSalary: "+emp.getSalary());
        System.out.println("\n"+"Salesman:\n"+"\tname: "+sale.getName()+"\n\tYear: "+sale.getStartYear()+"\n\tSalary: "+sale.getSalary());
        System.out.println("\n"+"Secretary:\n"+"\tname: "+sec.getName()+"\n\tYear: "+sec.getStartYear()+"\n\tSalary: "+sec.getSalary()+"\n\tTyping: "+sec.getTyping());
    }
    
}
