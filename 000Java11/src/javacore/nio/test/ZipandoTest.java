/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.nio.test;

//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author User
 */
public class ZipandoTest {

    public static void main(String[] args) {
        Path dirZip = Paths.get("pasta/subpasta");
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
        Path zipFile = dirZip.resolve("arquivo.zip");
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
                DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
            for (Path path : stream) {
                zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
                FileInputStream fileInputStream = new FileInputStream(path.toFile());
//                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
//                zip.putNextEntry(zipEntry);
//                FileInputStream fileInputStream = new FileInputStream(path.toFile());
                byte[] buff = new byte[2048];
                int bytesRead;
                while ((bytesRead = fileInputStream.read(buff)) > 0) {
                    zip.write(buff, 0, bytesRead);
                }
                //zip.close();
                fileInputStream.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(ZipandoTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
