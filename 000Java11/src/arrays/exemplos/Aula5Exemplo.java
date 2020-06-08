/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.exemplos;

/**
 *
 * @author User
 */
public class Aula5Exemplo {
    public static void main(String[] args) {
        int[][]meses = new int[12][2];
        meses[0][0]=1;
        meses[0][1]=31;
        meses[1][0]=2;
        meses[1][1]=28;
        
        meses[2][0]=3;
        meses[2][1]=31;
        meses[3][0]=4;
        meses[3][1]=30;
        meses[4][0]=5;
        meses[4][1]=31;
        meses[5][0]=6;
        meses[5][1]=30;
        meses[6][0]=7;
        meses[6][1]=31;
        meses[7][1]=8;
        meses[7][1]=31;
        meses[8][0]=9;
        meses[8][1]=30;
        meses[9][0]=10;
        meses[9][1]=31;
        meses[10][0]=11;
        meses[10][1]=30;
        meses[11][0]=12;
        meses[11][1]=31;
        
        for(int[] ref: meses){
            for(int aux : ref ){
                System.out.print(aux +" ");
            }
            System.out.println("");
            
        }
        
        
        
    }
    
    
}
