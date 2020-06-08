/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.exceptions.checkedexception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import javacore.exceptions.checkedexception.classes.Leitor1;
import javacore.exceptions.checkedexception.classes.Leitor2;

/**
 *
 * @author User
 */
public class TryWithResourcesTest {

    public static void main(String[] args) {
        lerArquivo();

    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
                Leitor2 leitor2 = new Leitor2()) {

        } catch (Exception e) {

        }
    }

    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.exe"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

}
