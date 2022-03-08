package suminput;

import java.util.Scanner;

public class SumInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive number (enter -1 to stop): ");
        int sum = 0;
        while (input.hasNext()) {
            int num = input.nextInt();
            if (num!=-1) sum+=num;
            else break;
        }
        System.out.println("sum = "+sum);
    } 
}
