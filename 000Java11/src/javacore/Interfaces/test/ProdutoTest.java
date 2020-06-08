/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.Interfaces.test;

import javacore.Interfaces.classes.Produto;

/**
 *
 * @author User
 */
public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("notebook",4,3000);
        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
        
    }
}
