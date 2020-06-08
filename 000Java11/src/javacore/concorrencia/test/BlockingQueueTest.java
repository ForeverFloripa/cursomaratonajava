/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        
        
        Thread t1 = new Thread(new RemoveFromQueue(bq));
        bq.put("willian");
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor");
        t1.start();
        bq.put("dev Dojo the Best");
        System.out.println("Inserindo o ultimo  valor ");
        
    }
    
    static class RemoveFromQueue implements Runnable{
    private BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }
    

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " entrando em espera por 5 segundos" );
        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Removendo o valor:  " + bq.take());
            
        } catch (InterruptedException ex) {
            Logger.getLogger(BlockingQueueTest.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
    }
}
