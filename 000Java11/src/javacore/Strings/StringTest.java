/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.Strings;

/**
 *
 * @author User
 */
public class StringTest {

    public static void main(String[] args) {
//Strings sao imutaveis
        String nome = "William";
        String nome2 = "William2";
        String sobrenome = new String("Suane");
        nome2.concat(sobrenome);//mesmo que: nome2 += " suane", ele cria uma terceira string com o nome e sobrenome 

        /*nome += " suane";
        nome = nome2.concat(sobrenome);// agora sim nome passa a  referenciar nome e sobrenome 

        System.out.println(nome);
        System.out.println("nome2: " + nome2);
        System.out.println(nome + " " + sobrenome);
        */
        
        String teste = "goku";
        System.out.println(teste.charAt(0));
        System.out.println(teste.charAt(1));
        System.out.println(teste.charAt(2));
        System.out.println(teste.charAt(3));
        
        String teste2 = "Goku";
        String teste3 = " 0123456789 ";
        
        System.out.println(teste == teste2);
        System.out.println(teste.equals(teste2));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace("o","e"));
        System.out.println(teste3.subSequence(0, 2));
        System.out.println(teste3.subSequence(0, 5));
        System.out.println(teste3.subSequence(1, 5));
        System.out.println(teste3.trim());
        
        

    }

}
