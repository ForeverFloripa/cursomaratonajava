/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.streamspac.test;

import java.util.Comparator;
import java.util.List;
import javacore.streamspac.classes.Pessoa;

/**
 *
 * @author User
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();

//        System.out.println("pessoa com salario acima de 3000?: " + pessoas.stream().anyMatch(p -> p.getSalario() > 3000));
//
//        System.out.println("pessoa com salario acima de 3000?: " + pessoas.stream().anyMatch(p -> p.getSalario() > 30000));
//
//        System.out.println("Todas as pessoas >=18?: " + pessoas.stream().allMatch(pessoa -> pessoa.getIdade() >= 18));
//
//        System.out.println("Nenhum é >=18?: " + pessoas.stream().noneMatch(pessoa -> pessoa.getIdade() >= 18));

/*
        pessoas.stream()
                .filter(p -> p.getIdade() < 25)
                .findAny()
                .ifPresent(p -> System.out.println(p.getNome()));
*/
        pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .filter(pessoa -> pessoa.getIdade() > 30)
                .findFirst()
                .ifPresent(p -> System.out.println(p.getNome()));

    }

}


//ta ando erro na escolha da pessoa
