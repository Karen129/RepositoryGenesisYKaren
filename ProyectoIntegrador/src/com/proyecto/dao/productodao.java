/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import Conexion.Conexion;
import com.dominio.dao.Productos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class productodao implements Iproductodao {
    Connection conn=null;
    PreparedStatement stm=null;
    int val;

    @Override
    public void ingresarProducto(Productos p){
        try{
              conn=Conexion.open();
              stm= conn.prepareStatement("INSERT INTO producto(INSERT INTO productos VALUES (?, ?, ?, ?, ?)");
              stm.setString(1, p.getDescripcion());
              stm.setInt(2, p.getCantidad());
              stm.setDouble(3, p.getPrecio());
              stm.setInt(4, p.getId_consumo1());  
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
    public void modificarProducto(Productos p) throws SQLException {
        try {
            conn= Conexion.open();
            stm=conn.prepareCall("UPDATE productos SET descripcion=?, cantidad=?, precio=? , id_consumo1 WHERE id_producto=? ");
            stm.setString(1, p.getDescripcion());
            stm.setInt(2, p.getCantidad());
            stm.setDouble(3,p.getPrecio());
            stm.setInt(4, p.getId_consumo1()); 
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
    public void eliminarProducto(Productos p) throws SQLException {
        try {
            conn=Conexion.open();
            stm=conn.prepareStatement("DELETE FROM productos WHERE id_producto=?");
            stm.setInt(1,p.getId_productos());
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


    public List<Productos>consultarProducto(){
        List<Productos> lp =  new ArrayList<Productos>();
        ResultSet rs=null;
        try{
            conn=Conexion.open();
            stm=conn.prepareStatement("Select * from productos");
            rs=stm.executeQuery();
            while(rs.next()){
                lp.add(new Productos(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5)));//rs.getString(1),rs.getInt(2), rs.getDouble(3), rs.getInt(4)));
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




