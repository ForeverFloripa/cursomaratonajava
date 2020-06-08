/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author User
 */
public class ConexaoFactory {
// java.sql= Conection, Statement, ResultSet        
// DriverManager  

    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&&serverTimezone=UTC";
        String user = "root";
        String password = "";
        Connection connection;
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public static JdbcRowSet getRowSetConnection() {
//        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&&serverTimezone=UTC";
//      //String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
//        String user = "root";
//        String password = "";
//        try {
//            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
//            jdbcRowSet.setUrl(user);
//            jdbcRowSet.setUsername(user);
//            jdbcRowSet.setPassword(password);
//            return jdbcRowSet;
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }

    
    public static JdbcRowSet getRowSetConnection() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&&serverTimezone=UTC";
        String user = "root";
        String password = "";
        System.out.println("init rs conection");
        try {
            System.out.println("in try ");
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            System.out.println("111");
            jdbcRowSet.setUrl(user);
            System.out.println("222");
            jdbcRowSet.setUsername(user);
            System.out.println("333");
            jdbcRowSet.setPassword(password);
            System.out.println("444");
            return jdbcRowSet;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("grsc end");
        return null;
    }
        public static CachedRowSet getRowSetConnectionCached() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&&serverTimezone=UTC&&relaxAutoCommit=true";
        String user = "root";
        String password = "";
        System.out.println("init rs conection");
        try {
            System.out.println("in try ");
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            System.out.println("111");
            cachedRowSet.setUrl(user);
            System.out.println("222");
            cachedRowSet.setUsername(user);
            System.out.println("333");
            cachedRowSet.setPassword(password);
            System.out.println("444");
            return cachedRowSet;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("grsc end");
        return null;
    }

    public static void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void close(RowSet jrs) {
        try {
            if (jrs != null) {
                jrs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void close(Connection connection, Statement stmt) {
        close(connection);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void close(Connection connection, Statement stmt, ResultSet rs) {
        close(connection, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
}
