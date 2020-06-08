/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javacore.colecoes.classes.Produto;

/**
 *
 * @author User
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros=new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //(-(ponto de insercao)-1)
        Collections.sort(numeros);
        //0,1,2,3
        //0,2,3,4
        System.out.println(Collections.binarySearch(numeros,2));
        System.out.println(numeros.get(Collections.binarySearch(numeros,2)));
        
        List<Produto> produtos = new ArrayList<>();
        Produto produto3 = new Produto("789", "Picanha", 2400.0);
        Produto produto4 = new Produto("987", "Erva", 1122.0);
        Produto produto1 = new Produto("123", "LAPTOP LeNovo", 2000.0);
        Produto produto2 = new Produto("456", "TV Toshiba", 1000.0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        
        Collections.sort(produtos,new ProdutoNomeComparator());
        Produto produto5 = new Produto("000", "Antena", 50.0);
        
        for(Produto prod:produtos){
            System.out.println(prod);
        }
        System.out.println(Collections.binarySearch(produtos, produto5,new ProdutoNomeComparator()));
        
        Integer[] arrayInteger= new Integer[4];
        arrayInteger[0]=2;
        arrayInteger[1]=0;
        arrayInteger[2]=4;
        arrayInteger[3]=3;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger, 1));
        
    }
    
}
