/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.concorrencia.classes;

import javacore.threads.classes.*;

/**
 *
 * @author User
 */
public class Conta {
    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }
    
    public void saque(int valor){
        saldo = saldo - valor;
    }
    
    
    
}
