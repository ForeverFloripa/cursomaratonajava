/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.nio.test.serializacao.classes;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Turma{
    private String nome;

    @Override
    public String toString() {
        return "Turma{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma(String nome) {
        this.nome = nome;
    }
    
}
