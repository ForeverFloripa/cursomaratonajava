/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import javacore.colecoes.classes.Consumidor;

/**
 *
 * @author User
 */
public class TreeMapTest {

    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        //Consumidor consumidor3 = new Consumidor("Dorime", "4544");

        map.put("C", "Letra C");
        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("D", "Letra D");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.headMap("C", true));
        System.out.println(map.higherEntry("C"));
//System.out.println(map.pollFirstEntry());
        System.out.println(map.headMap("C",true));
    }

}
