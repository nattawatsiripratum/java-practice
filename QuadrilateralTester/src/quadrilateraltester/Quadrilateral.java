package quadrilateraltester;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Quadrilateral {
    private Point a,b,c,d;
    
    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }
    
    public double[] getSortedDist() {
        double min;
        ArrayList<Double> dis = new ArrayList<>();
        double[] sort = new double[6];
        dis.add(Point2D.distance(a.x, a.y, b.x, b.y)); //ab
        dis.add(Point2D.distance(a.x, a.y, c.x, c.y)); //ac
        dis.add(Point2D.distance(a.x, a.y, d.x, d.y)); //ad
        dis.add(Point2D.distance(b.x, b.y, c.x, c.y)); //bc
        dis.add(Point2D.distance(b.x, b.y, d.x, d.y)); //bd
        dis.add(Point2D.distance(c.x, c.y, d.x, d.y)); //cd
        for (int i=0; i<6; i++) {
            min = Collections.min(dis);
            sort[i] = min;
            dis.remove(dis.indexOf(min));
        }
    return sort;
    }
    
    public String toString() {
        return a+"\n"+b+"\n"+c+"\n"+d;
    }
    
    public abstract double area();
}