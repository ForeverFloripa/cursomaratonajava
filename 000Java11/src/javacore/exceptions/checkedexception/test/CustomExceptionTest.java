/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.exceptions.checkedexception.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import javacore.exceptions.customexception.LoginInvalidoException;

/**
 *
 * @author User
 */
public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException ex) {
            ex.printStackTrace();
        }
        
    }
    private static void logar() throws LoginInvalidoException{
        String usuarioBancoDeDados = "admin";
        String senhaBancoDeDados = "1010";
        String usuarioDigitado = "admin";
        String senhaDigitada = "1111";
        
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
    }else{
            System.out.println("Logado");
            }
        
        
        
        
    }
}
