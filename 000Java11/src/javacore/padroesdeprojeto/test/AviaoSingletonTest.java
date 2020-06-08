/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.padroesdeprojeto.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javacore.padroesdeprojeto.classes.Aviao;
import javacore.padroesdeprojeto.classes.AviaoSingleton;

/**
 *
 * @author User
 */
public class AviaoSingletonTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        agendarAssento("1A");
        agendarAssento("1A");
        AviaoSingleton aviaoSingleton = AviaoSingleton.getINSTANCE();
        //AviaoSingleton aviaoSingleton2 = AviaoSingleton.getINSTANCE(); // mesmo hashcode
        AviaoSingleton aviaoSingleton2 = null;
        Constructor[] constructors = AviaoSingleton.class.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            aviaoSingleton2 = (AviaoSingleton) constructor.newInstance();
            break;
        }
        
        
        System.out.println(aviaoSingleton.hashCode());
        System.out.println(aviaoSingleton2.hashCode());
                
        
        
    }

    private static void agendarAssento(String assento) {
        AviaoSingleton a = AviaoSingleton.getINSTANCE();

       System.out.println(a.bookAssento(assento));
       
       
    }

}
