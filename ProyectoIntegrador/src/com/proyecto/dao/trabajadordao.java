/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import Conexion.Conexion;
import com.dominio.dao.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class trabajadordao implements Itrabajadordao{
    
    Connection conn=null;
    PreparedStatement stm=null;
    int val;

    @Override
    public void ingresarTrabajador(Trabajador t) throws SQLException {
        try{
              conn=Conexion.open();
              stm= conn.prepareStatement( "INTO INSERT trabajador(cedula, nombres, apellidos, fecha_nac, sexo, direccion, telefono, contraseña, id_carg VALUES (?, ?, ?, ?, ?, ?,?, ?, ?)");
              stm.setInt(1, t.getCedula());
              stm.setString(2, t.getNombre());
              stm.setString(3, t.getApellido());
              stm.setDate(4, t.getFecha_nac());
              stm.setString(5, t.getSexo()); 
              stm.setString(6, t.getDireccion());
              stm.setString(7, t.getTelefono());
              stm.setString(8, t.getContraseña());
              stm.setInt(9, t.getId_cargo());
              val=stm.executeUpdate();
              
              if (val!=2)
                   JOptionPane.showMessageDialog(null, "DATOS GUARDADOS EXISTOSAMENTE","Mensaje",JOptionPane.QUESTION_MESSAGE);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                Conexion.cerrarPreparedStatement(stm);
                Conexion.cerrarConexion(conn);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void modificarTrabajador(Trabajador t) throws SQLException {
        try {
            conn= Conexion.open();
            stm=conn.prepareCall("UPDATE cargo SET  cedula=?, nombres=? ,apellidos=?, fecha_nac=?, sexo=?, direccion=?, telefono=?, contraseña=?, id_cargo WHERE id_trabajador=?");
            stm.setInt(1, t.getCedula());
            stm.setString(2, t.getNombre());
            stm.setString(3, t.getApellido());
            stm.setDate(4, t.getFecha_nac());
            stm.setString(6, t.getSexo());
            stm.setString(5, t.getDireccion());
            stm.setString(6, t.getTelefono());
            stm.setString(7, t.getContraseña());
            stm.setInt(8, t.getId_cargo());
            stm.execute();
            val=stm.executeUpdate();
        if (val!=2)
                   JOptionPane.showMessageDialog(null, "DATOS MODIFICADOS EXISTOSAMENTE","Mensaje",JOptionPane.QUESTION_MESSAGE);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                Conexion.cerrarPreparedStatement(stm);
                Conexion.cerrarConexion(conn);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void eliminarTrabajador(Trabajador t) throws SQLException {
        try {
            conn=Conexion.open();
            stm=conn.prepareStatement("DELETE FROM trabajador WHERE id_trabajador=?");
            stm.setInt(1,t.getId_trabajador());
            stm.execute();
            val=stm.executeUpdate();
        if (val!=2)
                   JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS EXISTOSAMENTE","Mensaje",JOptionPane.QUESTION_MESSAGE);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                Conexion.cerrarPreparedStatement(stm);
                Conexion.cerrarConexion(conn);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
       
    }

    @Override
    public List<Trabajador> consultarTrabajador() {
        List<Trabajador> tra =  new ArrayList<Trabajador>();
        ResultSet rs=null;
        try{
            conn=Conexion.open();
            stm=conn.prepareStatement("Select * from trabajador");
            rs=stm.executeQuery();
            while(rs.next()){
                tra.add(new Trabajador(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10)));//rs.getString(1),rs.getInt(2), rs.getDouble(3), rs.getInt(4)));
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                Conexion.cerrarPreparedStatement(stm);
                Conexion.cerrarResultSet(rs);
                Conexion.cerrarConexion(conn);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return null;

    }
    
}
