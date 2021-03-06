/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 *
 * @author User
 */
public class LinkedTransferQueueTest {

    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Willian"));
        tq.put("DevDojo");
        System.out.println(tq.offer("Willian"));
        System.out.println(tq.offer("Willian",10,TimeUnit.MILLISECONDS));
        //tq.transfer("DevDEv");
        System.out.println(tq.tryTransfer("dev"));
        System.out.println(tq.tryTransfer("dev",1,TimeUnit.SECONDS));
        
        System.out.println(tq.remainingCapacity());
        
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.poll(10,TimeUnit.MILLISECONDS));
        System.out.println(tq.remove());
        System.out.println(tq.take());
        
    }
}
