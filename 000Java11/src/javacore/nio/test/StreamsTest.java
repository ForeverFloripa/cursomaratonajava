/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.nio.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StreamsTest {

    public static void main(String[] args) {
        //gravadorTunado();
        leitorTunado();

    }

    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt", true)) {
//            for(Byte b :dados){
//                gravador.write(b);
//            }
            gravador.write(dados);
            System.out.println("Dados gravados com sucesso");

        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    private static void leitor() {
        try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {
            int leitura;
            while ((leitura = leitor.read()) != -1) {
                byte b = (byte) leitura;
                System.out.print(" " + b);

            }
        } catch (IOException ez) {
            ez.printStackTrace();
        }
    }

    private static void gravadorTunado() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (BufferedOutputStream gravadorBuffer = new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"), 4098)) {
            gravadorBuffer.write(dados);
            gravadorBuffer.flush();
            System.out.println("Dados gravados com sucesso");

        } catch (IOException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void leitorTunado(){
        try (BufferedInputStream leitorBuffer = new BufferedInputStream(new FileInputStream("pasta/stream.txt"), 4098)) {
            int leitura;
            while ((leitura = leitorBuffer.read()) != -1) {
                byte b = (byte) leitura;
                System.out.print(" " + b);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StreamsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
