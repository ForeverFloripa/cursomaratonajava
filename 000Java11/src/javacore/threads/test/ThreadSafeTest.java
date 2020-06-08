/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.threads.test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
class ListaNomes {

    @Override
    public String toString() {
        return "ListaNomes{" + "nomes=" + nomes + '}';
    }

    private List<String> nomes = new LinkedList<>();

    public synchronized void add(String nome) {
        nomes.add(nome);
    }

    public synchronized void removerPrimeiro() {
        if (nomes.size() > 0) {
            System.out.println(nomes.remove(0));
        }

    }
}

public class ThreadSafeTest{
    public static void main(String[] args) {
        ListaNomes nome = new ListaNomes();
        nome.add("Willian Suanne");
        
        class RemovedorDeNomes extends Thread {
            public void run() {
                nome.removerPrimeiro();
            }
        }
        
        new RemovedorDeNomes().start();
        new RemovedorDeNomes().start();
    }
}
