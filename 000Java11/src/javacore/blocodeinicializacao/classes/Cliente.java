/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.blocodeinicializacao.classes;

/**
 *
 * @author User
 */
public class Cliente {

    private int[] parcelas;

    {
        parcelas = new int[100];
        System.out.println("Dentro do Bloco de Inicializacao");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
            System.out.print(i+ " ");

        }

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

    public Cliente() {
    }
}
