/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.polimorfismo.classes;

/**
 *
 * @author User
 */
public class Vendedor extends Funcionario{
    private double totalVendas;
    
    public Vendedor(String nome, double salario,double totalVendas) {
        super(nome, salario);
        this.totalVendas=totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (totalVendas *0.05);
    }
    
}
