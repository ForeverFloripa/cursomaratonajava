/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.threads.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
class ThreadTrabalhadoraExecutor implements Runnable {

    private String num;

    public ThreadTrabalhadoraExecutor(String num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Iniciou: " + num);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadTrabalhadoraExecutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Thread.currentThread().getName() + " finalizou");

    }

}

public class ExecutorTest {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        //ExecutorService executorService = Executors.newFixedThreadPool(4);
        //ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
//        threadPoolExecutor.setCorePoolSize(Runtime.getRuntime().availableProcessors());
        executorService.execute(new ThreadTrabalhadoraExecutor("1"));
        executorService.execute(new ThreadTrabalhadoraExecutor("2"));
        executorService.execute(new ThreadTrabalhadoraExecutor("3"));
        executorService.execute(new ThreadTrabalhadoraExecutor("4"));
        executorService.execute(new ThreadTrabalhadoraExecutor("5"));
        executorService.execute(new ThreadTrabalhadoraExecutor("6"));
        executorService.execute(new ThreadTrabalhadoraExecutor("7"));
        executorService.execute(new ThreadTrabalhadoraExecutor("8"));
        executorService.shutdown();
        while(!executorService.isTerminated()){}
        System.out.println(executorService.isTerminated());
        
        System.out.println("Finalizado");
    }

}
