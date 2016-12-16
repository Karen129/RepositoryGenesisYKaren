/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.implementacion;

import com.dominio.dao.Cargos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class cargodao {
    
    public void insertar(Cargos cargos){
    	String sql ="INSERT INTO cargo(cargo,sueldo)"
                + " VALUES (?, ?);";
     
        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement st = cn.prepareStatement(sql);
       
            st.setString(1,cargos.getCargo());
            st.setDouble(2, cargos.getSueldo());
          
            st.execute();
            st.close();
            cn.close();
        }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
   
        
	 }
}

  public void  modificar(Cargos cargos){
    	String sql = "UPDATE cargo \n" +
  "SET  cargo=?, \n" +
   "sueldo=?"+
                " WHERE id_cargo=?";
    	
    	try {
			Connection cn = Conexion.getConnection();
			PreparedStatement stm = cn.prepareStatement(sql);
    		       
    		        stm.setString(1, cargos.getCargo());
    		        stm.setDouble(2, cargos.getSueldo());
                        stm.setInt(3, cargos.getId_cargo());
    		        
			stm.execute();
                        stm.close();
                        cn.close();
                        
		 }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
        } 
    	}
 public void  Delete(Cargos cargos){
    	    	String sql = "DELETE FROM cargo  WHERE id_cargo=? ";
    	    	
    	    	try {
    				Connection cn = Conexion.getConnection();
    				PreparedStatement stm = cn.prepareStatement(sql);
    				stm.setInt(1, cargos.getId_cargo());
    				stm.execute();
    				stm.close();
                               
                        cn.close();
                        
    			 }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
        }
      }  
}



