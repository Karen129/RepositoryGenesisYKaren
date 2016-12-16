/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.implementacion;

import com.dominio.dao.Clientes;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author USUARIO
 */
public class clientedao {
     public void insertarcliente(Clientes cli){
    	String sql ="INSERT INTO clientes( cedula, nombres, apellidos, fecha_nac, sexo, direccion, telefono)VALUES (?, ?, ?, ?, ?, ?, ?);"; 
     
        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement st = cn.prepareStatement(sql);
      
            st.setString(1, cli.getCedula());
            st.setString(2, cli.getNombre());
            st.setString(3, cli.getApellido());
            st.setString(4, cli.getFecha_nac());
            st.setString(5, cli.getSexo());
            st.setString(6, cli.getDireccion());
            st.setString(7,cli.getTelefono());
            
          
            st.execute();
            st.close();
            cn.close();
        }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);   
	 }
    }
     
     public void  modificarcliente(Clientes cli){
    	String sql ="UPDATE clientes\n" +
                   "   SET cedula=?, nombres=?, apellidos=?, fecha_nac=?, \n" +
                   "       sexo=?, direccion=?, telefono=?\n" +
                   " WHERE id_clientes=?;";

    	try {
			Connection cn = Conexion.getConnection();
			PreparedStatement stm = cn.prepareStatement(sql);
    		       
                       
                       stm.setString(1, cli.getCedula());
                       stm.setString(2, cli.getNombre());
                       stm.setString(3, cli.getApellido());
                       stm.setString(4, cli.getFecha_nac());
                       stm.setString(5, cli.getSexo());
                       stm.setString(6, cli.getDireccion());
                       stm.setString(7,cli.getTelefono());
                       stm.setInt(8, cli.getId_cliente());
   
			stm.execute();
                        stm.close();
                        cn.close();
                        
		 }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
        } 
    }
     
      public void Eliminarcliente(Clientes cli){
    	    	String sql = "DELETE FROM clientes WHERE id_clientes=? ";
    	    	
    	    	try {
    				Connection cn = Conexion.getConnection();
    				PreparedStatement stm = cn.prepareStatement(sql);
    				stm.setInt(1, cli.getId_cliente());
    				stm.execute();
    				stm.close();
                               
                        cn.close();
                        
    			 }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
        }
      }

}
