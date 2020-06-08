/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.expressoesregulares.test;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ScannerTest {

    public static void main(String[] args) {
        /*Scanner scan = new Scanner("1 true 100 oi aa@asd.com");
        while(scan.hasNext()){
            System.out.println(scan.next());
        }*/
        System.out.println("________________________");
        Scanner scan2 = new Scanner("1 2 true 100 oi aa@asd.com");
        while (scan2.hasNext()) {
            if (scan2.hasNextInt()) {
                int i = scan2.nextInt();
                System.out.println("int: " + i);
            } else if (scan2.hasNextBoolean()) {
                boolean b = scan2.nextBoolean();
                System.out.println(b);
            } else {
                System.out.println(scan2.next());
            }
        }

    }
}
