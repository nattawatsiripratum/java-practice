package covidinfectiontester;

public class CovidInfectionTester {
    
    public static void main(String[] args) {
        CovidInfection test=new CovidInfection(120);
        for (int i=0;i<15;i++) {
            System.out.printf("Day %d(r0=%.1f) : %d\n",i,test.getr0(),test.getNumInfected());
            test.spread();
        }
        test.shutdown();
        
        for (int i=15;i<20;i++) {
            System.out.printf("Day %d(r0=%.1f) : %d\n",i,test.getr0(),test.getNumInfected());
            test.spread();
        }
        test.openup();
        
        for (int i=20;i<31;i++) {
            System.out.printf("Day %d(r0=%.1f) : %d\n",i,test.getr0(),test.getNumInfected());
            test.spread();
                
        }
    }
    
}
