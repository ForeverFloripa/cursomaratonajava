/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
import javacore.colecoes.classes.Celular;
import javacore.colecoes.classes.Produto;




public class TreeSetTest {

    public static void main(String[] args) {
        Produto produto1 = new Produto("789", "Picanha", 2400.0, 10);
        Produto produto2 = new Produto("987", "Erva", 1122d, 10);
        Produto produto3 = new Produto("123", "LAPTOP LeNovo", 2000d, 0);
        Produto produto4 = new Produto("456", "TV Toshiba", 1000d, 0);
        Produto produto5 = new Produto("456", "Erva", 200.0, 0);
        Celular celular = new Celular("iponey 7", "12122");
        
        NavigableSet<Produto> produtoNavSet = new TreeSet<>();
        produtoNavSet.add(produto1);
        produtoNavSet.add(produto2);
        produtoNavSet.add(produto3);
        produtoNavSet.add(produto4);
        produtoNavSet.add(produto5);
        
        for(Produto prod: produtoNavSet.descendingSet()){
            System.out.println(prod);
        }
        
        System.out.println("................xx..................");
        //lower < 
        //floor<=
        //higher>
        //ceiling >=
        
        System.out.println(produtoNavSet.lower(produto4));
        System.out.println(produtoNavSet.pollFirst());//traz mas remove
        System.out.println(produtoNavSet.lower(produto4));
        
        
    }
}
