/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DOsFileAttributesTest {
    public static void main(String[] args) {
        Path path = Paths.get("folder2\\teste.txt");
        try {
            //Files.deleteIfExists(path);
            //Files.createFile(path);
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path, "dos:readonly", true);
            DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println("hiden: " + dos.isHidden());
            System.out.println("ReadyOnly: " +dos.isReadOnly());
            
            DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
            dosView.setHidden(false);
            dosView.setReadOnly(false);
            
            dos=Files.readAttributes(path, DosFileAttributes.class);
            System.out.println("hiden: " + dos.isHidden());
            System.out.println("ReadyOnly: " +dos.isReadOnly());
            
            
        } catch (IOException ex) {
            Logger.getLogger(DOsFileAttributesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
    
}
