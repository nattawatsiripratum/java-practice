package quadrilateraltester;

public class Kite extends Quadrilateral{
    
    public Kite(int x1, int y1,int x2, int y2,int x3, int y3,int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    public double area() {
        double a = 0;
        double[] sort = super.getSortedDist();
        if (sort[1]==sort[2]) a=sort[0]; // if the least length = diagonal
        else if (sort[0]==sort[1]) a=sort[2]; // if the least length = the least cathetus
        
        return a*sort[5]/2;
    }
}