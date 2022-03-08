package prime100arraylist;

import java.util.ArrayList;

public class Prime100ArrayList {

    public static void main(String[] args) {
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
    System.out.println(prime);
    }
}
