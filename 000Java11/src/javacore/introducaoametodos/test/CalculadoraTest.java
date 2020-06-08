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
public class CalculadoraTest {

    public static void main(String... args) {

        Calculadora calc = new Calculadora();
        int a = 1;

        int b = 5;
        calc.somaDoisNumeros(a, b);
        calc.subtraiDoisNumeros(a, b);
        double result =calc.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println("Imprime Dois Numeros Divididos");
        calc.imprimeDoisNumerosDivididos(20, 5);
        
        
        int[] numeros = new int[]{1,2,3,4,5,6};
        System.out.println("soma array");
        calc.somaArray(numeros);
        
        calc.somaVarArgs(11,2,3);

    }

}
