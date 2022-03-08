package studentrecordarraytester;

import java.util.Scanner;

public class StudentRecordArrayTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentRecordArray[] student = new StudentRecordArray[5];
        for (int i=0; i<5; i++) {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter student ID: ");
            long sid = Long.parseLong(input.nextLine());
            System.out.print("Enter major: ");
            String major = input.nextLine();
            student[i]=new StudentRecordArray(name,sid,major);
        }
        
        int comSci=0;
        for (StudentRecordArray std: student) {
            if (std.getMajor().equals("Computer Science")) comSci++;
        }
        System.out.println("Computer Science: "+comSci);
    }
}
