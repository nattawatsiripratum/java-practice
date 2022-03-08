package taylortester;

public class Sine extends Taylor{
    
    public Sine(int k, double x) {
        super(k,x);
    }
    
    public double getApprox() {
        double appx = 0;
        for (int n=0; n<=getIteration(); n++) {
            appx+=(Math.pow(-1, n)*Math.pow(getValue(),2*n+1))/factorial(2*n+1);
        }
        return appx;
    }
    
    public void printValue() {
        System.out.println("Value from Math.sine() is "+Math.sin(getValue())+".");
        System.out.println("Approximated value is "+getApprox()+".");
    }
}