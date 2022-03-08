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
public class LadyBugTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LadyBug b1=new LadyBug();
       LadyBug b2=new LadyBug(2);
       System.out.println("b1: ("+b1.getPosX()+","+b1.getPosY()+")"+" power = "+b1.getPow());
       System.out.println("b2: ("+b2.getPosX()+","+b2.getPosY()+")"+" power = "+b2.getPow());
    }
    
}
