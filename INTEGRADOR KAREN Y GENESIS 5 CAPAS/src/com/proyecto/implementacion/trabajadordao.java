/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.implementacion;

import Conexion.ConexionBD;
import com.dominio.dao.Trabajador;
import com.proyecto.dao.Itrabajadordao;
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
public class trabajadordao implements Itrabajadordao {

    Connection conn=null;
    PreparedStatement stm=null;

    @Override
    public void ingresarTrabajador(Trabajador t) throws SQLException {
             Connection cnn=null;
        try{
              cnn=ConexionBD.Open();
//              cnn.setAutoCommit(false);
             PreparedStatement prs= cnn.prepareStatement("INSERT INTO trabajador(cedula,nombre,apellido,fecha_nac,sexo,direccion, telefono, contraseña, id_cargo) VALUES ( ?,?,?,?,?,?,?,?,?)");
        
              prs.setString(1, t.getCedula());
              prs.setString(2,t.getNombres());
              prs.setString(3,t.getApellidos());
              prs.setDate(4, t.getFecha_nac());
              prs.setString(5, t.getSexo());
              prs.setString(6, t.getDireccion());
              prs.setString(7, t.getTelefono());
              prs.setString(8, t.getContraseña());
              prs.setInt(9,t.getId_cargo());
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
    public void modificarTrabajador(Trabajador t) throws SQLException {
           Connection cnn=null;
        try{
              cnn=ConexionBD.Open();
//              cnn.setAutoCommit(false);
              PreparedStatement prs= cnn.prepareStatement("UPDATE trabajador(cedula=?,nombre=?,apellido=?,fecha_nac=?,sexo=?,direccion=?, telefono=?, contraseña=?, id_cargo=?)where id_trabajador=?");
        
              prs.setString(1, t.getCedula());
              prs.setString(2,t.getNombres());
              prs.setString(3,t.getApellidos());
              prs.setDate(4, t.getFecha_nac());
              prs.setString(5, t.getSexo());
              prs.setString(6, t.getDireccion());
              prs.setString(7, t.getTelefono());
              prs.setString(8, t.getContraseña());
              prs.setInt(9,t.getId_cargo());
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
    public void eliminarTrabajador(Trabajador t) throws SQLException {
        try {
            conn=ConexionBD.Open();
            stm=conn.prepareStatement("DELETE FROM trabajador WHERE id_trabajador=?");
            stm.setInt(1,t.getId_trabajador());
            stm.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Trabajador> consultarTrabajador() {
        Connection cnn;
        List<Trabajador> t =  new ArrayList<Trabajador>();
        ResultSet rs=null;
        try{
            cnn=ConexionBD.Open();
            PreparedStatement prs=cnn.prepareStatement("Select * from trabajador");
            rs=prs.executeQuery();
            while(rs.next()){
                t.add(new Trabajador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10)));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return t;
    }
}

