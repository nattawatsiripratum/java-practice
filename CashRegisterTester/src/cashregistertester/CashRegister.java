package cashregistertester;


public class CashRegister {
    private double purchase;
    private double payment;
    private double tax;
    
    public CashRegister(int tax) {
        purchase = 0;  payment = 0; this.tax=tax;
    }
    
    public void recordPurchase(double amnt) { 
        purchase += amnt;
    }

    public void recordTaxablePurchase(double amnt) { 
        purchase += amnt*(1+tax/100);
    }
    
    public void enterPayment(double amnt) {
        payment = amnt;
    }
    
    public double getTotalTax() {  //Why is there exists?  Is this not used? 
        return tax;
    }

    public double giveChange() {
        double change = payment-purchase; 
        purchase = 0;
        payment = 0;
        return change;
    }       
}
