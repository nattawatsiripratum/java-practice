package accounttester;

public class TimeDepositeAccount extends SavingsAccount {
    private int mnt;
    
    public TimeDepositeAccount(double intRate, int mnt) {
        super(intRate);
        this.mnt = mnt;
    }
    
    public void addInterate() {
        super.addInterest();
        mnt--;
    }
    
    public void withdraw(double amount) {
        if (mnt>0) super.withdraw(amount+20);
        else super.withdraw(amount);
    }    
}