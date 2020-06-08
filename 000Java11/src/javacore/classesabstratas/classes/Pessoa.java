/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.classesabstratas.classes;

/**
 *
 * @author User
 */
public abstract class Pessoa {
    protected String nome;
    public String getPessoa() {
        return nome;
    }

    public void setPessoa(String pessoa) {
        this.nome = nome;
    }
    
    
    public abstract void imprime();
        
    
    
}
