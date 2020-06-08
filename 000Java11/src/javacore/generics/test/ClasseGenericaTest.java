/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;
import javacore.generics.classes.Carro;
import javacore.generics.classes.Computador;

/**
 *
 * @author User
 */
public class ClasseGenericaTest {

    public static void main(String[] args) {
        List<Carro> cdisponiveis = new ArrayList<>();
        cdisponiveis.add(new Carro("GOL"));
        cdisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(cdisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por 1 mes");
        carroAlugavel.devolverObjeto(carro);

        System.out.println("____________++________________");

        List<Computador> compdisponiveis = new ArrayList<>();
        compdisponiveis.add(new Computador("Dell"));
        compdisponiveis.add(new Computador("SONY"));
        ObjetosAlugaveis<Computador> compAlugaveis = new ObjetosAlugaveis<>(compdisponiveis);
        Computador c = compAlugaveis.getObjetoDisponivel();
        System.out.println("Usando o carro por 1 mes");
        compAlugaveis.devolverObjeto(c);

    }
}

class ObjetosAlugaveis<T> {

    private List<T> objetosDisponiveis;

    public ObjetosAlugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T getObjetoDisponivel() {
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto: " + t);
        System.out.println("Objetos Disponiveis: " + objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolvendo Objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos Disponiveis: " + objetosDisponiveis);
    }

}

class DoisAtributos<T, X> {

    T um;
    X dois;

    public DoisAtributos(T um, X dois) {
        this.um = um;
        this.dois = dois;

    }

    public T getUm() {
        return um;
    }

    public void setUm(T um) {
        this.um = um;
    }

    public X getDois() {
        return dois;
    }

    public void setDois(X dois) {
        this.dois = dois;
    }
    
}
