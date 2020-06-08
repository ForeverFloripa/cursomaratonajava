/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.streamspac.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javacore.streamspac.classes.Pessoa;

/**
 *
 * @author User
 */
public class StreamTest {

    public static void main(String[] args) {
        //Pegar os 3 primeiros nomes das pessoas com menos de 25 anos ordenados pelo nome
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        Collections.sort(pessoas, (Pessoa o1, Pessoa o2) -> o1.getNome().compareTo(o2.getNome()));

        List<String> nomes = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 25) {
                nomes.add(pessoa.getNome());
                if (nomes.size() >= 3) {
                    break;
                }
            }
        }
        System.out.println(nomes);
        
        List<String> nomes2 = pessoas
                .stream()
                .filter( p-> p.getIdade()<25)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .limit(3)
                .skip(1)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());
        System.out.println(nomes2);
        System.out.println(pessoas
                .stream()
                .distinct()
                .filter( p-> p.getIdade()<25)
                .map(Pessoa::getNome)
                .count());
                
        pessoas.stream().forEach(System.out::println);
        
        
        
        
    }
}

