/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.IO.test;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author User
 */
public class FIleDiretorioTest {

    public static void main(String[] args) throws IOException {
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Criado: " + mkdir);
//
//        File arquivo = new File(diretorio, "arquivo.txt");
//        boolean newfile = arquivo.createNewFile();
//        System.out.println("Arquivo criado: " + newfile);
//
//        File arquivoNovoNome = new File(diretorio, "arquivo_renomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("renomeado: " + renamed);
//
//        File diretorioRenomeado = new File("folder2");
//        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("diretorio renomeado: " + diretorioRenamed);
        
        buscarArquivos();
        
    }
    
    public static void buscarArquivos(){
        File file = new File("folder2");
        String[] list = file.list();
        
        for(String fold:list){
            System.out.println(fold);
        }
        
    }

}
