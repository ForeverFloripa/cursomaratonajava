/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author User
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle rb =   ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("zaza"));
        System.out.println(rb.getString("show"));
        
        rb =   ResourceBundle.getBundle("messages", new Locale("en","US"));
        
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("zaza"));
        System.out.println(rb.getString("show"));
        
        Locale locale= new Locale("fr","CA");
        ResourceBundle.getBundle("messages",locale);
        
        
        
    }
    
}
