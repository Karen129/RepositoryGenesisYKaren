/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.dominio.dao.Cargos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface Icargodao {
    
    void ingresarCargo(Cargos c) throws SQLException;
    void modificarCargo(Cargos c)throws SQLException;
    void eliminarCargo(Cargos c)throws SQLException;
    List<Cargos> consultarcargo();
}
