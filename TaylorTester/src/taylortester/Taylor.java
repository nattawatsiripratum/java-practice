package taylortester;

public abstract class Taylor {
    private int k;
    private double x;
    
    public Taylor(int k, double x) {
        this.k = k;
        this.x = x;
    }
    
    public int factorial(int n) {
        int fac = 1;
        for (int i=2; i<=n; i++) {
            fac*=i;
        }
        return fac;
    }
    
    public int getIteration() {
        return k;
    }
    
    public double getValue() {
        return x;
    }
    
    public abstract void printValue();
    
    public abstract double getApprox();
    
}