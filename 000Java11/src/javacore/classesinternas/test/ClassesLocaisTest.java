/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.classesinternas.test;

/**
 *
 * @author User
 */
public class ClassesLocaisTest {

    private String nome = "willian";

    public void fazAlgumaCoisa() {
        String sobrenome = "suane";
        
        class Interna {

            public void imprimeNomeExterno() {
                System.out.println(nome);
                System.out.println(sobrenome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();

    }

    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
        
        
    }

}
