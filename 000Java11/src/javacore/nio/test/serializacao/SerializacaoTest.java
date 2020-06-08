/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.nio.test.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacore.nio.test.serializacao.classes.Aluno;
import javacore.nio.test.serializacao.classes.Turma;

/**
 *
 * @author User
 */
public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }
    
    private static void gravadorObjeto(){
        Turma t = new Turma("Maratona Java");
        Aluno aluno = new Aluno(1L, "Willian Suane 1","1234567");
        aluno.setTurma(t);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    
}
    private static void leitorObjeto(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
           Aluno aluno =  (Aluno)ois.readObject();
            System.out.println(aluno);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerializacaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
}
}
