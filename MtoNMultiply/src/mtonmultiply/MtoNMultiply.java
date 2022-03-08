package mtonmultiply;

import java.util.Scanner;

public class MtoNMultiply {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.print("Enter from m>0 to n>0 (mxn): ");
        String[] num = input.nextLine().split("x");
        m=Integer.parseInt(num[0]);
        n=Integer.parseInt(num[1]);
        if (m>n) {
            int a=m;
            m=n;
            n=a;
        }
        for (int i=m;i<=n;i++) {
            System.out.println("--------------------");
            for (int j=1;j<=12;j++) System.out.printf("%d x %d = %d\n",i,j,i*j);
        }
        System.out.println("--------------------");
    }
}
