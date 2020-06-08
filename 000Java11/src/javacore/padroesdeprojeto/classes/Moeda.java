/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.padroesdeprojeto.classes;

/**
 *
 * @author User
 */
public interface Moeda {

    String getSimbolo();
}

class Real implements Moeda {

    @Override
    public String getSimbolo() {
        return "R$";
    }

}

class USDolar implements Moeda {

    @Override
    public String getSimbolo() {
        return "USD";
    }

}
