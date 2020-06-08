/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.generics.classes;

/**
 *
 * @author User
 */
public class Computador {
    private String nome;

    
    public Computador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Computador{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
