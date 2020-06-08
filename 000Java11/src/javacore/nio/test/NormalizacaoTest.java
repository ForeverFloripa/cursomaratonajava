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
public class NormalizacaoTest {

    public static void main(String[] args) {
        String diretorioProj = "00MJ\\home\\willian\\dev";
        String arquivoTxt="..\\..\\arquivoTxt";
        Path p1= Paths.get(diretorioProj,arquivoTxt);
        System.out.println(p1.normalize());
        Path p2 = Paths.get("00MJ/./home/./willian/./dev");
        System.out.println(p2.normalize());
        
    }

}
