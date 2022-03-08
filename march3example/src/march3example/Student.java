package march3example;

public class Student {
    private String name;
    private long sid;
    private Transcript tr;
    
    public Student(String name, long sid) {
        this.name=name;
        this.sid=sid;
        tr = new Transcript();
    }
    
    public void enroll(int cid, int year, int semester) {
        CourseReg r = new CourseReg(cid, year, semester);
        tr.add(r);
    }
    
    public void gradeReg(int cid, int year, int semester, String grade) {
        
    }
    
    public String toString() {
        return name+" : "+sid+"\n"+tr.toString();
    }
}
