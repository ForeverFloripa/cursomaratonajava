/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bancodedadosjdbc.classes;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

/**
 *
 * @author User
 */
public class MyRowSetListener implements RowSetListener {

    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("Comando execute foi executado");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("Linha atualizada inserida ou deletada");
        if (event.getSource() instanceof RowSet) {
            try {
                ((RowSet) event.getSource()).execute();
            } catch (SQLException ex) {
                Logger.getLogger(MyRowSetListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("Cursor moveu");; //To change body of generated methods, choose Tools | Templates.
    }

}
