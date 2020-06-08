/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.lambdas.test;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;
import javacore.lambdas.classes.Carro;
import javacore.lambdas.classes.ComparadorCarro;

/**
 *
 * @author User
 */
public class LambdaTest3 {

    public static void main(String[] args) {
        forEach(asList("willian", "DevDojo", "facebook.com/devdojobr"), System.out::println);

        List<Carro> carros = asList(new Carro("dourado", 2016), new Carro("azul", 1995), new Carro("caramelo", 2017), new Carro("Bege", 1911));
        for (Carro car: carros){
            System.out.println(car);
        }

        //Collections.sort(carros,(o1,o2)-> o1.getCor().compareTo(o2.getCor()));
        //Collections.sort(carros,ComparadorCarro::compareByColor);
        //System.out.println(carros);
        //Collections.sort(carros, (c1, c2) -> ComparadorCarro.compareByColor(c1, c2));
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        //Collections.sort(carros, comparadorCarro::comparePorAno);// deu erro?????
        Collections.sort(carros, (c1, c2) -> comparadorCarro.comparePorAno(c1, c2));
        System.out.println(carros);

        //REFERENCE TO AN ISNTANCE METHODO OF AN ARBITRARY OBJECT OF A PARTICULAR TYPE
        System.out.println("___________________________");
        List<String> nomes = asList("willian", "DevDojo", "Ana", "breno");
        nomes.sort((s1, s2) -> s1.compareTo(s2));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> stringToInteger = (String e) -> Integer.parseInt(e);
        Function<String, Integer> stringToInteger2 = Integer::parseInt;
        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(stringToInteger2.apply("12"));
        System.out.println(contains2.test(nomes, "willians"));
        System.out.println(contains2.test(nomes, "willian"));
        //Reference to constructor
        System.out.println("Reference to constructor");
        
        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
        System.out.println(comparadorCarroSupplier.get());
        
        BiFunction<String,Integer,Carro> carroBiFunction = (s,i)-> new Carro(s,i);
        BiFunction<String,Integer,Carro> carroBiFunction2 = Carro::new;
        System.out.println(carroBiFunction.apply("rosa", 1994));
        System.out.println(carroBiFunction2.apply("bordo", 1917));
        System.out.println("_V Testando aleatoriamente V__");
        Carro a =(carroBiFunction2.apply("magenta", 1956));
        System.out.println(a.getNome());
        List<Carro> listaX = new ArrayList<>();
        listaX.add(new Carro("fuscao", 1978));
        listaX.add(a);
        for (Carro car: listaX){
            System.out.println(car);
        }
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
