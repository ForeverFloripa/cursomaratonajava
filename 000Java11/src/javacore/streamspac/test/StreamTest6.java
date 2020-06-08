/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.streamspac.test;

import static java.util.Comparator.comparing;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.summingDouble;
import javacore.streamspac.classes.Pessoa;

/**
 *
 * @author User
 */
public class StreamTest6 {
    //reducao e sumarizacao de streams em um valor unico
    //Agrupamento de elementos
    //particionamento de elementos

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(counting()));
        
        Optional<Pessoa> max = pessoas.stream().max(comparing(Pessoa::getSalario)); 
        System.out.println(max.get().getSalario());
        
        Optional<Pessoa> collect = pessoas.stream().collect(maxBy(comparing(Pessoa::getSalario)));
        System.out.println(collect.get().getSalario());
        
        Optional<Pessoa> collect1 = pessoas.stream().collect(minBy(comparing(Pessoa::getSalario)));
        System.out.println(collect1.get().getSalario());
        
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        System.out.println(pessoas.stream().collect(summingDouble(Pessoa::getSalario)));
        
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average().getAsDouble());
        System.out.println(pessoas.stream().collect(averagingDouble(Pessoa::getSalario)));
        
        System.out.println("______XXX______");
        DoubleSummaryStatistics collect2 = pessoas.stream().collect(summarizingDouble(Pessoa::getSalario));
        System.out.println(collect2);
        System.out.println(collect2.getAverage());
        System.out.println(collect2.getMax());
        System.out.println(collect2.getMin());
        System.out.println(collect2.getSum());
        
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining()));       
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining(", ")));       

    }
}
