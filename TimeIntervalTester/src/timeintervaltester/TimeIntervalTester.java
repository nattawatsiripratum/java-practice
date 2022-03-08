package timeintervaltester;

import java.util.Scanner;

public class TimeIntervalTester {

    public static void main(String[] args) {
        String sTime;
        String eTime;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter start time: ");
        sTime=input.nextLine();
        System.out.print("Enter end time: ");
        eTime=input.nextLine();
        
        TimeInterval timeIn =new TimeInterval(sTime,eTime);
        System.out.println(timeIn.getHours()+" hours "+timeIn.getMinutes()+" minutes");
    }
    
}
