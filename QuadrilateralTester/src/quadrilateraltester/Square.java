package quadrilateraltester;

public class Square extends Quadrilateral{
    
    public Square(int x1, int y1,int x2, int y2,int x3, int y3,int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    public double area() {
        double[] sort = super.getSortedDist();
        return sort[0]*sort[0];
    }
}