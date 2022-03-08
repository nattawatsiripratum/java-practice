package cannonballtester;

public class CannonBall {
    private double initV;
    private double simS;
    private double simT;
    private static final double g=9.81;
    private static final double deltaT=0.01;
    
    public CannonBall(double initV) {
        this.initV=initV;
    }
    
    public void simulatedFlight() {
        double v=initV;
        int i=1;
        for (simT=0; v>0; simT+=deltaT,i++) {
            simS+=v*deltaT;
            v-=g*deltaT; 
            if (i%100==0) System.out.printf("Distance on %.0f sec: %.3f\n",simT,simS);
        }
        System.out.printf("Final distance: %.3f   Total time: %.2f\n",simS,simT);
    }
    
    public double calculusFlight(double t) {
        return -0.5*g*t*t+initV*t;
    }
    
    public double getSimulatedTime() {
        return simT;
    }
    
    public double getSimulatedDistance() {
        return simS;
    }
}
