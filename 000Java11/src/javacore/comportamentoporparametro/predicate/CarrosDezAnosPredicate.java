/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.comportamentoporparametro.predicate;

import java.util.Calendar;
import javacore.lambdas.classes.Carro;
import javacore.comportamentoporparametro.interfaces.CarroPredicate;

/**
 *
 * @author User
 */
public class CarrosDezAnosPredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        return carro.getAno()>=(Calendar.getInstance().get(Calendar.YEAR)-10);
        
    }
    
}
