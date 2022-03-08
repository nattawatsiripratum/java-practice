package summeanmaxminarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SumMeanMaxMinArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter size of ArrayList(>0): ");
        int size = input.nextInt();
        for (int i=0; i<size;i++) {
            System.out.print("Enter number: ");
            arrayList.add(input.nextInt());
        }
        int sum = 0;
        int max = arrayList.get(0);
        int min = arrayList.get(0);
        for (int data : arrayList) {
            sum+=data;
            max = max>data?max:data;
            min = min>data?data:min;
        }
        System.out.println("Sum     of "+arrayList+" is "+sum);
        System.out.printf("Average of %s is %.2f\n",arrayList,(float) sum/arrayList.size());
        System.out.println("Maximum of "+arrayList+" is "+max);
        System.out.println("Minimum of "+arrayList+" is "+min);
    }   
}