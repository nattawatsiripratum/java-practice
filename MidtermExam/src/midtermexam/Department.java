package midtermexam;

import java.util.ArrayList;

public class Department {
    private String name;
    private String head;
    private ArrayList<Staff> team = new ArrayList<>();
    
    public Department(String name,Staff data) {
        this.name=name;
        head=data.getName();
        addStaff(data);
    }
    
    public void addStaff(Staff s) {
        team.add(s);
    }
    
    public Staff findStaff(String name) {
        Staff show = null;
        for (Staff data: team) {
            if (data.getName().equals(name))
                show = data;
        }
        return show;
    }
    
    public int getHeadSalary() {
        return team.get(0).getSalary();
    }
    
    public int countStaff() {
        return team.size();
    }
    
    public int getPayroll() {
        int sum=0;
        for (Staff data: team) {
            sum+=data.getSalary();
        }
        return sum;
    }
}
