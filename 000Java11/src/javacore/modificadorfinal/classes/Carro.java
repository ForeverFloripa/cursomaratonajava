/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.modificadorfinal.classes;

/**
 *
 * @author User
 */
public class Carro {
    public final Comprador comprador=new Comprador();
    public static final double VELOCIDADE_FINAL=240;
    private String nome;
    private String marca;

    
    
    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", marca=" + marca + '}';
    }

    public Comprador getComprador() {
        return comprador;
    }

    
    
    public static double getVELOCIDADE_FINAL() {
        return VELOCIDADE_FINAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
