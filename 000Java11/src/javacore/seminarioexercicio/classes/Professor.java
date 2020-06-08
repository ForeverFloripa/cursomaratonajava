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
public class Professor {
    // PODERA MINISTRAR 1 OU VARIOS SEMINARIOS

    private String nome;
    private String especialidade;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("Professor: " + nome);
        System.out.println("Especialidade: " + especialidade);

        if (seminarios != null && seminarios.length != 0) {
            System.out.print("Seminarios Participantes: ");
            for (Seminario sem : seminarios) {
                System.out.println(sem.getTitulo() + " ");
            }
            return;
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    private Seminario[] seminarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
