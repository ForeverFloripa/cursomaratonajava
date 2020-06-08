/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.completablefuture.classes;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Desconto {

    public enum Codigo {
        NENHUM(0), SILVER(5), GOLD(10), PLATINIUM(15), ELITE(20);
        private final int porcentagem;

        Codigo(int porcentagem) {
            this.porcentagem = porcentagem;
        }

        public int getPorcentagem() {
            return porcentagem;
        }
    }

    public static String calcularDesconto(Orcamento orcamento) {
        
       return String.format(
        "%s o preco original: %.2f,desconto: %d,"+"preco final: %.2f"
        ,orcamento.getNomeLoja()
        ,orcamento.getPreco()
        ,orcamento.getCodigoDesconto().getPorcentagem()
        ,calculo(orcamento.getPreco()
                ,orcamento.getCodigoDesconto()));
    }

   
    
    private static double calculo(double preco, Codigo codigo) {
        delay();
        return preco * (100 - codigo.porcentagem) / 100;
    }

    private static void delay() {
        try {
            int delay = ThreadLocalRandom.current().nextInt(300,2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(NovaLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
