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
public class ControleDeFluxoContinue {

    public static void main(String[] args) {
        // dado valor de um carro descubra em quantas vezes ele pode ser parcelado
        // parcela minima 1000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }
}
