/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.implementacion;

import Conexion.ConexionBD;
import com.protecto.dominio.Clientes;
import com.proyecto.dao.Iclientedao;
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
public class clientedao implements Iclientedao{
    Connection conn=null;
    PreparedStatement stm=null;

    @Override
    public void ingresarCliente(Clientes cli) throws SQLException {
              Connection cnn=null;
        try{
              cnn=ConexionBD.Open();
//              cnn.setAutoCommit(false);
             PreparedStatement prs= cnn.prepareStatement("INSERT INTO clientes(cedula,nombre,apellido,fecha_nac,sexo,direccion, telefono) VALUES ( ?,?,?,?,?,?,?)");
        
              prs.setString(1, cli.getCedula());
              prs.setString(2,cli.getNombre());
              prs.setString(3,cli.getApellido());
              prs.setDate(4, cli.getFecha_nac());
              prs.setString(5, cli.getSexo());
              prs.setString(6, cli.getDireccion());
              prs.setString(7, cli.getTelefono());
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
    public void modificarCliente(Clientes cli) throws SQLException {
       Connection cnn=null;
        try{
              cnn=ConexionBD.Open();
//              cnn.setAutoCommit(false);
              PreparedStatement prs= cnn.prepareStatement("UPDATE clientes(cedula=?,nombre=?,apellido=?,fecha_nac=?,sexo=?,direccion=?, telefono=?)where id_cliente=?");
        
              prs.setString(1, cli.getCedula());
              prs.setString(2,cli.getNombre());
              prs.setString(3,cli.getApellido());
              prs.setDate(4, cli.getFecha_nac());
              prs.setString(5, cli.getSexo());
              prs.setString(6, cli.getDireccion());
              prs.setString(7, cli.getTelefono());
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
        }    }

    @Override
    public void eliminarCliente(Clientes cli) throws SQLException {
      try {
            conn=ConexionBD.Open();
            stm=conn.prepareStatement("DELETE FROM clientes WHERE id_cliente=?");
            stm.setInt(1,cli.getId_cliente());
            stm.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }    

    @Override
    public List<Clientes> consultarCliente() {
        Connection cnn;
        List<Clientes> cli =  new ArrayList<Clientes>();
        ResultSet rs=null;
        try{
            cnn=ConexionBD.Open();
            PreparedStatement prs=cnn.prepareStatement("Select * from clientes");
            rs=prs.executeQuery();
            while(rs.next()){
                cli.add(new Clientes(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8)));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return cli;    }

}
