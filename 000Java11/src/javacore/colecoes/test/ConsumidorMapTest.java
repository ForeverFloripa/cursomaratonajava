/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javacore.colecoes.classes.Consumidor;
import javacore.colecoes.classes.Produto;

/**
 *
 * @author User
 */
public class ConsumidorMapTest {

    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willian", "004123");
        Consumidor consumidor2 = new Consumidor("DevDojo", "321");
        //Consumidor consumidor3 = new Consumidor("Dorime", "4544");
        
        Produto produto1 = new Produto("1789", "Picanha", 2400.0);
        Produto produto2 = new Produto("2987", "Erva", 1122.0);
        Produto produto3 = new Produto("3123", "LAPTOP LeNovo", 2000.0);
        Produto produto4 = new Produto("4456", "TV Toshiba", 1000.0);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtosCon1 = new ArrayList();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);

        List<Produto> produtosCon2 = new ArrayList();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);

        map.put(consumidor1, produtosCon1);
        map.put(consumidor2, produtosCon2);

        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": ");
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome() + " ");

            }

        }
    }
}
