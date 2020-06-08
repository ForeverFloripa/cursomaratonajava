/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.comportamentoporparametro.predicate;

import javacore.lambdas.classes.Carro;
import javacore.comportamentoporparametro.interfaces.CarroPredicate;

/**
 *
 * @author User
 */
public class CarrosCorVerdePredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        System.out.println(carro.getAno()+" é verde: "+ carro.getCor().equals("verde") );
        System.out.println(carro.getNome());
        return carro.getCor().equals("verde");
    }

}
