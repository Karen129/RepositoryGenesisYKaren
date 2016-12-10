/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import Conexion.Conexion;
import com.dominio.dao.Factura;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario1
 */
public class facturadao implements Ifacturadao{
    Connection conn = null;
    CallableStatement stm = null;
	int val;

    @Override
    public void insertarFactura(Factura fac) throws SQLException {
        try {
			conn= Conexion.open();
			stm = conn.prepareCall("{call factura(?,?,?,?)}");
			stm.setString(1, fac.getCliente().getNombre());
			stm.setString(2, fac.getTrabajador().getNombre());
			stm.setDouble(3, fac.getValor_cancelado());
			stm.setDate(4, fac.getFecha());
			val = stm.executeUpdate();
			
			if (val != 2)
				JOptionPane.showMessageDialog(null, "Pedido insertado correctamente...");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				Conexion.cerrarPreparedStatement(stm);
				Conexion.cerrarConexion(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

    }

    @Override
    public void modificarFactura(Factura fac) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarFactura(Factura fac) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Factura> consultarFactura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
