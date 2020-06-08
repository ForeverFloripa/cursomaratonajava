/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.concorrencia.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author User
 */
class MapReadWrite {

    private Map<String, String> map = new LinkedHashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
    }

    public Object[] allKeys() {
        return map.keySet().toArray();
    }

}

public class MapReadWriteLockTest {

    private final static MapReadWrite mapReadWrite = new MapReadWrite();
    private static final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(new Write());
        Thread t4 = new Thread(new WriteB());
        Thread t2 = new Thread(new ReadA());
        Thread t3 = new Thread(new ReadB());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    static class Write implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 30; i++) {
                rwl.writeLock().lock();
                try {
                    mapReadWrite.put(String.valueOf(i), String.valueOf(i));
                    System.out.println(Thread.currentThread().getName());
                } finally {
                    rwl.writeLock().unlock();
                }
            }
        }

    }

    static class WriteB implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 30; i++) {
                rwl.writeLock().lock();
                try {
                    mapReadWrite.put(String.valueOf(i), String.valueOf(i));
                    System.out.println(Thread.currentThread().getName());
                } finally {
                    rwl.writeLock().unlock();
                }
            }
        }

    }

    static class ReadA implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                rwl.readLock().lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " " + Arrays.toString(mapReadWrite.allKeys()));

                } finally {
                    rwl.readLock().unlock();
                }
            }
        }

    }

    static class ReadB implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                rwl.readLock().lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " " + Arrays.toString(mapReadWrite.allKeys()));

                } finally {
                    rwl.readLock().unlock();
                }
            }
        }

    }

}
