package digitextractortester;

import java.util.Scanner;

public class DigitExtractorTester {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num=sc.nextInt();
        DigitExtractor digit=new DigitExtractor(num);
        System.out.println(digit.nextDigit());
        System.out.println(digit.nextDigit());
        System.out.println(digit.nextDigit());
        System.out.println(digit.nextDigit());
        System.out.println(digit.nextDigit());
    }
    
}
