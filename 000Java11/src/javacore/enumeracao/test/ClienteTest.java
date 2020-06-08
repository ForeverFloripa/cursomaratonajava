/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.enumeracao.test;

import javacore.enumeracao.classes.Cliente;
import javacore.enumeracao.classes.TipoCliente;

/**
 *
 * @author User
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente cli = new Cliente("ana",TipoCliente.PESSOA_JURIDICA,Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        
        System.out.println(cli);
    }
    
}
