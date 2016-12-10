/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import Conexion.Conexion;
import com.dominio.dao.Cargos;
import com.dominio.dao.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class cargodao implements Icargodao {
    Connection conn = null;
    PreparedStatement stm =  null;
    int val;
    @Override
    public void ingresarCargo(Cargos c) throws SQLException{
       try{
              conn=Conexion.open();
              stm= conn.prepareStatement("INSERT INTO cargo( cargo, sueldo) VALUES (?, ?)");
              stm.setString(1, c.getCargo());
              stm.setDouble(2, c.getSueldo());
              stm.execute();
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
    public void modificarCargo(Cargos c) throws SQLException{
       try {
            conn= Conexion.open();
            stm=conn.prepareCall("UPDATE cargo SET  cargo=?, sueldo=? WHERE id_cargo=?");
            stm.setString(1, c.getCargo());
            stm.setDouble(2, c.getSueldo());
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
    public void eliminarCargo(Cargos c) throws SQLException{
        try {
            conn=Conexion.open();
            stm=conn.prepareStatement("DELETE FROM cargo WHERE id_cargo=?");
            stm.setInt(1,c.getId_cargo());
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

     
    public List<Cargos>consultarcargo(){
         List<Cargos> c =  new ArrayList<Cargos>();
        ResultSet rs=null;
        try{
            conn=Conexion.open();
            stm=conn.prepareStatement("Select * from cargo");
            rs=stm.executeQuery();
            while(rs.next()){
                c.add(new Cargos(rs.getInt(1),rs.getString(2),rs.getDouble(3)));//rs.getString(1),rs.getInt(2), rs.getDouble(3), rs.getInt(4)));
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
        return c;
    }
}



