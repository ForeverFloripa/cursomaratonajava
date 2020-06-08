/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaoametodos.classes;

/**
 *
 * @author User
 */
public class Estudante {

    private String nome;
    private int idade;
    //public float nota1,nota2,nota3;// 3 notas
    //public float notas[]={nota1,nota2,nota3};
    private float notas[];

    public Estudante(String string, String carlitos, double[] d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Estudante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        if(idade<0){
            System.out.println("idade negativa, corrija");
            return;
        }
        this.idade = idade;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    
    
    
    
    

    public void calculaMedia() {
        float soma = 0;

        if (notas == null) {
            System.out.println("Este aluno nao possui notas");
            return;
        } else {
            for (float num : notas) {
                soma += num;
            System.out.println(num);
            }
            float media = soma / notas.length;
            System.out.println("aluno: " + this.nome + " " + this.idade + "anos " + "Media = " + media);
            System.out.println("Media: " + media);

            if (media >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
