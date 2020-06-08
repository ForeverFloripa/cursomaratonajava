/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.completablefuture.classes;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class NovaLoja {

    private String nome;

    public String getNome() {
        return nome;
    }

    public NovaLoja() {
    }

    public NovaLoja(String nome) {
        this.nome = nome;
    }
    //NomeDaLoja:Preco:CodigoDeDesconto
    public String getPreco() {
        double preco = calcularPreco();
        Desconto.Codigo codigo = Desconto.Codigo.values()[ThreadLocalRandom.current().nextInt(Desconto.Codigo.values().length)];
                
        
        return String.format("%s:%.2f:%s", nome, preco, codigo);

    }

    private double calcularPreco() {
        delay();
        //System.out.println(1/0);
        return ThreadLocalRandom.current().nextDouble() * 100;
    }

    private static void delay() {
        try {
            int delay = ThreadLocalRandom.current().nextInt(300,2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(NovaLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<NovaLoja> lojas() {
        return asList(
                new NovaLoja("americanas"),
                new NovaLoja("casas bahia"),
                new NovaLoja("best buy"),
                new NovaLoja("amazon"),
                new NovaLoja("wallmart"));
    }

}
