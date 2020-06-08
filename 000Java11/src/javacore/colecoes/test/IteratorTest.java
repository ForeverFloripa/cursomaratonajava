/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javacore.colecoes.classes.Produto;

/**
 *
 * @author User
 */
public class IteratorTest {
    public static void main(String[] args) {
         List<Produto> produtos = new LinkedList<>();
        Produto produto3 = new Produto("789", "Picanha", 2400.0,10);
        Produto produto4 = new Produto("987", "Erva", 1122d,10);
        Produto produto1 = new Produto("123", "LAPTOP LeNovo", 2000d,0);
        Produto produto2 = new Produto("456", "TV Toshiba", 1000d,0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasnext verifica seexiste prox elemento
        //next pega o elemento
        while(produtoIterator.hasNext()){
//           Produto produto=  produtoIterator.next();
//           if(produto.getQuantidade()==0){
           if(produtoIterator.next().getQuantidade()==0){
               produtoIterator.remove();
           }
        }
        System.out.println(produtos.size());
        
        
        
            
    }
    
}
