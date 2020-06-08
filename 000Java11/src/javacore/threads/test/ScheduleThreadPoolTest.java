/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.threads.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ScheduleThreadPoolTest {
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1); 
    private static void beep(){
        final Runnable beeper = new Runnable(){
            @Override
            public void run() {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())+ "beep");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ScheduleThreadPoolTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        };
        //scheduledExecutorsService.scheduleAtFixedRate(beeper, 1, 2, TimeUnit.SECONDS);
        final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(beeper, 1, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Cancelando");
                scheduledFuture.cancel(false);
                scheduledExecutorService.shutdown();
                
            }
        },10,TimeUnit.SECONDS);
        
    }
    
    
    public static void main(String[] args) {
        beep();
    }
    
}
