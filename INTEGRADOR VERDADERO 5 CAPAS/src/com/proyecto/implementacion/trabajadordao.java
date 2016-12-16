/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.implementacion;

import com.dominio.dao.Trabajador;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class trabajadordao  {

    public void insertartrabajador(Trabajador trab){
    	String sql ="INSERT INTO trabajador(\n" +
               "             cedula, nombres, apellidos, fecha_nac, sexo, direccion, \n" +
               "            telefono, \"contraseña\")\n" +
               "    VALUES (?, ?, ?, ?, ?, ?, ?, \n" +
               "            ?, ?, ?);";
            
     
        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement st = cn.prepareStatement(sql);
      
            st.setString(1, trab.getCedula());
            st.setString(2, trab.getNombres());
            st.setString(3, trab.getApellidos());
            st.setString(4, trab.getFecha_nac());
            st.setString(5, trab.getSexo());
            st.setString(6, trab.getDireccion());
            st.setString(7,trab.getTelefono());
            st.setString(8,trab.getContraseña());
//            st.setInt(9,trab.getId_trabajador());
            
            
          
            st.execute();
            st.close();
            cn.close();
        }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);   
	 }
    }
     
     public void  modificartrabajador(Trabajador trab){
    	String sql ="UPDATE trabajador\n" +
        "   SET cedula=?, nombres=?, apellidos=?, fecha_nac=?, \n" +
        "       sexo=?, direccion=?, telefono=?, contraseña=?, id_carg=?\n" +
        " WHERE id_trabajador=?;";


    	try {
			Connection cn = Conexion.getConnection();
			PreparedStatement st = cn.prepareStatement(sql);
    		       
                        st.setString(1, trab.getCedula());
                        st.setString(2, trab.getNombres());
                        st.setString(3, trab.getApellidos());
                        st.setString(4, trab.getFecha_nac());
                        st.setString(5, trab.getSexo());
                        st.setString(6, trab.getDireccion());
                        st.setString(7,trab.getTelefono());
                        st.setString(8,trab.getContraseña());
                        st.setInt(9,trab.getId_trabajador());
   
			st.execute();
                        st.close();
                        cn.close();
                        
		 }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
        } 
    }
     
      public void Eliminartrabajador(Trabajador trab){
    	    	String sql = "DELETE FROM trabajador WHERE id_trabajador=? ";
    	    	
    	    	try {
    				Connection cn = Conexion.getConnection();
    				PreparedStatement stm = cn.prepareStatement(sql);
    				stm.setInt(1, trab.getId_trabajador());
    				stm.execute();
    				stm.close();
                               
                        cn.close();
                        
    			 }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
        }
      }
    }

