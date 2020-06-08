/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.sobrecargaconstrutores.classes;

/**
 *
 * @author User
 */
public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Aluno() {
    }

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }
    
    
    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        for(double not : notas){
            System.out.println("nota: "+ not);
        }
    }
    
}
