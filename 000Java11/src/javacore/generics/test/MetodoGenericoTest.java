/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;
import javacore.generics.classes.Carro;

/**
 *
 * @author User
 */
public class MetodoGenericoTest {

    public static void main(String[] args) {
        //   criarArray(new Cachorro());
        //   List<Cachorro> cachorroList=  criarArrayComRetorno(new Cachorro());
        //System.out.println(cachorroList);

        //criarArray(new Carro());
        List<Carro> carroList = criarArrayComRetorno(new Carro("Camaro"));
        System.out.println(carroList);

    }

    public static <T> void criarArray(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }

    public static <T> List<T> criarArrayComRetorno(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        return lista;
    }

}
