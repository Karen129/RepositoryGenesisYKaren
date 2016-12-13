/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.implementacion;

import Conexion.ConexionBD;
import com.dominio.dao.Cargos;
import com.proyecto.dao.Icargodao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class cargodao implements Icargodao{
    Connection conn=null;
    PreparedStatement stm=null;

    @Override
    public void ingresarCargo(Cargos c){
        Connection cnn=null;
        try{
              cnn=ConexionBD.Open();
//              cnn.setAutoCommit(false);
              PreparedStatement prs= cnn.prepareStatement("INSERT INTO cargo(cargo, sueldo) VALUES ( ?, ?)");
        
              prs.setString(1, c.getCargo());
              prs.setDouble(2, c.getSueldo());
              prs.execute();
              prs.close();
              cnn.close();
              
              JOptionPane.showMessageDialog(null, "DATOS GUARDADOS EXISTOSAMENTE","Mensaje",JOptionPane.QUESTION_MESSAGE);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
               cnn.rollback();
            }catch(SQLException e){
            }
        }
    }

    @Override
    public void modificarCargo(Cargos c) throws SQLException {
       Connection cnn=null;
        try{
              cnn=ConexionBD.Open();
//              cnn.setAutoCommit(false);
              PreparedStatement prs= cnn.prepareStatement("UPDATE cargo( cargo=?, sueldo=?) where id_cargo=?");
              prs.setString(1, c.getCargo());
              prs.setDouble(2, c.getSueldo());
              prs.execute();
              prs.close();
              cnn.close();
              
              JOptionPane.showMessageDialog(null, "DATOS MODIFICADOS EXISTOSAMENTE","Mensaje",JOptionPane.QUESTION_MESSAGE);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
               cnn.rollback();
            }catch(SQLException e){
            }
        }
    }

    @Override
    public void eliminarCargo(Cargos c) throws SQLException {
        try {
            conn=ConexionBD.Open();
            stm=conn.prepareStatement("DELETE FROM cargo WHERE id_cargo=?");
            stm.setInt(1,c.getId_cargo());
            stm.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

     
   @Override
    public List<Cargos> consultarcargo() {
        Connection cnn;
        List<Cargos> c =  new ArrayList<Cargos>();
        ResultSet rs=null;
        try{
            cnn=ConexionBD.Open();
            PreparedStatement prs=cnn.prepareStatement("Select * from cargo");
            rs=prs.executeQuery();
            while(rs.next()){
                c.add(new Cargos(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return c;
    }
}



