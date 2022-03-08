package startriangle;

import java.util.Scanner;

public class StarTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = input.nextInt();
        for (int i=1;i<=num;i++) {
            String enter = new String(new char[num-i]).replace("\0", " ");
            String repeted = new String(new char[i]).replace("\0", "**");
            System.out.println(enter+repeted);
        }   
    }   
}