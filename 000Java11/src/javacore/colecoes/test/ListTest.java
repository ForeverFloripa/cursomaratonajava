/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ListTest {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        List<String> nomes2 = new ArrayList();
        nomes.add("willian");
        nomes.add("devdojo");
        nomes2.add("willian2");
        nomes2.add("devdojo2");
        System.out.println("size: "+ nomes.size());
        System.out.println("apagou: "  +nomes.remove("devdojo"));
        System.out.println("size: "+ nomes.size());
        nomes.clear();
        nomes.addAll(nomes2);
        //System.out.println("size: "+ nomes.size());
        
        for (int i = 0; i<nomes.size(); i++) {
            System.out.println(nomes.get(i));
            
        }
        
//        
//        
//        System.out.println(nomes.get(3));
//        System.out.println("_______________");
//        
//        for (Object nome: nomes){
//            System.out.println(nome);
//        }

    List<Integer> numeros = new ArrayList<>();
    numeros.add(10);
    for(Integer num: numeros){
        System.out.println(num);
    }
    
    
    
    
    }
    
    

}
