package cartester;

public class Truck extends Car {
    private int M_weight;
    private int weight;
    
    public Truck(double gas, double efficiency, int M_weight, int weight) {
        super(gas, efficiency);
        if (weight>M_weight) this.weight = M_weight;
        else this.weight = weight;
    }
    
    @Override
    public void drive(double distance) {
        if (weight<1) super.drive(distance);
        else if (weight<11) super.drive(1.1*distance);
        else if (weight<21) super.drive(1.2*distance);
        else super.drive(1.3*distance);
    }
}