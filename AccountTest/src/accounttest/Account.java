package accounttest;

import java.util.ArrayList;

public class Account {
    private String accNo;
    private String accName;
    private double balance;
    private ArrayList<transaction> book = new ArrayList<>();
    
    public Account(String accNo, String accName) {
        this.accName = accName;
        this.accNo = accNo;
        balance = 0;
    }
    
    public Account(String accNo, String accName,double balance, String initday) {
        this.accName = accName;
        this.accNo = accNo;
        this.balance = balance;
        book.add(new transaction("deposit", initday, balance));
    }
    
    public void deposit(double amt, String timeSt) {
        book.add(new transaction("deposit", timeSt, amt));
        balance+=amt;
    }
    
    public void withdraw(double amt, String timeSt) {
        book.add(new transaction("withdraw", timeSt, amt));
        balance-=amt;
    }
    
    public void transfer(Account to, double amt, String timeSt) {
        to.book.add(new transaction("deposit", timeSt, amt));
        book.add(new transaction("withdraw", timeSt, amt));
        to.balance+=amt;
        balance-=amt;
    }
    
    public void undo(String timeSt) {
        for (int index = book.size()-1; index>=0; index--) {
            if (book.get(index).getTimeSt().equals(timeSt)) {
                if (book.get(index).getType().equals("withdraw")) balance+=book.get(index).getAmt();
                else balance-=book.get(index).getAmt();
                book.remove(index);
            }
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getTransInDay(String timeSt) {
        String text = "";
        for (transaction data: book) 
            if (data.getTimeSt().equals(timeSt)) 
                text+=data.toString()+"\n";
        return text;
    }
    
    public String toString() {
        String text = accName+ " "+ accNo+ "\n";
        for (transaction data: book) text+=data.toString()+"\n";
        text+="balance: "+String.format("%.2f",balance);
        return text;
    }
}