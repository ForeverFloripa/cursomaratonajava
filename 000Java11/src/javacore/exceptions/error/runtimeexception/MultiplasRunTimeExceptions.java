/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.exceptions.error.runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class MultiplasRunTimeExceptions {

    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();

        } catch (IllegalArgumentException | ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("dentro do catch");
        }
        System.out.println("_______Final___________");
        
        
        try {   // a partir do java 7
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {// pode substituir por Exception e
            System.out.println("try2 catch in");
        }

    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

}
