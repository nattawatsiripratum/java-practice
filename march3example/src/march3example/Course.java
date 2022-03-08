package march3example;

public class Course {
    String name;
    int credit;
    int cid;
    
    public Course(String name, int cid, int credit) {
        this.name=name;
        this.cid=cid;
        this.credit=credit;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCID() {
        return cid;
    }
    
    public int getCredit() {
        return credit;
    }
    
    public String toString() {
        return name+" : "+credit+" : "+cid;
    }
}