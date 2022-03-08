package studenttester;

public final class Student {
    private String name;
    private long sid;
    private int score;
    private String grade;
    
    public Student(String name, long sid) {
        this.name=name;
        this.sid=sid;
    }
    
    public Student(String name, long sid, int score) {
        this.name=name;
        this.sid=sid;
        this.score=score;
        grade=this.calGrade();
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public void setID(long sid) {
        this.sid=sid;
    }
    
    public void setScore(int score) {
        this.score=score;
        grade=this.calGrade();
    }
    
    public void setGrade(String grade) {
        this.grade=grade;
    }
    
    public String getName() {
        return name;
    }
    
    public long getID() {
        return sid;
    }
    
    public int getScore() {
        return score;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public String calGrade() {
        String text="";
        if (score<0 || score>100) text="X";
        else if (score<50) text="F";
        else if (score>=80) text="A";
        else if (score>=75) text="B+";
        else if (score>=70) text="B";
        else if (score>=65) text="C+";
        else if (score>=60) text="C";
        else if (score>=55) text="D+";
        else if (score>=50) text="D";
        return text;
    }    
}