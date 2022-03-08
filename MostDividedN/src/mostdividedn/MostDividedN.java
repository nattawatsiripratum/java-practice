package mostdividedn;

import java.util.Scanner;

public class MostDividedN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n>2: ");
        int n = input.nextInt();
        for (int i=n-1; i>=2 ;i--) {
            if (n%i==0) {
                System.out.printf("The Largest number that divided by %d is %d\n",n,i);
                break;
            }
        } 
    }  
}