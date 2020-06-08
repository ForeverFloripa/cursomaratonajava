/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;
import javacore.generics.classes.Carro;

/**
 *
 * @author User
 */
public class ClasseNAOGenericaTest {

    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por 1 mes");
        carroAlugavel.devolverCarro(carroAlugado);
    }

}

class CarroAlugavel {

    private List<Carro> carrosDisponiveis = new ArrayList<>();

    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }

    public Carro getCarroDisponivel() {
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando Carro: " + c);
        System.out.println("Carros Disponiveis: " + carrosDisponiveis);
        return c;
    }

    public void devolverCarro(Carro c) {
        System.out.println("Devolvendo Carro " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros Disponiveis: " + carrosDisponiveis);
    }

}
