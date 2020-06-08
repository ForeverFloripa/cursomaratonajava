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
public class ControleDeFluxoSwitch {

    public static void main(String[] args) {
        byte dia = 33;
        // char int byte short enum String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Opção Invalida");
        }

        switch (dia) {
            case 1:
            case 2:
                System.out.println("FDS");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("DU");
                break;
                
            default:System.out.println("Dia Indefinido");
        }

    }
}
