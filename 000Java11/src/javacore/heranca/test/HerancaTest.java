/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.heranca.test;

import javacore.heranca.classes.Endereco;
import javacore.heranca.classes.Funcionario;
import javacore.heranca.classes.Pessoa;

/**
 *
 * @author User
 */
public class HerancaTest {
    public static void main(String[] args) {
        /*Pessoa p= new Pessoa("Gina");
        //p.setNome("Gina");
        p.setCpf("12345");
        Endereco end = new Endereco();
        end.setRua("Rua 25");
        end.setBairro("Bairro 1");
        p.setEndereco(end);
        */
        //p.imprime();
        System.out.println("______________________________");
        Funcionario f = new Funcionario("aug");
        //f.setNome("Augusto");
        f.setCpf("111222");
        f.setSalario(15000);
        //f.setEndereco(end);
       //f.imprime();
        //f.imprimeReciboDePagamento();
        
        
        
    }
    
}
