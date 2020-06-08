/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;
import javacore.colecoes.classes.Consumidor;

/**
 *
 * @author User
 */
public class GenericsTest {

    public static void main(String[] args) {
        
        //type erasure 
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("ZZ");
        lista.add("1100");
        lista.add("Stringss");

        for (String obj : lista) {
            System.out.println(obj);
        }
        
        add(lista, 1L);
        
        System.out.println(",,,,,,,,,,,,,,,");
        for (String obj : lista) {
            System.out.println(obj);
        }
    }
    
    public static void add(List lista,Long l){
        
        lista.add(l);
    }
}
 