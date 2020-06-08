/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.expressoesregulares.test;

/**
 *
 * @author User
 */
public class TokenTest {
    public static void main(String[] args) {
        String str = "Willian,   paulo cesar   , joana, anna, camila, matheus";
        String[] tokens = str.split(",");
        for(String arr:tokens){
            System.out.println(arr.trim());
        }
    }
    
}
