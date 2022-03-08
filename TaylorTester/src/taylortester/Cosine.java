package taylortester;

public class Cosine extends Taylor{
    public Cosine(int k, double x) {
        super(k,x);
    }
    
    public double getApprox() {
        double appx = 0;
        for (int n=0; n<=getIteration(); n++) {
            appx+=(Math.pow(-1, n)*Math.pow(getValue(),2*n))/factorial(2*n);
        }
        return appx;
    }
    
    public void printValue() {
        System.out.println("Value from Math.cos() is "+Math.cos(getValue())+".");
        System.out.println("Approximated value is "+getApprox()+".");
    }
}
