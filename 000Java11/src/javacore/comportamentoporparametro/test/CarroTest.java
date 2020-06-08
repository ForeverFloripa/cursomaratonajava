/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.comportamentoporparametro.test;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;
import javacore.lambdas.classes.Carro;
import javacore.comportamentoporparametro.interfaces.CarroPredicate;
import javacore.comportamentoporparametro.predicate.CarrosCorVerdePredicate;
import javacore.comportamentoporparametro.predicate.CarrosDezAnosPredicate;

/**
 *
 * @author User
 */
public class CarroTest {
//  private static List<Carro> filtrarCarroVerde(List<Carro> carros){
//        List<Carro> result = new ArrayList<>();
//        for(Carro carro : carros){
//            if(carro.getCor().equals("verde"))
//            result.add(carro);
//        }
//    return result;
//    }

    
public static List<Carro> fitrarCarros(List<Carro> carros, CarroPredicate carroPredicate){
    List<Carro> result = new ArrayList<>();
    for(Carro carro: carros){
        if(carroPredicate.test(carro))
            result.add(carro);
    }
    return result;
}

//supergenerico:

public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate){
    List<T> result = new ArrayList<>();
    for(T e : list){
        if(predicate.test(e)){
            result.add(e);
        }
    }
    return result;
}

public static void main(String[] args) {
        List<Carro> carros = asList(new Carro("verde", 2016), new Carro("vermelho", 1995), new Carro("preto", 2017));
        List<Integer> numeros = asList(1,2,3,4,5,6,7,8,9,10);
                
                

        System.out.println(fitrarCarros(carros, new CarrosCorVerdePredicate()));
       /* System.out.println(fitrarCarros(carros, new CarrosDezAnosPredicate()));
        System.out.println(fitrarCarros(carros, new CarroPredicate(){
            @Override
            public boolean test(Carro carro) {
            return carro.getCor().equals("verde");
            }
            
        }));
        System.out.println(fitrarCarros(carros, (Carro carro) -> carro.getCor().equals("verde")));
        */
       System.out.println("");
        System.out.println("__________supergenerico________");
        System.out.println("");
        System.out.println(filtrar(carros, new Predicate<Carro>(){
            @Override
            public boolean test(Carro carro) {
            return carro.getCor().equals("verde");
            }
            
        }));
        System.out.println("");
        System.out.println("__________supergenerico________");
        System.out.println("");
        System.out.println(filtrar(carros, new Predicate<Carro>(){
            @Override
            public boolean test(Carro carro) {
            return carro.getAno()>=(Calendar.getInstance().get(Calendar.YEAR)-10);
            }
            
        }));
        
        
        System.out.println("");
        System.out.println("___numeros_____");
        
        
        
        System.out.println(filtrar( numeros, new Predicate<Integer>(){
            
            
            @Override
            public boolean test(Integer integer) {
            return integer %2==0;
            }
            
        }));
        
        System.out.println(filtrar(numeros, (Integer integer) -> integer %2==1));
        
        
    }

}
