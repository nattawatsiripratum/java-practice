package pairn;

import java.util.Scanner;

public class PairN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String show="";
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        for (int i=1; i<num; i++) {
            if (num%i==0) {
                show+="("+i+","+num/i+"), ";
            }
        }
        show+="("+num+","+1+")}.";
        System.out.println("Set of (n,m) such that nxm = "+num+" is "+"{"+show);
    }  
}
