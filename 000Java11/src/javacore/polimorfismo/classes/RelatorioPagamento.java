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
public class RelatorioPagamento {
    
//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando Relatorio de pagamento para Gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salario: " + gerente.getSalario());
//        
//    }
//    
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando Relatorio de pagamento para Vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salario: " + vendedor.getSalario());
//        
//    }
    
    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando Relatorio de pagamento para Funcionario");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        if(funcionario instanceof Gerente){
        Gerente w = (Gerente) funcionario;
        System.out.println("Participacoa nos lucros: " + w.getPnl());
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total Vendas: " + ((Vendedor) funcionario).getTotalVendas());
            
        }
        
        
        
    }
    
}
