package prime100array;

import java.util.Arrays;

public class Prime100Array {

    public static void main(String[] args) {
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
        System.out.println(Arrays.toString(prime));
    }
}