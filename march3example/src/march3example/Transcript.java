package march3example;

import java.util.ArrayList;


public class Transcript {
    static final ArrayList<Course> CRSLIST = new ArrayList<>();
    static {
        CRSLIST.add(new Course("COMP PROG",2301170,3));
        CRSLIST.add(new Course("COMP PROG LAB",2301172,1));
        CRSLIST.add(new Course("PROG TECH",2301260,4));
        CRSLIST.add(new Course("DATA STR",2301263,4));
    }
    double gpax;
    ArrayList<CourseReg> cReg = new ArrayList<>();
    
    public Transcript() {
        gpax=0;
    }
    
    public String toString() {
        String s="";
        for (CourseReg r : cReg) {
            s+=r.toString()+"\n";
        }
        return s;
    }
    
    public void add(CourseReg c) {
        cReg.add(c);
    }
}