/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;
import javacore.colecoes.classes.Celular;

/**
 *
 * @author User
 */
public class ListaCelularTest {

    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "121212");
        Celular celular2 = new Celular("Iphone 6S", "343434");
        Celular celular3 = new Celular("Sony experia", "565656");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList) {
            System.out.println(celular.hashCode());
        }

        Celular celular4 = new Celular("Galaxy S7", "121212");
        System.out.println("== : " + (celular1 == celular4));
        System.out.println("equals : " + celular1.equals(celular4));
        System.out.println(celularList.contains(celular4));
        
        System.out.println(celular4.hashCode());
    }

}
