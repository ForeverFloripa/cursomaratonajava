/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.interfaces;

import java.util.List;
import javacore.bancodedadosjdbc.classes.Carro;
import javacore.bancodedadosjdbc.classes.Comprador;

/**
 *
 * @author User
 */
public interface CarroDAO {
    
    void save(Carro carro);
    
    void delete(Carro carro);
    
    void update(Carro carro);
    
    List<Carro> selectAll();
    
    List<Carro> searchByName(String nome);
    
    Comprador searchById(Integer idComprador);
    
}
