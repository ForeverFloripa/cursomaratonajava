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
public class Gerente extends Funcionario {
    private double pnl;
    public Gerente(String nome, double salario,double pnl) {
        super(nome, salario);
        this.pnl=pnl;
    }
    
    @Override
    public void calcularPagamento() {
        this.salario= this.salario + pnl;
    }
   

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

    
    
}
