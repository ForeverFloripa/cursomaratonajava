/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.streamspac.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;
import javacore.streamspac.classes.Genero;
import javacore.streamspac.classes.Maioridade;
import javacore.streamspac.classes.Pessoa;

/**
 *
 * @author User
 */
public class StreamTest6Collectors2 {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();

        Map<Genero, List<Pessoa>> generoListMap = new HashMap<>();
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getGenero().equals(Genero.FEMININO)) {
                femininos.add(pessoa);
            } else {
                masculinos.add(pessoa);
            }
        }

        generoListMap.put(Genero.FEMININO, femininos);
        generoListMap.put(Genero.MASCULINO, masculinos);
        System.out.println(generoListMap);

        //AGRUPAMENTO POR GENERO
        Map<Genero, List<Pessoa>> collect = pessoas.stream().collect(groupingBy(Pessoa::getGenero));
        System.out.println(collect);

        //AGRUPAMENTO POR MAIORIDADE
        Map<Maioridade, List<Pessoa>> collect1 = pessoas
                .stream()
                .collect(groupingBy(p -> {
                    if (p.getIdade() >= 18) {
                        return Maioridade.ADULTO;
                    } else {
                        return Maioridade.MENOR;
                    }
                }));
        System.out.println(collect1);

        //Agrupamento por genero e maioridade
        Map<Genero, Map<Maioridade, List<Pessoa>>> collect2 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, groupingBy(p -> {
            if (p.getIdade() >= 18) {
                return Maioridade.ADULTO;
            } else {
                return Maioridade.MENOR;
            }
        })));
        System.out.println(collect2);

        //agrupando por genero e quantidade
        Map<Genero, Long> collect3 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.counting()));
        System.out.println(collect3);

        //agrupar por genero e maior salario
        Map<Genero, Optional<Pessoa>> collect4 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, Collectors.maxBy(Comparator.comparing(Pessoa::getSalario))));
        //agrupar por genero e maior salario sem optional
        Map<Genero, Pessoa> collect5 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero,
                        collectingAndThen(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)), Optional::get)));

        System.out.println(collect4);
        System.out.println(collect5);
        // agrupando por genero e estatisticas
        Map<Genero, DoubleSummaryStatistics> collect6 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, summarizingDouble(Pessoa::getSalario)));

        System.out.println(collect6);

        //agrupando por genero e maioridade
        Map<Genero, Set<Maioridade>> collect7 = pessoas.stream().collect(groupingBy(Pessoa::getGenero,
                mapping(p -> {
                    if (p.getIdade() >= 18) {
                        return Maioridade.ADULTO;
                    } else {
                        return Maioridade.MENOR;
                    }
                }, toSet())));

        System.out.println(collect7);
        
        Map<Genero, Set<Maioridade>> collect8 = pessoas.stream().collect(groupingBy(Pessoa::getGenero,
                mapping(p -> {
                    if (p.getIdade() >= 18) {
                        return Maioridade.ADULTO;
                    } else {
                        return Maioridade.MENOR;
                    }
                }, toCollection(LinkedHashSet::new))));

        System.out.println(collect8);
        
    }

}
