/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaoametodos.classes;

/**
 *
 * @author User
 */
public class Calculadora {

    public void somaDoisNumeros(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraiDoisNumeros(int a, int b) {
        System.out.println(a - b);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;

    }
    
    public void imprimeDoisNumerosDivididos(double num1, double num2){
        //System.out.println(num1/num2);
        if(num2!=0){
            System.out.println(num1/num2);
            return;
        }
            System.out.println("divisao por zero... Erro");
        
    }
    
    public void alteraDoisNumeros(int num1, int num2){
        num1=30;
        num2=40;
        System.out.println("Dentro do altera");
        System.out.println(num1);
        System.out.println(num2);
}
    public void somaArray(int[] numeros){
        int soma =0;
        
        for(int num: numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
    
    public void somaVarArgs(double valorDouble, int... numeros){
        double soma =valorDouble;
        System.out.println("SomaVarArgs");
        System.out.println(valorDouble);
        
        for(int num: numeros){
            soma+=num;
        }
        System.out.println(soma);
        
    }

}
