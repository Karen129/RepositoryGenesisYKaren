/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.dominio.dao.Factura;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Usuario1
 */
public interface Ifacturadao {
    
    	void insertarFactura(Factura fac)throws SQLException;
	void modificarFactura(Factura fac)throws SQLException;
	void eliminarFactura(Factura fac)throws SQLException;
	List<Factura> consultarFactura();
}
