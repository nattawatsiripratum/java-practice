package inputprime100arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class InputPrime100ArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int chkP = input.nextInt();
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        int number=3;
        while (prime.size()<100) {
            int cnt = 0;
            for (int i=2; i<number; i++) 
                if (number%i!=0) cnt++;
            if (cnt==number-2) prime.add(number);
            number++;
        }
        if (prime.contains(chkP)) 
                System.out.println(chkP+" is a prime number in "+prime+
                        "\nPosition = "+(prime.indexOf(chkP)+1));
        else 
            System.out.println(chkP+" is not a prime number in "+prime);
    }   
}