/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.modificadorestatico.test;

import javacore.modificadorestatico.classes.Cliente;

/**
 *
 * @author User
 */
public class ClienteTest {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println(""
                + "");
        System.out.println("Dentro da chamada de metodo");
//        for (int parcela : c.getParcelas()) {
//            System.out.print(parcela + " ");
//       }
System.out.println("Tamanho: "+ Cliente.getParcelas().length);
}

}
