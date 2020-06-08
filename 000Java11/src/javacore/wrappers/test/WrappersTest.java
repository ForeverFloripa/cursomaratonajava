/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.wrappers.test;

/**
 *
 * @author User
 */
public class WrappersTest {

    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1; //1 a 127 depois disso e considerado int
        Short shortWrapper = 1;
        Integer integerWrapper = 1;
        Long longWrapper = 10L; // Long.valueOf(long l)
        Float floatWrapper = 10F;
        Double doublewrapper = 10D;
        Character charWrapper = 'A';// nao aceita string
        Boolean booleanWrapper = true;

        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);

        int i = integerWrapper;// unboxing automaticamente 

        Integer integerWrapper2 = new Integer("10");//aceita String e pega o valor int dela
        System.out.println(integerWrapper2);

        Boolean booleanWrapper2 = new Boolean("tRuE");//nao e case sensitive
        Boolean booleanWrapper3 = Boolean.valueOf("tRuE");//nao e case sensitive
        System.out.println(booleanWrapper2);

        Long longWrapper2 = Long.valueOf("10");
        System.out.println(longWrapper2);
        
        
        System.out.println(Character.isDigit('d'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isUpperCase('1'));
        System.out.println(Character.isLowerCase('1'));
        System.out.println(Character.toUpperCase('a'));
        

    }

}
