package findinteger;

import java.util.Scanner;

public class FindInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        do num = input.nextInt();
        while (num<=0);
        System.out.printf("A positive number is %d.\n",num);
    }
}
