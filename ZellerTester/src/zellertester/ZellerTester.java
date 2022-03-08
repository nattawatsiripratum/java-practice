package zellertester;

import java.util.Scanner;

public class ZellerTester {
    
    public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);
        System.out.print("Enter year, month, day (e.g., 2012 3 31): ");
        Zeller zeller=new Zeller(input.nextInt(),input.nextInt(),input.nextInt());
        String day=zeller.getDayOfWeek().toString();
        System.out.println("Day of the week is "+day.substring(0,1)+day.substring(1).toLowerCase());
    }  
}
