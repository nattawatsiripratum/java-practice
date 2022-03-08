package taylortester;

public class Expo extends Taylor{
    
    public Expo(int k, double x) {
        super(k,x);
    }
    
    public double getApprox() {
        double appx = 0;
        for (int n=0; n<=getIteration(); n++) {
            appx+=Math.pow(getValue(),n)/factorial(n);
        }
        return appx;
    }
    
    public void printValue() {
        System.out.println("Value from Math.exp() is "+Math.pow(Math.E,getValue())+".");
        System.out.println("Approximated value is "+getApprox()+".");
    }
}