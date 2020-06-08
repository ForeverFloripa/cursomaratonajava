/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.ZZdefault.interfaces;

import java.util.List;

/**
 *
 * @author User
 */
public interface MyList {
    static void sort(){
        System.out.println("DentroDoSort");
    }
     void add();
     
     default void remove(){
         System.out.println("Dentro do remove");
     }
     
}
