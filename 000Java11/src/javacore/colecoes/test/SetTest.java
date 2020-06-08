/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javacore.colecoes.classes.Produto;

/**
 *
 * @author User
 */
public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("789", "Picanha", 2400.0,10);
        Produto produto2 = new Produto("987", "Erva", 1122d,10);
        Produto produto3 = new Produto("123", "LAPTOP LeNovo", 2000d,0);
        Produto produto4 = new Produto("456", "TV Toshiba", 1000d,0);
        Produto produto5 = new Produto("666", "Erva", 3250d,0);
        Set<Produto> produtoSet = new LinkedHashSet();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        for( Produto p : produtoSet){
            System.out.println(p);
        }
    }
    
}
