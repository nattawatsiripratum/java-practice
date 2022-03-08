package midtermexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MidtermExam {

    public static void main(String[] args) {
        Department test = new Department("OOO",new Staff("Mickey",22,2000));
        test.addStaff(new Staff("Mickey2",22,400000));
        test.addStaff(new Staff("Mickey3",22,403000));
        System.out.println(test);
        
    }
}
