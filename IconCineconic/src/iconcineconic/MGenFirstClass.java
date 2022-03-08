package iconcineconic;

public class MGenFirstClass extends MGenCard{
    private int freeTicket = 2;
    
    public MGenFirstClass(String name) {
        super(name);
    }
    
    public void getFreeTicket() {
        if (freeTicket == 2) {
            System.out.println("You got 2 Cinema tickets");
            freeTicket = 0;
        }
        else System.out.println("You already got the free tickets");
        
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return super.toString()+"[free ticket : "+freeTicket+"]";
    }
}
