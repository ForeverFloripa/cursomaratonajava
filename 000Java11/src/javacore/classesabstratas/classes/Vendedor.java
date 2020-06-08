/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.classesabstratas.classes;

/**
 *
 * @author User
 */
public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario,double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }
    
    

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    
    @Override
    public void calculaSalario() {
         this.salario = salario + (totalVendas * 0.05);
    }

    @Override
    public void imprime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
