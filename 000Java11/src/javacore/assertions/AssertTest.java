/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.assertions;

/**
 *
 * @author User
 */
public class AssertTest {

    public static void main(String[] args) {
        //calculaSalario(-10);
        diasDaSemana(9);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0) : "O salario deve ser maior que 0,veio: " + salario;
        System.out.println("Salario: " + salario);
    }

    public static void diasDaSemana(int dia) {
        switch (dia) {
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default:assert false:"Dia Invalido";
        }
    }
}
