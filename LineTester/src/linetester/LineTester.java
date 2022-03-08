package linetester;

import java.awt.geom.Point2D;

public class LineTester {

    public static void show(Line l1, Line l2) {
        System.out.println("Are the two lines equals?: "+l1.equals(l2));
        System.out.println("Are the two lines parallel?: "+l1.isParallel(l2));
        System.out.println("Do the two lines intersect?: "+l1.isIntersect(l2));
        
        Point2D.Double point=l1.getIntersectionPoint(l2);
        if (l1.isIntersect(l2)) {
            if (Double.isNaN(point.getX()) || Double.isNaN(point.getY())) System.out.printf("Point of intersection: Intersection has infinite points.\n\n");
            else System.out.printf("Point of intersection: (%.2f,%.2f)\n\n",point.getX(),point.getY());
        }
        else System.out.println("");
    }
    
    public static void main(String[] args) {
        Line l1=new Line(-2,1,1,-2);
        Line l2=new Line(-6,-2,-2,0);
        show(l1,l2);
        
        Line l3=new Line(0,2);
        Line l4=new Line(2,1);
        show(l3,l4);
        
        Line l5=new Line(0.44,3.4);
        Line l6=new Line(32,32,9);
        show(l5,l6);
        
        Line l7=new Line(3,5);
        Line l8=new Line(5);
        show(l7,l8);
        
        Line l9=new Line(0,4);
        Line l10=new Line(5);
        show(l9,l10);
        
        Line l11=new Line(0.44,3.4);
        Line l12=new Line(0.44,5);
        show(l11,l12);
        
        Line l13=new Line(1,-24);
        Line l14=new Line(29,5,53,29);
        show(l13,l14);
    }
}