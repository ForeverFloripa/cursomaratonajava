/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.comportamentoporparametro.interfaces;

import javacore.lambdas.classes.Carro;


/**
 *
 * @author User
 */

@FunctionalInterface // apenas 1 metodo
public interface CarroPredicate {
    boolean test(Carro carro);
}
