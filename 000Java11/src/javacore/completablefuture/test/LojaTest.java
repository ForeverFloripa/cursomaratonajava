/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.completablefuture.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacore.completablefuture.classes.Loja;

/**
 *
 * @author User
 */
public class LojaTest {

    public static void main(String[] args) {
        Loja americanas = new Loja();
        Loja casasBahia = new Loja();
        Loja bestBuy = new Loja();
        Loja wallmart = new Loja();
//        long start= System.currentTimeMillis();
//        System.out.println(americanas.getPreco());
//        System.out.println(casasBahia.getPreco());
//        System.out.println(bestBuy.getPreco());
//        System.out.println(wallmart.getPreco());
//        System.out.println(System.currentTimeMillis()-start+"ms");
        long start = System.currentTimeMillis();
        Future<Double> precoAsync1 = americanas.getPrecoAsyncTunado();
        Future<Double> precoAsync2 = casasBahia.getPrecoAsyncTunado();
        Future<Double> precoAsync3 = bestBuy.getPrecoAsyncTunado();
        Future<Double> precoAsync4 = wallmart.getPrecoAsyncTunado();
        System.out.println(System.currentTimeMillis() - start + "ms");
        enrolando();
        try {
            try {
                System.out.println("Americanas: "+precoAsync1.get(3,TimeUnit.SECONDS));
            System.out.println("casasBahia: "+precoAsync2.get(3,TimeUnit.SECONDS));
            System.out.println("bestBuy: "+precoAsync3.get(3,TimeUnit.SECONDS));
            System.out.println("wallmart: "+precoAsync4.get(3,TimeUnit.SECONDS));
            } catch (TimeoutException ex) {
                Logger.getLogger(LojaTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(LojaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tempo para pegar o resultado: "+ (System.currentTimeMillis()-start)+ "ms");

    }
     private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;

        }
        System.out.println(soma);
    }

}

//aula 197