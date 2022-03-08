/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ladybugtester;

/**
 *
 * @author Lenovo
 */
public class LadyBug {
    private int power;
    private int x,y;
    final int XMAX=100;
    final int XMIN=0;
    final int YMAX=100;
    final int YMIN=0;
    
    /**
     * create a bug at a random position with random power
     */
    public LadyBug() {
        x=(int)(Math.random()*100); 
        y=(int)(Math.random()*100);
        power=(int)(Math.random()*10);
    }
    
    /**
     * create a bug at a position (x,y) with random power
     * @param x the x-position of the ladybug
     * @param y the y-position of the ladybug
     */
    public LadyBug(int x,int y) {
        this.x=x;
        this.y=y;
        power=(int)(Math.random()*10);
    }
    
    /**
     * 
     * @param power 
     */
    public LadyBug(int power) {
        x=(int)(Math.random()*100);
        y=(int)(Math.random()*100);
        this.power=power;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param power 
     */
    public LadyBug(int x,int y,int power) {
        this.x=x;
        this.y=y;
        this.power=power;
    }
    
    /**
     * get the x-position of the ladybug
     * @return x-position of the ladybug 
     */
    public int getPosX() {
        return x;
    }
    
    /**
     * get the y-position of the ladybug
     * @return y-position of the ladybug 
     */
    public int getPosY() {
        return y;
    }
    
    /**
     * get the power of the ladybug
     * @return power of the ladybug 
     */
    public int getPow() {
        return power;
    }
    
    /**
     * move the ladybug up y square
     * @param y the number of square to move
     */
    public void moveUp(int y) {
        if (this.y+y>YMAX) power--;
        else this.y+=y;
    }
    
    /**
     * move the ladybug down y square
     * @param y the number of square to move
     */
    public void moveDown(int y) {
        if (this.y+y<YMIN) power--;
        else this.y+=y;
    }
    
    
    /**
     * move the ladybug right x square
     * @param x the number of square to move
     */
    public void moveRight(int x) {
        if (this.x+x>XMAX) power--;
        else this.x+=x;
    }
    
    /**
     * move the ladybug left x square
     * @param x the number of square to move
     */
    public void moveLeft(int x) {
        if (this.x+x<XMIN) power--;
        else this.x+=x;
    }
}
