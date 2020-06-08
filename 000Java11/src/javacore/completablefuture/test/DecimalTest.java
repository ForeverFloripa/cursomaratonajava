/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.completablefuture.test;

/**
 *
 * @author User
 */
public class DecimalTest {
    public static void main(String[] args) {
        String n="10,33214";
        double p= 10/3;
        System.out.println(p);
        System.out.println(String.valueOf(p));
        System.out.println(Double.parseDouble(n.replaceAll(",",".")));
        
        
        //System.out.println(Double.parseDouble(n));
        
        
    }
            
            
    
}
