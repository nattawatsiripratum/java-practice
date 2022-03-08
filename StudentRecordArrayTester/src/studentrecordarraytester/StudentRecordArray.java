package studentrecordarraytester;

public class StudentRecordArray {
    private String name;
    private long sid;
    private String major;
    
    public StudentRecordArray(String name, long sid, String major) {
        this.name=name; this.major=major; this.sid=sid;
    }
    
    public String getMajor() {
        return major;
    }
}
