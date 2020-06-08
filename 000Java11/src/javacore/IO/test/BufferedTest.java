/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.IO.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class BufferedTest {

    public static void main(String[] args) {
        File file = new File("arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("Escrevendo uma mensagem no arquivo e pulando uma linha ");
            bw.newLine();
            bw.write("pulando uma linha2 ");
            bw.newLine();
            bw.flush();
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

//        try {
//            FileWriter fw = new FileWriter(file, true);
//            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//
//            bw.write("Escrevendo uma mensagem no arquivo e pulando uma linha ");
//            bw.newLine();
//            bw.write("pulando uma linha2 ");
//            bw.newLine();
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while ((s = br.readLine()) != null) {
//                System.out.println(s);
//            }
//            br.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
    }
}
