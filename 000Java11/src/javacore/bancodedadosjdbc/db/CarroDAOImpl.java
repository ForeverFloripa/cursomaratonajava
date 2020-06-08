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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacore.bancodedadosjdbc.classes.Carro;
import javacore.bancodedadosjdbc.classes.Comprador;
import javacore.bancodedadosjdbc.conn.ConexaoFactory;
import javacore.bancodedadosjdbc.interfaces.CarroDAO;


public class CarroDAOImpl implements CarroDAO {

    @Override
    public void save(Carro carro) {
        String sql = "INSERT INTO `agencia`.`carro` (`placa`, `nome`,`comprador_Id`) VALUES (?,?,?);";
        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getNome());
            ps.setInt(3, carro.getComprador().getId());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(Carro carro) {
        if (carro.getId() == null || carro.getId() == null) {
            System.out.println("Nao foi possivel excluir o registro, id nulo");
            return;
        }
        String sql = "DELETE FROM carro WHERE idcarro=?";
        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, carro.getId());
            ps.executeUpdate();
            System.out.println("Registro excluido com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Carro carro) {
        if (carro.getId() == null || carro.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro, id nulo");
            return;
        }
        String sql = "UPDATE `agencia`.`carro` SET `placa` = ?, `nome` = ? WHERE (`idcarro` = ?);";
        System.out.println(sql);
        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getNome());
            ps.setInt(3, carro.getId());
            ps.executeUpdate();
            System.out.println("Registro atualizado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Carro> selectAll() {

        String sql = "SELECT idcarro,placa,nome,comprador_id FROM carro order by idcarro";
        List<Carro> carroList = new ArrayList<>();

        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Comprador c = CompradorDAO.searchById(rs.getInt("comprador_id"));
                carroList.add(new Carro(rs.getInt("idcarro"), rs.getString("nome"), rs.getString("placa"), c));

            }

            ConexaoFactory.close(conn, ps, rs);
            return carroList;

        } catch (SQLException ex) {
            Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Carro> searchByName(String nome) {

        String sql = "SELECT idcarro,placa,nome,comprador_id FROM carro WHERE nome LIKE ?";
        System.out.println(sql);
        List<Carro> carroList = new ArrayList<>();

        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comprador c = CompradorDAO.searchById(rs.getInt("comprador_id"));
                System.out.println(c);
                carroList.add(new Carro(rs.getInt("idcarro"), rs.getString("nome"), rs.getString("placa"), c));

            }

            ConexaoFactory.close(conn, ps, rs);
            return carroList;

        } catch (SQLException ex) {
            Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Comprador searchById(Integer idComprador) {

        String sql = "SELECT idcomprador,cpf,nome FROM comprador WHERE id LIKE ?";
        System.out.println(sql);
        Comprador comprador = null;

        try (Connection conn = ConexaoFactory.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idComprador);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comprador = new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf"));

            }

            ConexaoFactory.close(conn, ps, rs);
            return comprador;

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
