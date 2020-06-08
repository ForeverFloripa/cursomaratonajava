/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.polimorfismo.test;

import javacore.polimorfismo.classes.Gerente;
import javacore.polimorfismo.classes.RelatorioPagamento;
import javacore.polimorfismo.classes.Vendedor;



public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("osvaldo",5000,2000);
        Vendedor v = new Vendedor("Yuri",2000,20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
        
        relatorio.relatorioPagamentoGenerico(g);
        relatorio.relatorioPagamentoGenerico(v);
        
                
        
    }
    
}
