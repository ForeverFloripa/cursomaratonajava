/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author User
 */
public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path dir = Paths.get("pasta");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for(Path path:stream){
                System.out.println(path);
            }
            
            
        }catch(IOException e){
            e.printStackTrace();
            
        }
        
    }
    
}
