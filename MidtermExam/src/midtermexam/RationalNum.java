package midtermexam;

public class RationalNum {
    private int numerator;
    public int denominator;
    
    public RationalNum(int numerator, int denominator) {
        assert denominator!=0;
        this.numerator=numerator;
        this.denominator=denominator;
    }
    
    public RationalNum(int num) {
        numerator=num;
        denominator=1;
    }
    
    public RationalNum add(RationalNum other) {
        return new RationalNum(numerator*other.denominator+other.numerator*denominator,other.denominator*denominator);
    }
    
    public RationalNum add(int c) {
        return new RationalNum(numerator+c*denominator,denominator);
    }
    
    public RationalNum multiply(RationalNum other) {
        return new RationalNum(numerator*other.numerator, denominator*other.denominator);
    }
    
    public RationalNum multiply(int c) {
        return new RationalNum(numerator*c, denominator);
    }
     
    public boolean equals(RationalNum other) {
        return numerator*other.denominator == other.numerator*denominator;
    }
    
    public boolean equals(int c) {
        return numerator == c*denominator;
    }
}