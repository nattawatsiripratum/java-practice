package covidinfectiontester;

public class CovidInfection {
    private double r0=2.8;
    private long total;
    
    public CovidInfection(long init) {
        total=init;
    }
    
    public void spread() {
        total= (long) ((double)total*r0);
    }
    
    public void shutdown() {
        r0=0.5*r0;
    }
    
    public void openup() {
        r0=2.8;
    }
    
    public long getNumInfected() {
        return total;
    }
    
    public double getr0() {
        return r0;
    }
}