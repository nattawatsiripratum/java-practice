
package modulartester;

public class ModularTester {

    public static void main(String[] args) {
        ModularAr num = new ModularAr(17);
        ModularAr num2 = new ModularAr(2);
        ModularAr num3 = new ModularAr(21);
        ModularAr num4 = new ModularAr(-7);
        
        ModularAr num5 = num.multiply(num2).add(num4).multiply(num3);
        for (int i=0; i<23; i++)
            if (num5.equals(new ModularAr(i)))
                System.out.println(i);
    }
    
}
