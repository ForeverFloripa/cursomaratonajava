/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.classesinternas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javacore.generics.classes.Carro;

class Animal {

    public void andar() {
        System.out.println("Andando");
    }
}

public class ClassesAnonimasTest {

    public static void main(String[] args) {
        Animal a = new Animal() {
            public void andar() {
                System.out.println("Andando Anonimamente");
            }
        };//necessario ;
        Animal b = new Animal();
        
        a.andar();
        b.andar();
        
        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("BMW"));
        carroList.add(new Carro("Fusca"));
        Collections.sort(carroList, (Carro t, Carro t1) -> t.getNome().compareTo(t1.getNome()));
        System.out.println(carroList);

    }
}

//Collections.sort(carroList,new Comparator<Carro>(){
//            @Override
//            public int compare(Carro t, Carro t1) {
//                return t.getNome().compareTo(t1.getNome());
//            }
//            
//        });
//class CarroComparator implements Comparator<Carro>{
//
//    @Override
//    public int compare(Carro t, Carro t1) {
//        return t.getNome().compareTo(t1.getNome());
//    }
//    
//}