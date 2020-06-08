/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.exceptions.error.checkedexception.test;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CheckedExceptionTest {

    public static void main(String[] args) {
        /*try {
            criarArquivo();
        } catch (IOException ex) {
            Logger.getLogger(CheckedExceptionTest.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        abrirArquivo();
        
    }

    public static void criarArquivo() throws IOException {
        File file = new File("c://txt//teste.txt");
        try{
        System.out.println("arquivo criado?" + file.createNewFile());
        System.out.println("Arquivo Criado");
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    
    public static void abrirArquivo(){
        try{
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo no  arquivo");
            System.out.println("Executando a leitura no  arquivo");
            throw new Exception();
            //System.out.println("Escrevendo no  arquivo");
        }catch(Exception e){
            System.out.println("Dentro do catch");
            e.printStackTrace();
        }finally{
            System.out.println("Fechando o arquivo");
            
        }
    }
    
    
    
}
