package inputmt;

import java.util.Scanner;

public class InputMT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String flag="No";
        int cnt=0;
        for (int i=0; i<text.length();i++) {
            if (text.substring(i,i+1).equals("M")) flag="M";
            if ("M".equals(flag) && text.substring(i,i+1).equals("N")) flag="N";
            if ("N".equals(flag)) {
                cnt++;
                flag="No";
            }
        }
        System.out.println(cnt);
    }   
}