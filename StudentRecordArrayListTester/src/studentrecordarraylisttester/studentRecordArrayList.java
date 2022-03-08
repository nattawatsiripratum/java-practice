package studentrecordarraylisttester;

public class studentRecordArrayList {
    private String name, major;
    private long sid;
    
    public studentRecordArrayList(String name, long sid, String major) {
        this.major=major; this.name=name; this.sid=sid;
    }
    
    public String getMajor() {
        return major;
    }

    public long getSid() {
        return sid;
    }
    
    public String getName() {
        return name;
    }
    
}
