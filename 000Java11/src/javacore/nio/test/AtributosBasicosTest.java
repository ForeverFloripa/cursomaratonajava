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
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author User
 */
public class AtributosBasicosTest {

    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("folder2\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        //file.delete();

        Path path = Paths.get("folder2\\oldarquivo_renomeado.txt");
        //Files.createFile(path);
        FileTime filetime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, filetime);
        System.out.println(Files.getLastModifiedTime(path));
        //Files.deleteIfExists(path);

        path = Paths.get("src\\javacore\\introducaoametodos\\test\\CalculadoraTest.java");

        System.out.println("Readeble: " + Files.isReadable(path));
        System.out.println("Writable: " + Files.isWritable(path));
        System.out.println("Executable: " + Files.isExecutable(path));
        //System.out.println(Files.deleteIfExists(path));
        //BasicFileAttributes, PosixFileAttributes, DosFileAttributes

        // LEITURA
        BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("create: " + atributosBasicos.creationTime());
        System.out.println("lastAcess: " + atributosBasicos.lastAccessTime());
        System.out.println("last modified: " + atributosBasicos.lastModifiedTime());
        System.out.println("________________________");
//        System.out.println("Directory: "+atributosBasicos.isDirectory());
//        System.out.println("SimbolicLink: "+atributosBasicos.isSymbolicLink());
//        System.out.println("RegularFile: "+atributosBasicos.isRegularFile());

        //BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView, 
        //FileOwnerAtttributeView, AclFileAttributeView
        //MODIFICACAO
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime lastModified = atributosBasicos.lastModifiedTime();
        FileTime created = atributosBasicos.creationTime();
        FileTime lastAccess = FileTime.fromMillis(System.currentTimeMillis());
        basicView.setTimes(lastModified, lastAccess, created);

        atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("create: " + atributosBasicos.creationTime());
        System.out.println("lastAcess: " + atributosBasicos.lastAccessTime());
        System.out.println("last modified: " + atributosBasicos.lastModifiedTime());
    }

}
