/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.seminarioexercicio.classes;

/**
 *
 * @author User
 */
public class Aluno {

    // podera estar apenas em um seminario
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public void print() {
        System.out.println("-----Print de Aluno-----");
        System.out.println("Aluno : " + this.nome);
        System.out.println("Idade : " + this.idade);
        if (seminario != null) {

            System.out.println("Seminario : " + this.seminario.getTitulo());
            return;
        }
        System.out.println("Aluno não matriculado em seminarios");

    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
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

}
