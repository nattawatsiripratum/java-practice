package accounttester;

public class AccountTester {
    
    public static void main(String[] args) { 
        SavingsAccount momsSavings = new SavingsAccount(5);
        CheckingAccount harrysChecking = new CheckingAccount(10000);

        momsSavings.deposit(10000);
        harrysChecking.withdraw(1500);
        harrysChecking.deposit(1500);
        harrysChecking.withdraw(1500);
        harrysChecking.withdraw(400);
    
        momsSavings.addInterest();
        harrysChecking.deductFees();
        System.out.println("Mom's savings balance = $"+ momsSavings.getBalance());
        System.out.println("Harry's checking balance = $"+ harrysChecking.getBalance());
    }
}
