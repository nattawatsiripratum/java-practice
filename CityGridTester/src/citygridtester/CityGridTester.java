package citygridtester;

public class CityGridTester {

    public static void main(String[] args) {
        CityGrid citG = new CityGrid(10);
        int sum=0;
        int max=0;
        for (int i=1 ; i<10000 ; i++) {
            int beforeNotInCity=0;
            for (int j=0; j<1000 ;j++) {
                citG.walk();
                beforeNotInCity++;
                if (!citG.isInCity()) { 
                    citG.reset();
                    break;
                }
            citG.reset();
            }
            max = (max<beforeNotInCity) ? beforeNotInCity : max;
            sum+=beforeNotInCity;
        }
        System.out.printf("Average number of steps that a person can take and is still in the city: %.2f\n",sum/10000.0);
        System.out.printf("Maximum number of steps that a person can take and is still in the city: %d\n",max);        
    }
}
