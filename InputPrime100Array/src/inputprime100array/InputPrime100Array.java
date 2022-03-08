package inputprime100array;

import java.util.Arrays;
import java.util.Scanner;

public class InputPrime100Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int chkP = input.nextInt();
        int[] prime = new int[100];
        prime[0]=2;
        int cnt=1;
        int number=3;
        while (cnt<100) {
            int chk = 0;
            for (int i=2; i<number; i++) 
                if (number%i!=0) chk++;
            
            if (chk==number-2) {
                prime[cnt]=number;
                cnt++;
            }
            number++;
        }
        int flag = 0;
        for (int i=0; i<prime.length;i++) {
            if (chkP==prime[i]) {
                System.out.println(prime[i]+" is a prime number in "+Arrays.toString(prime)+
                        "\nPosition = "+(i+1));
                break;
            }
            flag++;
        }
        if (flag==prime.length) System.out.println(chkP+" is not prime number in "+Arrays.toString(prime));
    }   
}