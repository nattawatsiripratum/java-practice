package timeintervaltester;

public class TimeInterval {
    private int invMin;
    private int invHr;
    
    public TimeInterval(String sTime, String eTime){
        invMin=Integer.parseInt(eTime.substring(2, 4))-Integer.parseInt(sTime.substring(2, 4));
        invHr=Integer.parseInt(eTime.substring(0, 2))-Integer.parseInt(sTime.substring(0, 2));
    }
    
    public int getHours() {
        if (invMin>=0) return invHr;
        else return invHr-1;
    }
    
    public int getMinutes() {
        if (invMin>=0) return invMin;
        else return invMin+60;
    }
}