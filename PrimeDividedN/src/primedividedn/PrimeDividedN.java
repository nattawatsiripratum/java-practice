package primedividedn;

import java.util.Scanner;

public class PrimeDividedN {
    public static boolean isPrime(int num) {
        int cnt = 2;
        for (int i=2; i<num; i++) {
            if (num%i!=0) cnt++;
            else break;
        }
        return cnt==num;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        int cnt = 0;
        String show = "";
        for (int i=1;i<=num;i++) {
            if (isPrime(i) && num%i==0) {
                cnt++;
                show+=i+", ";
            }
        }
        if (show.length()>=2) System.out.println("Set of prime number that divided by "+num+" is {"+show.substring(0, show.length()-2)+"} and they are "+cnt+" element(s).");
        else System.out.println("Set of prime number that divided by "+num+" is "+ "empty set.");
        
    }
    
}
