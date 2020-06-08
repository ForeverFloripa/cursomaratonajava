/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.modificadorestatico.classes;

/**
 *
 * @author User
 */
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;
    
    
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite= velocidadeLimite;
    }
    public static  double getVelocidadeLimite(){
        return velocidadeLimite;
    }


    
    public void imprime(){
        System.out.println("..........................");
        System.out.println("Nome   : "+this.nome);
        System.out.println("Vel Max: "+this.velocidadeMaxima);
        System.out.println("Vel Lim: " + velocidadeLimite);
    }
    
    
    
    
    
    
}
