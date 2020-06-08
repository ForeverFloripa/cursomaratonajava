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
public class StringBuiderTest {
    public static void main(String[] args) {
        String s = "frase comum";
        StringBuilder sb = new StringBuilder(16);//caso nao passe ficam 16 caracteres
        System.out.println(s.concat(" test"));
        sb.append(" 0123456789");
        //System.out.println(sb);// metodo toString sendo chamado
//        System.out.println(sb.reverse());
//        System.out.println(sb.reverse());
//        System.out.println(sb.delete(0,2));
//        System.out.println(sb);
        System.out.println(sb.insert(2, "#######"));
        
    }
    
}