package sodacantester;

import java.util.Scanner;

public class SodaCanTester {

    public static void main(String[] args) {
        double height;
        double diameter;
        
        Scanner input=new Scanner(System.in);   
        System.out.print("Enter height: ");
        height=input.nextDouble();
        System.out.print("Enter diameter: ");
        diameter=input.nextDouble();
        
        SodaCan scan=new SodaCan(height, diameter);
        System.out.printf("Volume: %.2f\n",scan.getVolume());
        System.out.printf("Surface area: %.2f\n",scan.getSurfaceArea());
    }   
}
