/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.ZZdefault.classes;

import javacore.ZZdefault.interfaces.MyList;

/**
 *
 * @author User
 */
public class InterfaceTest implements MyList{
    public static void main(String[] args) {
      MyList.sort(); 
      new InterfaceTest().remove();
      
    }

    @Override
    public void add() {
        System.out.println("Dentro do add");
    }
   
           
    
}
