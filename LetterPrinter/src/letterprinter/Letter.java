package letterprinter;

public class Letter {
    private String from,to,text;
    
    public Letter(String from, String to) {
        this.from=from;
        this.to=to;
        text="";
    }
    
    public void addLine(String line) {
        text+=line+"\n";
    }
    
    public String getText() {
        return "Dear "+to+":\n\n"+text+"\n"+"Sincerely,\n\n"+from;
        
    }
}
