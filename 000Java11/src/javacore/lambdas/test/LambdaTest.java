/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.lambdas.test;
// anonima

import java.util.function.Predicate;
import javacore.lambdas.classes.Carro;
import javacore.lambdas.interfaces.CarroPredicate;

// function
// passada por ai
// concisa
//(Carro,carro)     ->    carro.getCor().equals("verde");
// parametros   separador             corpo
//(String s) -> s.lenght();
//(int a , int b) -> {sout(a+b)};
//pode usar onde tiver interface funcional
/*
        @FunctionalInterface // apenas 1 metodo
        
        public interface CarroPredicate {
        
        boolean test(Carro carro);
        
        parametros  ->   corpo
        (Carro carro) -> carro.getCor.equals("verde");
        }
 */
/**
 *
 * @author User
 */
public class LambdaTest {

    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };
        //CarroPredicate carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
        Predicate<Carro> carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
        CarroPredicate carroPredicate3 = (Carro carro) -> {
            return carro.getCor().equals("verde");
        };

        System.out.println(carroPredicate2);
        System.out.println(carroPredicate3.test(new Carro("verde", 2011)));
        System.out.println(carroPredicate.test(new Carro("verde", 2011)));

        Runnable runnable = () -> System.out.println("Dentro do run");
        runnable.run();
        new Thread(runnable).start();
        
    }
}
