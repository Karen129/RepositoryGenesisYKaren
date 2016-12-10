/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import Conexion.Conexion;
import com.dominio.dao.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario1
 */
public class clientedao  implements Iclientedao{
    Connection conn=null;
    PreparedStatement stm=null;
    int val;

    @Override
    public void ingresarCliente(Clientes cli) throws SQLException {
        try{
              conn=Conexion.open();
              stm= conn.prepareStatement( "INTO INSERT trabajador(cedula, nombres, apellidos, fecha_nac, sexo, direccion, telefono VALUES (?, ?, ?, ?, ?, ?, ?,)");
              stm.setInt(1, cli.getCedula());
              stm.setString(2, cli.getNombre());
              stm.setString(3, cli.getApellido());
              stm.setDate(4, cli.getFecha_nac());
              stm.setString(5, cli.getSexo()); 
              stm.setString(6, cli.getDireccion());
              stm.setString(7, cli.getTelefono());
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
    public void modificarCliente(Clientes cli) throws SQLException {
        try {
            conn= Conexion.open();
            stm=conn.prepareCall("UPDATE clientes SET  cedula=?, nombres=? ,apellidos=?, fecha_nac=?, sexo=?, direccion=?, telefono=? WHERE id_cliente=?");
            stm.setInt(1, cli.getCedula());
            stm.setString(2, cli.getNombre());
            stm.setString(3, cli.getApellido());
            stm.setDate(4, cli.getFecha_nac());
            stm.setString(5, cli.getSexo());
            stm.setString(6, cli.getDireccion());
            stm.setString(7, cli.getTelefono());
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
    public void eliminarCliente(Clientes cli) throws SQLException {
        try {
            conn=Conexion.open();
            stm=conn.prepareStatement("DELETE FROM clientes WHERE id_cliente=?");
            stm.setInt(1,cli.getId_cliente());
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
    public List<Clientes> consultarCliente() {
        List<Clientes> clie =  new ArrayList<Clientes>();
        ResultSet rs=null;
        try{
            conn=Conexion.open();
            stm=conn.prepareStatement("Select * from clientes");
            rs=stm.executeQuery();
            while(rs.next()){
                clie.add(new Clientes(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8)));//rs.getString(1),rs.getInt(2), rs.getDouble(3), rs.getInt(4)));
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
