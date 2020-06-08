/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.lambdas.test;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javacore.lambdas.classes.Carro;

/**
 *
 * @author User
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        forEach(asList("willian", "DevDojo", "facebook.com/devdojobr"), (String s) -> System.out.println(s));
        List<Integer> list=map(asList("willian", "DevDojo", "facebook.com/devdojobr"),(String s)-> s.length());
        List<Carro> carros = asList(new Carro("verde", 2016), new Carro("vermelho", 1995), new Carro("preto", 2017));
        List<String> listCores = map(carros, (Carro c) -> c.getCor());
        System.out.println(listCores);
        System.out.println(list);
        Predicate<Integer> pares= (Integer i)-> i%2==0;
        IntPredicate impar= (int i)-> i%2==1;
        System.out.println(pares.test(1000));
        System.out.println(impar.test(1000));
        
        
        final String cor = "vermelho";
        
        
        
        Callable<Integer> c = () ->100;
        PrivilegedAction<Integer> p =()->100;
        
        Predicate<String> pr = (String s) -> listCores.add(s);
        Consumer<String> b = (String s) -> listCores.add(s);
      //  Consumer<String> b = (String s) -> listCores.add(cor );
        
        //Consumer<String> b = s -> listCores.add(s);
        //pr.test("amarelo");
        b.accept("AMARELO");
        
        Supplier<String> sup1=()-> "oi";
        Supplier<Carro> sup2=()-> new Carro("verde", 2016);
        
        System.out.println(listCores);
        System.out.println(sup1.get());
        System.out.println(sup2.get());
        System.out.println(sup2.get().getAno()+" " + sup2.get().getNome());
         
        
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }

    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }

}
