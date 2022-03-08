package iconcineconic;

public class Cinema {
    private String name;    // ชื่อโรงภาพยนตร์
    private int ticketPrice; // ราคาตั๋วหนัง
    
    public Cinema (String name, int ticketPrice) {
        this.name = name;
        this.ticketPrice = ticketPrice;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTicketPrice() {
        return ticketPrice;
    }
}
