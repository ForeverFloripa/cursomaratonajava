/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.heranca.classes;

/**
 *
 * @author User
 */
public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("bloco de inicializacao do funcionario static");
    }

    {
        System.out.println("bloco de inicializacao do funcionario 1");
    }

    {
        System.out.println("bloco de inicializacao do funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.getSalario());
    }

    public void imprimeReciboDePagamento() {
        System.out.println("Eu " + super.nome + " Cpf " + super.cpf + " recebi o pagamento de " + this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
