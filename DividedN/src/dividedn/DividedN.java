package dividedn;

import java.util.Scanner;

public class DividedN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n>1: ");
        int cnt = 2;
        String div = "1, ";
        int n = input.nextInt();
        for (int i=2; i<n ;i++) {
            if (n%i==0) {
                div+=i+", ";
                cnt++;
            }
        }
        div+=n;
        System.out.printf("List of number that divided by %d is {%s} and they are %d elements.\n",n,div,cnt);
    }  
}