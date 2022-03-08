package accounttest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AccountTest {
    
    public static boolean chkDigit(String text, List<String> array) {
        boolean show = false;
        List<String> num = array;
        
        for (int i=0; i<text.length(); i++) {
            if (!num.contains(text.substring(i, i+1))) {
                show = true;
                break;
            }
        }
        return show;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String accName1, accName2, initday1, initday2;
        String accNo1, accNo2;
        String initamt1, initamt2;
        List<String> num = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        List<String> num_ = Arrays.asList("0","1","2","3","4","5","6","7","8","9",".");
        
        //--------------- For 1 ------------------
        System.out.println("------- For 1 -------");
        System.out.print("Enter acount name: ");
        accName1 = input.nextLine();
        System.out.print("Enter acount NO.: ");
        accNo1 = input.nextLine();
        boolean digit15_1 = accNo1.length()!=15, 
                digitnum_1=chkDigit(accNo1, num);

        while (digit15_1 || digitnum_1) {
            if (digit15_1)
                System.out.println("---- Must be 15-digit number ----");
            if (digitnum_1)
                System.out.println("---- Digit only ----");
            System.out.print("Enter acount NO.: ");
            accNo1 = input.nextLine();
            digit15_1 = accNo1.length()!=15; 
            digitnum_1=chkDigit(accNo1,num);
        }
        
        System.out.print("Enter initial deposit: ");
        initamt1 = input.nextLine();
        while (chkDigit(initamt1,num_) || Double.parseDouble(initamt1)<0) {
            System.out.println("---- Must be positive amount ----");
            System.out.print("Enter initial deposit: ");
            initamt1 = input.nextLine();
        }
        
        System.out.print("Enter initial day (yyyy-mm-dd): ");
        initday1 = input.nextLine();
        
        //--------------- For 2 ------------------
        System.out.println("\n------- For 2 -------");
        System.out.print("Enter acount name: ");
        accName2 = input.nextLine();
        System.out.print("Enter acount NO.: ");
        accNo2 = input.nextLine();
        boolean digit15_2 = accNo2.length()!=15, 
                digitnum_2=chkDigit(accNo2,num);

        while (digit15_2 || digitnum_2) {
            if (digit15_2)
                System.out.println("---- Must be 15-digit number ----");
            if (digitnum_2)
                System.out.println("---- Digit only ----");
            System.out.print("Enter acount NO.: ");
            accNo2 = input.nextLine();
            digit15_2 = accNo2.length()!=15; 
            digitnum_2=chkDigit(accNo2,num);
        }
        
        System.out.print("Enter initial deposit: ");
        initamt2 = input.nextLine();
        while (chkDigit(initamt2,num_) || Double.parseDouble(initamt2)<0) {
            System.out.println("---- Must be positive amount ----");
            System.out.print("Enter initial deposit: ");
            initamt2 = input.nextLine();
        }
        
        System.out.print("Enter initial day (yyyy-mm-dd): ");
        initday2 = input.nextLine();
        
        // -------------------- Main -----------------------
        
        Account account1 = new Account(accNo1, accName1, Double.parseDouble(initamt1), initday1);
        Account account2 = new Account(accNo2, accName2, Double.parseDouble(initamt2), initday2);
        
        
        System.out.print(">> ");
        String order = input.next();
        while (true) {
            String day = "";
            String amt = "";
            
            if (order.equals("S")) break;
            
            if ("DWTRQP".contains(order)) {
                if (!"RQP".contains(order)) {
                    amt = input.next();
                    while (chkDigit(amt,num_) || Double.parseDouble(amt)<0) {
                    System.out.println("---- Must be positive amount ----");
                    amt = input.next();
                    }
                }
                if (!order.equals("P")) {
                    day = input.next();
                }       

                switch(order) {
                    case "D" : account1.deposit(Double.parseDouble(amt), day); break;
                    case "W" : 
                        if (account1.getBalance()>=Double.parseDouble(amt))
                            account1.withdraw(Double.parseDouble(amt), day); 
                        else System.out.printf("Not enough momey to withdraw. You have %.2f\n",account1.getBalance());
                        break;
                    case "T" : 
                        if (account1.getBalance()>=Double.parseDouble(amt))
                            account1.transfer(account2,Double.parseDouble(amt), day); 
                        else System.out.printf("Not enough momey to transfer. You have %.2f\n",account1.getBalance());
                        break;
                    case "R" : account1.undo(day); break;
                    case "Q" : System.out.println(account1.getTransInDay(day)); break;
                    case "P" : System.out.println(account1.toString()); break;
                }
            }
            System.out.print(">> ");
            order = input.next();
        }
        System.out.println("\n"+account2.toString());
    }
}