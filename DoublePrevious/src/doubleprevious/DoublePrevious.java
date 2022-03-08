package doubleprevious;

import java.util.Scanner;

public class DoublePrevious {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int now;
        int pre = input.nextInt();
        for (int i=0; i<9; i++) {
            now = input.nextInt();
            if (now==2*pre) System.out.println(">> "+now);
            pre=now;
        }
    }  
}