/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.modificadorfinal.test;

import javacore.modificadorfinal.classes.Carro;
import javacore.modificadorfinal.classes.Comprador;

/**
 *
 * @author User
 */
public class CarroTest {

    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("teste nome");
        System.out.println(c.getComprador());

    }

}
