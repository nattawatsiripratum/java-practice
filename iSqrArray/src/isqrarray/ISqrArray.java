package isqrarray;

import java.util.Arrays;

public class ISqrArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i=1;i<=10;i++) array[i-1]=i*i;
        System.out.println(Arrays.toString(array));
        for (int i: array) System.out.println(i);
    }
    
}
