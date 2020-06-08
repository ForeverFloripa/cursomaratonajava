/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CriandoPathTest {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\00MJ\\arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\00MJ", "arquivo.txt");
        Path p3 = Paths.get("C", "\\Users\\User\\Documents\\NetBeansProjects\\00MJ", "arquivo.txt");
        Path p4 = Paths.get("C", "Users", "User", "Documents", "NetBeansProjects", "00MJ", "arquivo.txt");
        //System.out.println("p4: " + p1.toAbsolutePath());

//        System.out.println("p1: " + p1.toAbsolutePath());
//        System.out.println("p2: " + p2.toAbsolutePath());
//        System.out.println("p3: " + p3.toAbsolutePath());
//        System.out.println("p4: " + p4.toAbsolutePath());
        File file = p4.toFile();
        Path path = file.toPath();

        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\00MJ\\pasta\\subpasta\\subsubpasta");
        Path arquivo1 = Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\00MJ\\pasta\\subpasta\\subsubpasta\\filesz.txt");
        try {
//            if (Files.notExists(path1)) {
//                System.out.println(Files.createDirectory(path1));
//            }
            if (Files.notExists(path2)) {
                System.out.println(Files.createDirectories(path2));
                Files.createFile(arquivo1);
            }
            
           
        } catch (IOException ex) {
    
            Logger.getLogger(CriandoPathTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
