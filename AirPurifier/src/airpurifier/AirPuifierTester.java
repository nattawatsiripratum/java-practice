/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airpurifier;

public class AirPuifierTester {
    public static void main(String[] args) {
        Filter f = new Filter();
        DoubleCapacityFilter df = new DoubleCapacityFilter();
        //SelfCleanFilter sf = new SelfCleanFilter();
        
        AirPurifier a = new AirPurifier();
        a.insertFilter(f);
        a.insertFilter(df);
        //a.insertFilter(sf);
        a.printFilterDetails();
        
        a.filter(4000);        
        a.printFilterDetails();
        a.filter(35000);
        a.printFilterDetails();
        Filter f2 = new Filter();
        a.replaceFilterAtIndex(0, f2);
        a.printFilterDetails();
    }
}