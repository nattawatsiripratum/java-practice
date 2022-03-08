package march3example;

import java.util.Arrays;
import java.util.List;

public class CourseReg {
    private int crs, year, semester;
    private String grade;
    
    private static final List<String> GRADELIST = Arrays.asList("A","B+","B","C+","C","D+","D","F","S","W");
    
    public CourseReg(int crs, int year, int semester) {
        assert(year>2560 && semester>=1 && semester<=3);
        this.crs=crs;
        this.semester=semester;
        this.year=year;
    }
    
    public int getCID() {
        return crs;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getSemester() {
        return semester;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public void setGrade(String grade) {
        assert(GRADELIST.contains(grade));
        this.grade=grade;
    }
    
    public String toString() {
        return crs+" "+year+" "+semester+" "+grade;
    }
    
    
}
