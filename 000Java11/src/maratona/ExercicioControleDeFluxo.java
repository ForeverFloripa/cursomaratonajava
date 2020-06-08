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
public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        /*:
        imposto:
        salario <1000 5%
        salario >=1000 &&  salario <2000 10%
        salario >=2000 &&  salario <4000 15%
        salario >4000 20%
        */
        double salario = 2500;
        double totalImposto=0;
        
        if (salario<1000) {
            totalImposto = salario * 0.05;
        } else if(salario>=1000 && salario <2000){
            totalImposto = salario * 0.10;
        }else if(salario >=2000 && salario<4000){
            totalImposto = salario * 0.15;
        }else{
            totalImposto = salario * 0.20;
        }
        System.out.println(totalImposto);
        
    }
    
}
