/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.test;

import java.util.List;
import javacore.bancodedadosjdbc.classes.Comprador;
import javacore.bancodedadosjdbc.db.CompradorDBOLD;

/**
 *
 * @author User
 */
public class TesteConexao {

    public static void main(String[] args) {
        //deletar();
        //atualizar();
        // List<Comprador> listaComprador2 = buscarPorNome("mar");
        //CompradorDB.selectMetaData();
        //CompradorDB.checkDriverStatus();
        //CompradorDB.testTypeScroll();
        //CompradorDB.updateNomesToLowerCase();
        //System.out.println(CompradorDBOLD.searchByNamePreparedStatement("nom"));
        //System.out.println(CompradorDBOLD.searchByNameCallableStatement("3nome"));
        //CompradorDB.updatePS(new Comprador(1, "010101cpf", "010101nome"));
        //List<Comprador> listaComprador = lerTudo();
        //System.out.println(listaComprador);
        //System.out.println(CompradorDBOLD.searchByNameRowSet("3nome")); //bugada
        //CompradorDB.updateRowSet(new Comprador(5, "010101cpf", "010101nome"));
        //CompradorDB.updateRowSetCached(new Comprador(5, "010101cpf", "010101nome"));
        CompradorDBOLD.saveTransaction();
    }

    public static void inserir() {
        Comprador comprador = new Comprador("111.111.111-11", "Andre");
        CompradorDBOLD.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(4);
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(2, "222.222", "Maria22");
        CompradorDBOLD.update(comprador);
    }

    public static List<Comprador> lerTudo() {
        return CompradorDBOLD.selectALl();
    }

    private static List<Comprador> buscarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }

}
