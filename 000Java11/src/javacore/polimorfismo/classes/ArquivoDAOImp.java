/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.polimorfismo.classes;

/**
 *
 * @author User
 */
public class ArquivoDAOImp implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no arquivo");
    }

    
}
