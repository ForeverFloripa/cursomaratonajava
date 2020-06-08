/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.generics.test;

/**
 *
 * @author User
 */
public class MetodoGenericoTestPraticando {

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7};
        Double[] doubleArray = {12.1, 10.2, 14.4};
        Character[] charArray = {'a', 'b', 'c', '3'};

        System.out.println("integerArray contem: ");
        printArray(integerArray);
        System.out.println("DoubleArray contem: ");
        printArray(doubleArray);
        System.out.println("CharArray contem: ");
        printArray(charArray);

    }

    public static <T> void printArray(T[] t) {
        for (T elemento : t) {
            System.out.printf("%s ", elemento);
        }
        System.out.println("\n");
    }

}
