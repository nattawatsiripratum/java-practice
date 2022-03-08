package studentrecordarraylisttester;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecordArrayListTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<studentRecordArrayList> student=new ArrayList<>();
        for (int i=0; i<5; i++) {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter student ID: ");
            long sid = Long.parseLong(input.nextLine());
            System.out.print("Enter major: ");
            String major = input.nextLine();
            student.add(new studentRecordArrayList(name,sid,major)); 
        }
        
        int cntComSci = 0;
        for (studentRecordArrayList std: student)
            if (std.getMajor().equals("Computer Science"))
                    cntComSci++;
        System.out.println("Computer Science: "+cntComSci);
        
        System.out.print("Enter sid if you want to delete: ");
        long sid = Long.parseLong(input.nextLine());
        for (int i=student.size()-1; i>=0; i--) 
            if (sid==student.get(i).getSid()) student.remove(i);
       
        System.out.println("size = "+student.size());
        for (studentRecordArrayList std: student)
            System.out.printf("Name     : %s\nStudent ID: %d\nMajor    : %s\n",std.getName(),std.getSid(),std.getMajor());
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter student ID: ");
        long sid2 = Long.parseLong(input.nextLine());
        System.out.print("Enter major: ");
        String major = input.nextLine();
        System.out.print("Enter position: ");
        int pos = input.nextInt();
        student.add(pos, new studentRecordArrayList(name,sid2,major));
        
        System.out.println("size = "+student.size());
        for (studentRecordArrayList std: student)
            System.out.printf("Name     : %s\nStudent ID: %d\nMajor    : %s\n",std.getName(),std.getSid(),std.getMajor());        
    }
}