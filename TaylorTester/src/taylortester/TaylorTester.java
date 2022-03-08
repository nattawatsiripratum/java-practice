package taylortester;

public class TaylorTester {

    public static void main(String[] args) {
        Expo exp = new Expo(7,1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7,1);
        cs.printValue();
        
        Taylor[] appx = new Taylor[3];
        appx[0] = new Expo(7,1);
        appx[1] = new Sine(7, Math.PI/4);
        appx[2] = new Cosine(7,1);
        
        for (Taylor value: appx) {
            value.printValue();
        }
    }   
}