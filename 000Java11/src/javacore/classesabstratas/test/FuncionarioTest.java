/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.classesabstratas.test;

import javacore.classesabstratas.classes.Funcionario;
import javacore.classesabstratas.classes.Gerente;
import javacore.classesabstratas.classes.Vendedor;

/**
 *
 * @author User
 */
public class FuncionarioTest {

    public static void main(String[] args) {
        /*Gerente g = new Gerente("Ana", "111112", 2000);
        g.calculaSalario();
        System.out.println(g);
        */System.out.println(">>>>>>............>>>>>>>");
        Vendedor v = new Vendedor("ana vendedora","121212",1500,5000);
        v.calculaSalario();
        System.out.println(v);
    }

}
