package studentid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentID {

    public static void print(String text) {
        System.out.println(text);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Student ID: ");
        String sid = input.nextLine();
        List<String> num = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        
        boolean digit = false,
                digit10 = sid.length()!=10,
                stw63 = false,
                enw23 = false,
                stw63_enw23 = false;
        
        if (!sid.startsWith("63") && !sid.endsWith("23")) stw63_enw23=true;
        else if (!sid.startsWith("63")) stw63 = true;
        else if (!sid.endsWith("23")) enw23 = true;
        
        for (int i=0; i<sid.length(); i++) {
            if (!num.contains(sid.substring(i, i+1))) {
                digit = true;
                break;
            }
        }
        
        if (digit) print("digit only");
        if (digit10) print("must be 10-digit number");
        if (stw63) print("muse be start with 63");
        if (enw23) print("must end with 23");
        if (stw63_enw23) print("must start with 63 and end with 23");
    }
}