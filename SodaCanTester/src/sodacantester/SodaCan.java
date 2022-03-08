package sodacantester;

public class SodaCan {
    private double height;
    private double r;
    final double PI=Math.PI;
    
    public SodaCan(double height, double diameter) {
        this.height=height;
        r=diameter/2;
    }
    
    public double getVolume() {
        return PI*r*r*height;
    }
    
    public double getSurfaceArea() {
        return 2*PI*r*(height+r);
    }
}
