/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class FileWriterReaderTest {
    public static void main(String[] args) throws IOException {
        File file= new File("arquivo.txt");
        try(FileWriter fw = new FileWriter(file,true);
            FileReader fr = new FileReader(file)){
            fw.write("Escrevendo uma linha \n");
            fw.flush();
            
            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("tamanho: "+ size);
            for(char c:in){
                System.out.print(c);
            }
        }
//        try {
//            FileWriter fw = new FileWriter(file,true);
//            fw.write("Escrevendo uma mensagem no arquivo\ne pulando uma linha3\n");
//            fw.flush();
//            fw.close();
//            
//            FileReader fr = new FileReader(file);
//            char[] in = new char[500];
//            int size = fr.read(in);
//            System.out.println("tamanho: "+ size);
//            for(char c:in){
//                System.out.print(c);
//            }
//            fr.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }
}
