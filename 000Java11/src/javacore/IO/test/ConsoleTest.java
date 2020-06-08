/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.IO.test;

import java.io.Console;

/**
 *
 * @author User
 */
public class ConsoleTest {

    public static void main(String[] args) {
        Console c = System.console();
        char[] pw = c.readPassword("%s", "^pw: ");
        for (char pass : pw) {
            c.format("%c", pass);
        }
        c.format("\n");
        String texto;
        while (true) {
            texto = c.readLine("%s", "Digite: ");
            c.format("%s", retorno(texto));

        }

    }

    public static String retorno(String arg1) {
        return " entrada de dados: " + arg1;

    }

}
