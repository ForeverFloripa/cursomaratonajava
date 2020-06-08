/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.modificadorestatico.classes;

/**
 *
 * @author User
 */
public class Cliente {

    private static int[] parcelas;

    static{
        parcelas = new int[100];
        System.out.println("Dentro do Bloco de Inicializacao estatico");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;

        }
    }

    public static int[] getParcelas() {
        return parcelas;
    }


    public Cliente() {
    }
}
