/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaoametodos.test;

import javacore.introducaoametodos.classes.Professor;

/**
 *
 * @author User
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf="C01.c11.c11";
        prof.matricula="m01.m11.m11";
        prof.nome="nome 01.n11.n11";
        prof.rg="r01.r11.r11";
        
        Professor prof1 = new Professor();
        prof1.cpf="C11.c11.c11";
        prof1.matricula="m11.m11.m11";
        prof1.nome="n11.n11.n11";
        prof1.rg="r11.r11.r11";
        
        Professor prof2 = new Professor();
        prof2.cpf="c22.c11.c11";
        prof2.matricula="m22.m11.m11";
        prof2.nome="n22.n11.n11";
        prof2.rg="r22.r11.r11";
        /*
        prof2.imprime(prof2);
        System.out.println("______________");
        prof2.imprime(prof1);
        System.out.println("______________");
        prof2.imprime(prof);
        
        System.out.println("Enderecos de memoria referenciados:");
        System.out.println(prof);
        System.out.println(prof1);
        System.out.println(prof2);
        */
        /*System.out.println("Dentro do professor test");
        System.out.println("nome atual: " +prof.nome);
        prof.imprime(prof);
        System.out.println("______________________");
        System.out.println("Apos o imprime o nome sera: ");
        System.out.println(prof.nome);
        */
        prof.imprime();
        prof1.imprime();
        prof2.imprime();
        
        
        
        
        
        
    }
    
}
