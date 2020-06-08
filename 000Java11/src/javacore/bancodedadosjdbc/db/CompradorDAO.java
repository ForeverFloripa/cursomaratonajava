/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacore.bancodedadosjdbc.classes.Comprador;
import javacore.bancodedadosjdbc.conn.ConexaoFactory;

/**
 *
 * @author User
 */
public class CompradorDAO {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`CPF`, `nome`) VALUES (?,?);";
        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador.getId() == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel excluir o registro, id nulo");
            return;
        }
        String sql = "DELETE FROM comprador WHERE idcomprador=?";
        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, comprador.getId());
            ps.executeUpdate();
            System.out.println("Registro excluido com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void update(Comprador comprador) {
        if (comprador.getId() == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro, id nulo");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `CPF` = ?, `nome` = ? WHERE (`idcomprador` = ?);";
        System.out.println(sql);
        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            ps.executeUpdate();
            System.out.println("Registro atualizado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Comprador> selectALl() {

        String sql = "SELECT idcomprador,cpf,nome FROM comprador order by idcomprador";
        List<Comprador> compradorList = new ArrayList<>();

        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("idcomprador"), rs.getString("cpf"), rs.getString("nome")));

            }

            ConexaoFactory.close(conn, ps, rs);
            return compradorList;

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {

        String sql = "SELECT idcomprador,cpf,nome FROM comprador WHERE nome LIKE ?";
        System.out.println(sql);
        List<Comprador> compradorList = new ArrayList<>();

        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf")));

            }

            ConexaoFactory.close(conn, ps, rs);
            return compradorList;

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Comprador searchById(Integer id) {

        String sql = "SELECT idcomprador,nome,cpf FROM comprador WHERE idcomprador=?";
        Comprador comprador=null;
        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                comprador = new Comprador(rs.getInt("idcomprador"), rs.getString("cpf"), rs.getString("nome"));

            }

            ConexaoFactory.close(conn, ps, rs);
            return comprador;

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
