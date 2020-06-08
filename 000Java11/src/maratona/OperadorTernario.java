/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona;

/**
 *
 * @author User
 */
public class OperadorTernario {

    public static void main(String[] args) {
        int idade = 20;
        String status = "indefinido";
        status = idade < 22 ? "menor" : "maior";
        System.out.println(status);

    }

}
