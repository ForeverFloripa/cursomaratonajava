/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaoametodos.test;

import javacore.introducaoametodos.classes.Calculadora;

/**
 *
 * @author User
 */
public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1=5;
        int num2=10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println(num1 +" "+ num2);
    }
    
}
