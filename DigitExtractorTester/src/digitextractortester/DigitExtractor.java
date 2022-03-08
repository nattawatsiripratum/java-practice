package digitextractortester;

public class DigitExtractor {
    private String anInteger;
    private int i=5;
    
    public DigitExtractor(int anInteger) {
        this.anInteger="00000".substring(0,5-String.valueOf(anInteger).length())+String.valueOf(anInteger);
    }
    
    public int nextDigit() {
        i--;
        return Integer.parseInt(anInteger.substring(i,i+1));
    }
}