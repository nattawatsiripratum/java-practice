package input;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int num=input.nextInt();
        while (num>0) {
            numList.add(num);
            num=input.nextInt();
        }
        for (int i: numList)
            System.out.println(i);
    }
    
}
