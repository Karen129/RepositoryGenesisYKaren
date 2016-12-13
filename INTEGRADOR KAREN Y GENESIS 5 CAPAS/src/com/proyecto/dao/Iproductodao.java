/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.dominio.dao.Productos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public interface Iproductodao {
    
    void ingresarProducto(Productos p) throws SQLException;
    void modificarProducto(Productos p)throws SQLException;
    void eliminarProducto(Productos p)throws SQLException;
    List<Productos>consultarProducto();
}
