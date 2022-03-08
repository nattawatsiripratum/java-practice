package linetester;

import java.awt.geom.Point2D;

public class Line {
    private final double x,m,b;
    private final double EPSILON=1E-14;
    
    /**
     * 
     * @param x point 1 of the line
     * @param y point 1 of the line
     * @param m slope
     */
    public Line(double x, double y, double m) {
        this.x=Double.NaN;
        b=-m*x+y;
        this.m=m;
    }
    
    /**
     * 
     * @param x1 point 1 of the line
     * @param y1 point 1 of the line
     * @param x2 point 2 of the line
     * @param y2 point 2 of the line
     */
    public Line(double x1, double y1, double x2, double y2) {
        m=(y2-y1)/(x2-x1); x=Double.NaN; b=-m*x1+y1;
    }
    
    /**
     * 
     * @param m slope
     * @param b Y-intercept
     */
    public Line(double m, double b) {
        this.m=m; this.b=b; x=Double.NaN;
    }
    
    /**
     * 
     * @param a X-intercept as x=a
     */
    public Line(double a) {
        x=a; m=b=Double.NaN;
    }
    
    /**
     * 
     * @param line other line to be compared by parallel
     * @return boolean parallel of 2 lines
     */
    public boolean isParallel(Line line) {
        return (!Double.isNaN(m) && !Double.isNaN(line.m)) ? Math.abs(m-line.m)<=EPSILON : 
                ((Double.isNaN(m) && Double.isNaN(line.m)) ? x==this.x : false);
    }
    
    /**
     * 
     * @param line other line to be compared by equals
     * @return boolean equals of 2 lines
     */
    public boolean equals(Line line) {
        return (Double.isNaN(m) && Double.isNaN(line.m)) ? 
                x==this.x : (this.isParallel(line) && Math.abs(b-line.b)<=EPSILON);  
    }
    
    /**
     * 
     * @param line other line to be compared by intersect
     * @return boolean intersection of 2 lines
     */
    public boolean isIntersect(Line line) {
        return (this.equals(line) || !this.isParallel(line));
    }
    
    /**
     * 
     * @param line other line to be compute intersection point
     * @return intersection point
     */
    public Point2D.Double getIntersectionPoint(Line line) {
        double X,Y;
        if (Double.isNaN(m)) {
            X=x;
            Y=line.m*x+line.b;
        }
        
        else if (Double.isNaN(line.m)) {
            X=line.x;
            Y=m*line.x+b;
        }
        
        else {
            X=(b-line.b)/(line.m-m);
            Y=(b*line.m-m*line.b)/(line.m-m);
        }
        Point2D.Double point = new Point2D.Double(X,Y);
        return point;
    }
}