/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public enum AviaoSingletonEnum {
    
    INSTANCE;
    private Set<String> assentosDisponiveis;
    private AviaoSingletonEnum() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }
    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }
    
    public static void agendarAssento(String assento) {
        AviaoSingletonEnum a = AviaoSingletonEnum.INSTANCE;

       System.out.println(a.bookAssento(assento));
       
       
    }

    
}
