/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.streamspac.test;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class StreamTest2 {

    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("devDojo", "Valeu por aumentar a letra"));
        nomes.add(asList("Willian", "Porque demorou 180 aulas para isso"));

        List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
        collect.forEach(System.out::println);
        // System.out.println(nomes);

        List<String> palavras = asList("ola", "Goku");
        String[] split = palavras.get(0).split("");
        System.out.println(Arrays.toString(split));

        List<String[]> collect1 = palavras.stream().map(p -> p.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream((String[]) palavras.toArray());
        
        List<String> collect2 = palavras.stream()//Stream<Sring>
                .map(p->p.split(""))//Stream<String[]>
                .flatMap(Arrays::stream)//Stream<String>
                .collect(Collectors.toList());
        System.out.println(collect2);

    }
}
//map se ja vai pegar o que vc quer 
//flatMap usa se ainda tem que extrair alguma coisa

