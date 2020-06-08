/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.lambdas.classes;

/**
 *
 * @author User
 */
public class ComparadorCarro {
    public static int compareByColor( Carro c1, Carro c2){
        return c1.getCor().toLowerCase().compareTo(c2.getCor().toLowerCase());
        //ao testar verifiquei que maiusculas sao ordenadas primeiro
    }
    
    public static int comparePorAno(Carro c1, Carro c2){
        return ((Integer)c1.getAno()).compareTo(c2.getAno());
        //ao testar verifiquei que maiusculas sao ordenadas primeiro
    }
    
}
