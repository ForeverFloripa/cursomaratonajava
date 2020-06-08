/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaoametodos.test;

import javacore.introducaoametodos.classes.Estudante;

/**
 *
 * @author User
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estu = new Estudante();
        estu.setNome("nome1");
        estu.setIdade(-20);
        estu.setNotas(new float[]{10,10,10,3});
        
        estu.calculaMedia();
        System.out.println(estu.getNome());
        
    }
            
        
}
