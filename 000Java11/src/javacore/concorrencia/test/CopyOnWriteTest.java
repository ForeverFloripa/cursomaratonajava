/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.concorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CopyOnWriteTest implements Runnable {

    private List<Integer> list = new CopyOnWriteArrayList<>();
    //private Set<Integer> set = new CopyOnWriteArraySet<>();

    public CopyOnWriteTest() {
        for (int i = 0; i < 9000; i++) {
            list.add(i);

        }
    }

    @Override
    public void run() {
        Iterator<Integer> iterator = list.iterator();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(CopyOnWriteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (iterator.hasNext()) {
            System.out.println(Thread.currentThread().getName() + " " + iterator.next());
        }

    }

    public List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        CopyOnWriteTest ct = new CopyOnWriteTest();
        Thread t1 = new Thread(ct);
        Thread t2 = new Thread(ct);
        Thread removedor = new Thread(new RemoverMembros(ct.getList()));
        t1.start();
        t2.start();
        removedor.start();
        
    }

    private static class RemoverMembros implements Runnable {

        private List<Integer> list;

        public RemoverMembros(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName()+ " removeu  " + list.remove(i));
                
            }
        }

    }
}
