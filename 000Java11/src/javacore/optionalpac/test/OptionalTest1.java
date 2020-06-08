/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.optionalpac.test;

import java.util.Optional;

/**
 *
 * @author User
 */
public class OptionalTest1 {
    private String nome;
    
    public static void main(String[] args) {
        OptionalTest1 ot = new OptionalTest1();
//        if(ot.nome!=null){
//        System.out.println(ot.nome.toUpperCase());
//        } 
    Optional<String> optional1 = Optional.of("DevDojo");
    Optional<String> optional2 = Optional.empty();
    Optional<String> optional3 = Optional.ofNullable(ot.nome);
        System.out.println("__Imprimindo__");
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println("__Buscando os valores__");
        System.out.println(optional1.orElse("vazio"));
        System.out.println(optional2.orElse("vazio"));
        System.out.println(optional3.orElse("vazio"));

        
        
    }
    
}
