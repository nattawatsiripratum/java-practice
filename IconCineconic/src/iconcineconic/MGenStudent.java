package iconcineconic;

public class MGenStudent extends MGenCard{
    public final int discount = 20;
    
    public MGenStudent(String name) {
        super(name);
    }
    
    @Override
    public void buyTicket(Cinema c, int amount) {
        super.buyTicket(c, amount);
        float dis = discount*amount*c.getTicketPrice()/100f;
        System.out.printf("You got %.1f discount\n", dis);
    }
}
