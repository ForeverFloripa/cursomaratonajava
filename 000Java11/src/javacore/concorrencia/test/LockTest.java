/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.concorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author User
 */


public class LockTest {
    public static void main(String[] args) {
    final ReentrantLock lock = new ReentrantLock();
    
    new Thread(new Worker("A",lock)).start();
    new Thread(new Worker("B",lock)).start();
    new Thread(new Worker("C",lock)).start();
    new Thread(new Worker("D",lock)).start();
    new Thread(new Worker("E",lock)).start();
    new Thread(new Worker("F",lock)).start();
    new Thread(new Worker("G",lock)).start();
    new Thread(new Worker("H",lock)).start();
    new Thread(new Worker("I",lock)).start();
    }
    static class Worker implements Runnable{
        private String nome;
        private ReentrantLock reentrantLock;

        public Worker(String nome, ReentrantLock ReentrantLock) {
            this.nome = nome;
            this.reentrantLock = ReentrantLock;
        }

        @Override
        public void run() {
            reentrantLock.lock();
            
            try {
                if(reentrantLock.isHeldByCurrentThread()){
                    System.out.printf("Thread %s entrou em uma secao critica %n",nome);
                    System.out.printf("%d Thread esperando na fila %n",reentrantLock.getQueueLength());
                    System.out.printf("Thread %s vai trabalhar por 2 segundos %n",nome);
                    Thread.sleep(2000);
                    System.out.printf("Thread %s finalizou o trabalho %n",nome);
                    
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{
                reentrantLock.unlock();
            }
            
            
        }
    }
    
     
    
}
