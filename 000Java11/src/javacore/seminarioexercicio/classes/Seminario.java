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
public class Seminario {
    // podera ter nenhum ou varios alunos
    // so podera ter 1 professor
    // devera ter 1 local

    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante " + this.professor.getNome());

        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para este seminario");
        }
        if (this.professor != null) {
            System.out.println("Professor Palestrante: : " + this.professor.getNome());
        } else {
            System.out.println("Nenhum Professor cadastrado para este seminario");
        }

        if (alunos != null&& alunos.length!=0) {
            System.out.println("Alunos participantes: ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum Aluno Participante");
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
