/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacore.bancodedadosjdbc.classes.Comprador;
import javacore.bancodedadosjdbc.classes.MyRowSetListener;
import javacore.bancodedadosjdbc.conn.ConexaoFactory;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;

/**
 *
 * @author User
 */
public class CompradorDBOLD {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`CPF`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveTransaction() {
        String sql1 = "INSERT INTO `agencia`.`comprador` (`CPF`, `nome`) VALUES ('Teste1', 'TesTE1');";
        String sql2 = "INSERT INTO `agencia`.`comprador` (`CPF`, `nome`) VALUES ('Teste2', 'TesTE2');";
        String sql3 = "INSERT INTO `agencia`.`comprador` (`CPF`, `nome`) VALUES ('Teste3', 'TesTE3');";
        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);
        Connection conn = ConexaoFactory.getConexao();
        Savepoint savepoint=null;
        try {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql1);
            savepoint =conn.setSavepoint("One");
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            
            conn.commit();
            //conn.setAutoCommit(true);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                conn.rollback(savepoint);
            } catch (SQLException ex1) {
                Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex1);
            }
            try {
                conn.commit();
            } catch (SQLException ex1) {
                Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    public static void delete(Comprador comprador) {
        if (comprador.getId() == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel excluir o registro, id nulo");
            return;
        }
        String sql = "DELETE FROM comprador WHERE idcomprador=" + comprador.getId() + ";";
        //String sql = "DELETE FROM `agencia`.`comprador` WHERE ´id´=`" + comprador.getId() + "`";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
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
        String sql = "UPDATE `agencia`.`comprador` SET `idcomprador` = '" + comprador.getId() + "', `CPF` = '" + comprador.getCpf() + "', `nome` = '" + comprador.getNome() + "' WHERE (`idcomprador` = '" + comprador.getId() + "');";
        System.out.println(sql);
//String sql = "DELETE FROM `agencia`.`comprador` WHERE ´id´=`" + comprador.getId() + "`";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Comprador> selectALl() {

        String sql = "SELECT idcomprador,cpf,nome FROM comprador order by idcomprador";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf")));

            }

            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {

        String sql = "SELECT idcomprador,cpf,nome FROM comprador WHERE nome LIKE '%" + nome + "%'";
        System.out.println(sql);
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf")));

            }

            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<Comprador> searchByNameCallableStatement(String nome) {
        String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`(?)";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, nome);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                System.out.println("Dentro do while");
                compradorList.add(new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf")));

            }

            ConexaoFactory.close(conn, cs, rs);
            return compradorList;

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void selectMetaData() {
        String sql = "SELECT * FROM comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdColumns = rsmd.getColumnCount();
            System.out.println("Quantidade colunas: " + qtdColumns);
            for (int i = 1; i <= qtdColumns; i++) {
                System.out.println("Tabela: " + rsmd.getTableName(i) + "\n Coluna: " + rsmd.getColumnName(i) + "\n Tamanho Coluna: " + rsmd.getColumnDisplaySize(i));
            }

            ConexaoFactory.close(conn, stmt, rs);

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e tambem suporta CONCUR_UPDATABLE ");
                }

            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e tambem suporta CONCUR_UPDATABLE ");
                }

            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e tambem suporta CONCUR_UPDATABLE ");
                }

            }
            ConexaoFactory.close(conn);
        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void testTypeScroll() {

        String sql = "SELECT idcomprador,cpf,nome FROM comprador order by idcomprador";
        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.last()) {
                System.out.println("Ultima LInha: " + new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf")));
                System.out.println("Numero da ultima linha: " + rs.getRow());
            }

            System.out.println("retornou para a primeira linha: " + rs.first());
            System.out.println(rs.absolute(4));
            System.out.println("Linha 4: " + new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf")));
            rs.relative(-1);
            System.out.println("Linha: " + new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf")));
            System.out.println(rs.isLast());
            System.out.println(rs.isFirst());
            rs.afterLast();// foi para a ultima e agora vai voltar
            System.out.println("_____________________");
            while (rs.previous()) {
                System.out.println(new Comprador(rs.getInt("idcomprador"), rs.getString("nome"), rs.getString("cpf")));
            }
            ConexaoFactory.close(conn, stmt, rs);

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateNomesToLowerCase() {
        String sql = "SELECT idcomprador,cpf,nome FROM comprador order by idcomprador";
        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toLowerCase());
                rs.updateRow();

            }
            rs.beforeFirst();
            while (rs.next()) {
                System.out.println(rs.getString("nome"));

            }

            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf", "9999");
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println(rs.getString("nome") + "row " + rs.getRow());
            rs.absolute(7);
            rs.deleteRow();

            ConexaoFactory.close(conn, stmt, rs);

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Comprador> searchByNamePreparedStatement(String nome) {

        String sql = "SELECT idcomprador,cpf,nome FROM comprador WHERE nome LIKE ?";
        System.out.println(sql);
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%nome%");
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

    public static List<Comprador> searchByNameRowSet(String nome) {
        String sql = "SELECT idcomprador, nome, cpf FROM agencia.comprador where nome like ?";
        System.out.println(sql);
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        List<Comprador> compradorList = new ArrayList<>();

        try {

            jrs.setCommand(sql);
            jrs.setString(1, "%" + nome + "%");
            jrs.execute();

            jrs.setCommand(sql);
            jrs.setString(1, "%" + nome + "%");
            jrs.execute();
            while (jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("id"), jrs.getString("cpf"), jrs.getString("nome")));
            }

            while (jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("idcomprador"), jrs.getString("nome"), jrs.getString("cpf")));

            }
            ConexaoFactory.close(jrs);
            return compradorList;

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void updatePS(Comprador comprador) {
        if (comprador.getId() == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro, id nulo");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `CPF` = ?, `nome` = ? WHERE (`idcomprador` = ?);";
        System.out.println(sql);
//String sql = "DELETE FROM `agencia`.`comprador` WHERE ´id´=`" + comprador.getId() + "`";
        Connection conn = ConexaoFactory.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            ps.executeUpdate();
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro atualizado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateRowSet(Comprador comprador) {
        if (comprador.getId() == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro, id nulo");
            return;
        }
        //String sql = "UPDATE `agencia`.`comprador` SET `CPF` = ?, `nome` = ? WHERE (`idcomprador` = ?);";
        String sql = "SELECT * FROM comprador WHERE id = ? ";
        System.out.println(sql);
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        try {
            jrs.setCommand(sql);
            jrs.setInt(1, comprador.getId());
            jrs.execute();

            jrs.next();
            jrs.updateString("nome", "WILLIAN");
            jrs.updateRow();

            ConexaoFactory.close(jrs);
            System.out.println("Registro atualizado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateRowSetCached(Comprador comprador) {
        if (comprador.getId() == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro, id nulo");
            return;
        }
        String sql = "SELECT * FROM comprador WHERE id = ? ";
        System.out.println(sql);
        CachedRowSet crs = ConexaoFactory.getRowSetConnectionCached();
        try {
            crs.setCommand(sql);
            crs.setInt(1, comprador.getId());
            crs.execute();

            crs.next();
            crs.updateString("nome", "WILLIANwww");
            crs.updateRow();
            crs.acceptChanges();

            System.out.println("Registro atualizado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(CompradorDBOLD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
