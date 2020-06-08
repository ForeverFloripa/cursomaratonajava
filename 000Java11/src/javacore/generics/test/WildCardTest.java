/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.generics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
abstract class Animal {

    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }

}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }

}

public class WildCardTest {

    public static void main(String[] args) {
        Cachorro[] dogs = {new Cachorro(), new Cachorro()};
        Gato[] cats = {new Gato(), new Gato()};
        // consultarAnimais(cats);
        consultarAnimais(dogs);

        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());

        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());
        
        consultarAnimaisList(cachorroList);
        consultarAnimaisList(gatoList);
        //ordenarLista(cachorroList); metodo nao implementa Comparable
        

    }
    
    

    public static void consultarAnimais(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }

    public static void consultarAnimaisList(List<? extends Animal> animals) {

        for (Animal animal : animals) {
            animal.consulta();
        }

    }

    public static void consultarCachorrosList(List<? super Cachorro> cachorroList) {

        cachorroList.add(new Cachorro());
    }
    
    public static void ordenarLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }
    
}
