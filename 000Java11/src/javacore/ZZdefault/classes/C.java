/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.ZZdefault.classes;

import javacore.ZZdefault.interfaces.A;
import javacore.ZZdefault.interfaces.B;
import javacore.ZZdefault.interfaces.D;

/**
 *
 * @author User
 */
public class C implements A,B{
    public static void main(String[] args) {
        new C().oi();
        //uma classe sempre tem prioridade sobre uma interface
        //o metodo de mesma signatura mais especifico tera prioridade
        //se for ambigua tem que dizer explicitamente qual vai sobrescrever
    }
    public void oi(){
        B.super.oi();
        A.super.oi();
    }
    
}
