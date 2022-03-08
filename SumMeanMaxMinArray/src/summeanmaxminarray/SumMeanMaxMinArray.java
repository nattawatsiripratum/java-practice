package summeanmaxminarray;

import java.util.Arrays;
import java.util.Scanner;

public class SumMeanMaxMinArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array(>0): ");
        int size=input.nextInt();
        int[] array = new int[size];
        int sum=0;
        for (int i=0;i<array.length;i++) {
            System.out.print("Enter number: ");
            array[i]=input.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for (int i: array) {
            sum+=i;
            max=i>max?i:max;
            min=i>min?min:i;
        }
        System.out.println("Sum     of "+Arrays.toString(array)+" is "+sum);
        System.out.printf("Average of %s is %.2f\n",Arrays.toString(array),(float) sum/array.length);
        System.out.println("Maximum of "+Arrays.toString(array)+" is "+max);
        System.out.println("Minimum of "+Arrays.toString(array)+" is "+min);
    }   
}