/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class SortListTest {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("willian");
        nomes.add("suane");
        nomes.add("devdojo");
        nomes.add("breno");
        nomes.add("bruno");
        nomes.add(0, "ultimo nome");
        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        
        List<Double> numeros= new ArrayList<>();
        numeros.add(1.3);
        numeros.add(4.7);
        numeros.add(2.3);
        numeros.add(1.13);
        numeros.add(3.33);
        Collections.sort(numeros);
        
        for(Double numero:numeros){
            System.out.println(numero);
        }
        

    }
}
