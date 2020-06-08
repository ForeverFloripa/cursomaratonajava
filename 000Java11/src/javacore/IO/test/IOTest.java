/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.IO.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class IOTest {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");
        try {
            if(file.exists()){
                System.out.println("Arquivo ja existe");
            }else{
            System.out.println(file.createNewFile());
            }
            System.out.println(file.canWrite());
            System.out.println(file.canRead());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getFreeSpace());
            System.out.println(new Date(file.lastModified()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
