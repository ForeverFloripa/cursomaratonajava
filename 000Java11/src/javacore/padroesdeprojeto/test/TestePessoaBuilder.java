/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.classes.Pessoa;

/**
 *
 * @author User
 */
public class TestePessoaBuilder {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa("will","Queiroz", "Suane","Jiraya Bolado","will");
        Pessoa p = new Pessoa.PessoaBuilder("will")
                .apelido("Jiraya Bolado")
                .nomeDoMeio("Suane")
                .nomeDoPai("Willl")
                .ultimoNome("suann")
                .build();
        System.out.println(p);
    }
    
}
