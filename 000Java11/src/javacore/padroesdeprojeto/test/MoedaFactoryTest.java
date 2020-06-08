/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.classes.Moeda;
import javacore.padroesdeprojeto.classes.MoedaFactory;
import javacore.padroesdeprojeto.classes.Pais;

/**
 *
 * @author User
 */
public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        System.out.println(moeda.getSimbolo());
        Moeda moeda2 = MoedaFactory.criarMoeda(Pais.EUA);
        System.out.println(moeda2.getSimbolo());
        
    }
    
}
