/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import javacore.colecoes.classes.Celular;

/**
 *
 * @author User
 */
public class EqualsTest {
    public static void main(String[] args) {
        String nome1="willian suene";
        String nome2=new String ("willian suene");
//        System.out.println(nome1==nome2);// compara a referencia ao objeto
//        System.out.println(nome1.equals(nome2));
        
        Celular c1 = new Celular("Iphone","1234");
        Celular c2 = new Celular("Iphone","1234");
        System.out.println("mesmo celular: "+ c1.equals(c2));
        
        
        
    }
    
}
