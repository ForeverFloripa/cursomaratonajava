/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javacore.colecoes.classes.Produto;

class ProdutoNomeComparator implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}


public class SortProdustoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        
        Produto[] produtosArray= new Produto[4];
        
        Produto produto3 = new Produto("789", "Picanha", 2400.0);
        Produto produto4 = new Produto("987", "Erva", 1122.0);
        Produto produto1 = new Produto("123", "LAPTOP LeNovo", 2000.0);
        Produto produto2 = new Produto("456", "TV Toshiba", 1000.0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        
        produtosArray[0]=produto1;
        produtosArray[1]=produto2;
        produtosArray[2]=produto3;
        produtosArray[3]=produto4;
        
        Collections.sort(produtos,new ProdutoNomeComparator());
        
//        produtos.forEach((prod) -> {
//            System.out.println(prod);
//        });
        
      for(Produto prod : produtos){
          System.out.println(prod);
    }
      
        System.out.println("_______________");
        
      Arrays.sort(produtosArray, new ProdutoNomeComparator());
        //System.out.println(Arrays.toString(produtosArray));
        
      for(Produto prod : produtosArray){
          System.out.println(prod);
    }
        
      
       
      
      
        
    }
}
