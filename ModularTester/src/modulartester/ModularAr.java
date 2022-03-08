package modulartester;

public class ModularAr {
    private final int mod = 23;
    private int num;
    
    public ModularAr(int num) {
        this.num = num;
    }
    
    public ModularAr add(ModularAr other) {
        return new ModularAr((num+other.num)%mod);
    }
    
    public ModularAr multiply(ModularAr other) {
        return new ModularAr((num*other.num)%mod);
    }
    
    public boolean equals(ModularAr other) {
        return num%mod==other.num%mod;
    }
}