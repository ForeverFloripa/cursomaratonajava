/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.csobrecargametodos.test;

import javacore.csobrecargametodos.classes.Funcionario;

/**
 *
 * @author User
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("CHica da Silva","004.486",4500,"559933");
        
        funcionario.imprime();
        System.out.println(funcionario.hashCode());
        
        Funcionario func2 = new Funcionario();
        func2.imprime();
        
        
    }
            
    
}
