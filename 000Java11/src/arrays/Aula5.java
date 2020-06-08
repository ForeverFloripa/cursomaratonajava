/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author User
 */
public class Aula5 {

    public static void main(String[] args) {
        /*int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                System.out.println(dias[i]);
                System.out.println(dias[i][j]);
            }
        }
*/
        int[][] mes = new int[3][2];
        mes[0][0]=1;
        mes[0][1]=31;
        mes[1][0]=2;
        mes[1][1]=28;
        mes[2][0]=3;
        mes[2][1]=31;
        /*
        for (int i = 0; i < mes.length; i++) {
            for (int j = 0; j < mes[i].length; j++) {
                System.out.println(mes[i][j]+ "--");
            }
            
        }
        */
        for(int[] ref : mes){
            for(int meses :ref){
                System.out.println(meses);
            }
        }
        
    }
}
