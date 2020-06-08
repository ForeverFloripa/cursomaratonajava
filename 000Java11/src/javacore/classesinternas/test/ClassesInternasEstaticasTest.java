/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.classesinternas.test;

class Externa{
    static class Interna{
        public void imprimir(){
            System.out.println("OI");
        }
    }
}


public class ClassesInternasEstaticasTest {
    public static void main(String[] args) {
        Externa.Interna teste = new Externa.Interna();
        teste.imprimir();
        Interna2 teste2 = new Interna2();
        teste2.Imprimir();
        
    }
    static class Interna2{
    public void Imprimir(){
            System.out.println("OI dentro do Interna 2");
}}
   
}
