/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.completablefuture.test;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javacore.completablefuture.classes.Loja;

/**
 *
 * @author User
 */
public class LojaTest2 {

    public static void main(String[] args) {
        List<Loja> lojas = asList(
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"),
                new Loja("americanas"), 
                new Loja("casas bahia"), 
                new Loja("best buy"), 
                new Loja("wallmart"));
        
        
        
        
        //acharPrecos(lojas);
        System.out.println("+++++++");
        //acharPrecos2(lojas);
        System.out.println("+++++++");
        //acharPrecos3(lojas);
        System.out.println("+++++++");
        acharPrecos4(lojas);
        System.out.println("+++++++");
        
        //numero de threadas = Ncpu * Ucpu *(1+W/C)
        //Ncpu = numero de cores disponivel
        //Ucpu = quantidade de utilizacao da cpu(0-1) 
        //W/C = wait time e compute time
        //Nthreads = 8*1*(1+99)=800 threads
        
        final  Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 100), r->{
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });
        acharPrecos4(lojas,executor);
        
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(lojas.size());
        
        

    }

    private static List<String> acharPrecos(List<Loja> lojas) {
        System.out.println("Stream sequencial");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.stream()
                .map(loja -> String.format("%s o preco eh: %.2f ",
                 loja.getNome(), loja.getPreco()))
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + "ms");
        System.out.println(collect);
        return collect;

    }

    private static List<String> acharPrecos2(List<Loja> lojas) {
        System.out.println("Stream Paralelo");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.parallelStream()
                .map(loja -> String.format("%s o preco eh: %.2f ",
                 loja.getNome(), loja.getPreco()))
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + "ms");
        System.out.println(collect);
        return collect;

    }

    private static List<String> acharPrecos3(List<Loja> lojas) {
        System.out.println("Completable Future Sequencial");
        long start = System.currentTimeMillis();

        List<String> collect = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                () -> String.format("%s o preco eh: %.2f ",
                         loja.getNome(), loja.getPreco())
        )).map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println("Tempo Total: " + (System.currentTimeMillis() - start) + "ms");
        System.out.println(collect);
        return collect;

    }

    private static List<String> acharPrecos4(List<Loja> lojas) {
        System.out.println("Completable Future ");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> precoFuturo = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                () -> String.format("%s o preco eh: %.2f ",
                         loja.getNome(), loja.getPreco())
        ))
                
                .collect(Collectors.toList());
        
        System.out.println("Tempo Invocacacao: " + (System.currentTimeMillis() - start) + "ms");
        
        List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println("Tempo Total: " + (System.currentTimeMillis() - start) + "ms");
        
        
        System.out.println(collect);
        return collect;

    }
    private static List<String> acharPrecos4(List<Loja> lojas,Executor executor) {
        System.out.println("Completable Future Executor ");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> precoFuturo = lojas.stream()
                .map(loja -> CompletableFuture
                        
                .supplyAsync(
                        () -> String.format("%s o preco eh: %.2f ",
                         loja.getNome(), loja.getPreco()),executor
        ))
                .collect(Collectors.toList());
        
        System.out.println("Tempo Invocacacao: " + (System.currentTimeMillis() - start) + "ms");
        
        List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println("Tempo Total: " + (System.currentTimeMillis() - start) + "ms");
        
        
        System.out.println(collect);
        return collect;

    }

}
