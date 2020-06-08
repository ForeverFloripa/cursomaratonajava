/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.threads.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import javacore.threads.classes.Conta;

/**
 *
 * @author User
 */
public class ContaTest implements Runnable {

    private Conta conta = new Conta();

    public static void main(String[] args) {

        ContaTest contatest = new ContaTest();
        Thread Willian = new Thread(contatest, "Willian");
        Thread Ana = new Thread(contatest, "Ana");
        Willian.start();

        Ana.start();
    }

    public static synchronized void imprime() {
        synchronized (ContaTest.class){
            System.out.println("aaaaa");
        }
    }

    private synchronized void saque(int valor) {
        if (conta.getSaldo() >= valor) {
            System.out.println(Thread.currentThread().getName() + "Esta indo sacar");

            conta.saque(valor);
            System.out.println(Thread.currentThread().getName() + " Completou o saque, saldo : " + conta.getSaldo());
        } else {
            System.out.println("Saldo Insuficiente" + Thread.currentThread().getName() + " efetuar o saque" + conta.getSaldo());

        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Oh meu Deus!!!");
            }

        }
    }

}
