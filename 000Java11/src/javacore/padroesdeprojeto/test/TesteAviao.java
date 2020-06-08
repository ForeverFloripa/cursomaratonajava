/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.classes.Aviao;

/**
 *
 * @author User
 */
public class TesteAviao {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }
    private static void agendarAssento(String assento){
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
    
    
}
