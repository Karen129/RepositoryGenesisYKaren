/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;


import com.protecto.dominio.Clientes;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Usuario1
 */
public interface Iclientedao {
    
    void ingresarCliente(Clientes cli) throws SQLException;
    void modificarCliente(Clientes cli)throws SQLException;
    void eliminarCliente(Clientes cli)throws SQLException;
    List<Clientes>consultarCliente();
    
}
