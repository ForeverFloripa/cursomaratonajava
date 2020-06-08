/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.classes;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Comprador {
    private Integer id;
    private String cpf;
    private String nome;

  

    @Override
    public String toString() {
        return "Comprador{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + '}';
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Comprador(Integer id, String cpf, String nome) {
        this.id=id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Comprador() {
    }

    public Comprador(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comprador other = (Comprador) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
