/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.streamspac.classes;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + '}';
    }
    private Genero genero;

    public Pessoa(String nome, int idade, double salario, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
    }

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static List<Pessoa> bancoDePessoas(){
        return asList(
                new Pessoa("Mercy",22,3500,Genero.FEMININO),
                new Pessoa("Willian",22,2000,Genero.MASCULINO),
                new Pessoa("Mercy",29,3500,Genero.FEMININO),
                new Pessoa("ZHulk",31,5100,Genero.MASCULINO),
                new Pessoa("Zezinho",33,7700,Genero.MASCULINO),
                new Pessoa("Basilico",32,2800,Genero.MASCULINO),
                new Pessoa("Ana",23,5000,Genero.FEMININO),
                new Pessoa("Cristina",17,6000,Genero.FEMININO),
                new Pessoa("Thor",17,7000,Genero.MASCULINO)
        );
    }

     

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nome);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public Genero getGenero() {
        return genero;
    }
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
