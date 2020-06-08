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
public class Aula6 {

    public static void main(String[] args) {
        int[][] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int[]{1, 2, 3, 4,};
        dias[2] = new int[3];

        for (int[] arr : dias) {
            for (int num : arr) {
                System.out.println(num);
            }
        }

        // outra forma de inicializar
        int[][] day = {{0, 0}, {1, 1, 1}, {2, 2, 2, 2}};
        for (int[] arr : day) {
            for (int num : arr) {
                System.out.println(num);
            }
        }

    }

}
