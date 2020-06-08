/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author User
 */
public class RelativizarTest {

    public static void main(String[] args) {
        Path dir = Paths.get("/home/willian");
        Path classe = Paths.get("/home/willian/java/Pessoa.java");
        Path pathToClass = dir.relativize(classe);
        System.out.println(pathToClass);

        Path absoluto1 = Paths.get("/home/willian");
        Path absoluto2 = Paths.get("/user/local");
        Path absoluto3 = Paths.get("/home/willian/java/Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/Funcionario.java");
        System.out.println("....................................");

        System.out.println("1: " + absoluto1.relativize(absoluto3));
        System.out.println("2: " + absoluto3.relativize(absoluto1));
        System.out.println("3: " + absoluto1.relativize(absoluto2));
        System.out.println("4: " + relativo1.relativize(relativo2));
        //System.out.println("6: "+ absoluto1.relativize(relativo1)); dao erro .. java nao sabe onde o tempo estava
        //System.out.println("5: "+ absoluto1.relativize(relativo2));

    }

}
