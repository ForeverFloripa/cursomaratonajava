/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.polimorfismo.test;

import java.util.ArrayList;
import java.util.List;
import javacore.polimorfismo.classes.ArquivoDAOImp;
import javacore.polimorfismo.classes.DatabaseDAOImp;
import javacore.polimorfismo.classes.GenericDAO;

/**
 *
 * @author User
 */
public class DAOTest {
    public static void main(String[] args) {
        
        GenericDAO arquivoDAO = new DatabaseDAOImp();
        arquivoDAO.save();
        
        GenericDAO arquivoDAO1 = new ArquivoDAOImp();
        arquivoDAO1.save();
        
        List<String> lista = new ArrayList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");
        for( String nomesl : lista){
            System.out.println(nomesl);
        }
    }
    
}
