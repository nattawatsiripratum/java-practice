package pizzatester;

import java.util.ArrayList;

public class Order {
    public static int cntOrder = 0;
    public int id;
    private Customer c;
    private ArrayList<Pizza> p = new ArrayList<>();
    
    public Order(Customer c) {
        this.c = c;
        id = ++cntOrder;
    }
    
    public void addPizza(Pizza p) {
        this.p.add(p);
    }
    
    public String getOrderDetail() {    
        String show = "Order id : "+id+"\n"+c+"\n";
        
        for (Pizza data : p) show+=data+"\n";
        
        show+="Total pieces : "+p.size()+"\nTotal cost : "+calculatePayment();
        return show;
    }
    
    public double calculatePayment() {
        double sum = 0;
        double disc = 0;
        for (Pizza data : p) sum+=data.getPrice();
        if (c instanceof GoldCustomer) {
            GoldCustomer newC = (GoldCustomer) c;
            disc = newC.getDiscount();
        }
        
        return sum*(1-disc/100);
    }
}