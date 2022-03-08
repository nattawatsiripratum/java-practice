package accounttest;

import java.util.Arrays;
import java.util.List;

public class transaction {
    private String type;
    private String timeSt;
    private double amt;
    
    public transaction(String type, String timeSt, double amt) {
        this.type=type;
        this.timeSt=timeSt;
        this.amt=amt;
    }
    
    public String getTimeSt() {
        return timeSt;
    }
    
    public String getType() {
        return type;
    }
    
    public double getAmt() {
        return amt;
    }
    
    public String toString() {
        return type+" "+timeSt+" "+String.format("%.2f",amt);
    }
}