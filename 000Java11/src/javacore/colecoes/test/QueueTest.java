/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;
import javacore.colecoes.classes.Consumidor;

/**
 *
 * @author User
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        
        
        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("F");
        queue.add("B");
        queue.add("G");

        System.out.println(queue.peek());
        System.out.println(queue.size());
        

    }
}
