package cashregistertester;

public class CashRegisterTester {

    public static void main(String[] args) {
        CashRegister test=new CashRegister(7);
        test.recordPurchase(50);
        test.recordPurchase(10);
        test.recordTaxablePurchase(20);
        test.enterPayment(100);
        System.out.printf("Your change is %.1f\n",test.giveChange());
        
    }
    
}
