package isqrarraylist;

import java.util.ArrayList;

public class ISqrArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<10; i++) arrayList.add((i+1)*(i+1));
        for (int i: arrayList) System.out.println(i);
        System.out.println(arrayList);
    }   
}
