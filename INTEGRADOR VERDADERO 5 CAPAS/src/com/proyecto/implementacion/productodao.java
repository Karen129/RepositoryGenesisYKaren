/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.implementacion;

import com.dominio.dao.Productos;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class productodao  {

     public void insertarproducto(Productos p){
    	String sql ="INSERT INTO productos(descripcion,cantidad,precio,id_consumo)"
                + " VALUES (?, ?,?,?);";
     
        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement st = cn.prepareStatement(sql);
       
            st.setInt(1, p.getId_consumo());
            st.setString(2,p.getDescripcion());
            st.setInt(3, p.getCantidad());
            st.setDouble(4,p.getPrecio());
            
          
            st.execute();
            st.close();
            cn.close();
        }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);   
	 }
    }
     
     public void  modificarproducto(Productos p){
    	String sql = "UPDATE productos  \n" +
        "SET  descripcion=?,cantidad=?,precio=? \n" +
        "id_consumo=?"+
                " WHERE id_producto=?";
    	
    	try {
			Connection cn = Conexion.getConnection();
			PreparedStatement stm = cn.prepareStatement(sql);
    		       
                        stm.setInt(1, p.getId_productos());
    		        stm.setString(2,p.getDescripcion());
                        stm.setInt(3, p.getCantidad());
                        stm.setDouble(4,p.getPrecio());
                        stm.setInt(5, p.getId_consumo());
                        
    		        
			stm.execute();
                        stm.close();
                        cn.close();
                        
		 }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
        } 
    }
     
      public void Eliminarproducto(Productos p){
    	    	String sql = "DELETE FROM productos  WHERE id_producto=? ";
    	    	
    	    	try {
    				Connection cn = Conexion.getConnection();
    				PreparedStatement stm = cn.prepareStatement(sql);
    				stm.setInt(1, p.getId_productos());
    				stm.execute();
    				stm.close();
                               
                        cn.close();
                        
    			 }catch(SQLException  x){
            JOptionPane.showMessageDialog(null, "exception 2 "+x);
        }
      }
}
//    Connection conn=null;
//    PreparedStatement stm=null;
//    
//    @Override
//    public void ingresarProducto(Productos p){
//         Connection cnn=null;
//        try{
//              cnn=ConexionBD.Open();
////              cnn.setAutoCommit(false);
//             PreparedStatement prs= cnn.prepareStatement("INSERT INTO productos(descripcion,cantidad,precio,id_consumo) VALUES ( ?,?,?,?)");
//        
//              prs.setString(1, p.getDescripcion());
//              prs.setInt(2,p.getCantidad());
//              prs.setDouble(3,p.getPrecio());
//              prs.setInt(4, p.getId_consumoa());
//              prs.execute();
//              prs.close();
//              cnn.close();
//              
//              JOptionPane.showMessageDialog(null, "DATOS GUARDADOS EXISTOSAMENTE","Mensaje",JOptionPane.QUESTION_MESSAGE);
//        }catch(SQLException e){
//            e.printStackTrace();
//        }finally{
//            try{
//               cnn.rollback();
//            }catch(SQLException e){
//            }
//        }
//    }
//
//    @Override
//    public void modificarProducto(Productos p) throws SQLException {
//         Connection cnn=null;
//        try{
//              cnn=ConexionBD.Open();
////              cnn.setAutoCommit(false);
//              PreparedStatement prs= cnn.prepareStatement("UPDATE productos(descripcion=?,cantidad=?,precio=?,id_consumo=?)where id_producto=?");
//        
//              prs.setString(1, p.getDescripcion());
//              prs.setInt(2,p.getCantidad());
//              prs.setDouble(3,p.getPrecio());
//              prs.setInt(4, p.getId_consumoa());
//              prs.execute();
//              prs.close();
//              cnn.close();
//              
//              JOptionPane.showMessageDialog(null, "DATOS GUARDADOS EXISTOSAMENTE","Mensaje",JOptionPane.QUESTION_MESSAGE);
//        }catch(SQLException e){
//            e.printStackTrace();
//        }finally{
//            try{
//               cnn.rollback();
//            }catch(SQLException e){
//            }
//        }
//    }
//
//    @Override
//    public void eliminarProducto(Productos p) throws SQLException {
//         try {
//            conn=ConexionBD.Open();
//            stm=conn.prepareStatement("DELETE FROM productos WHERE id_producto=?");
//            stm.setInt(1,p.getId_productos());
//            stm.execute();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//
//    public List<Productos>consultarProducto(){
//       Connection cnn;
//        List<Productos> p =  new ArrayList<Productos>();
//        ResultSet rs=null;
//        try{
//            cnn=ConexionBD.Open();
//            PreparedStatement prs=cnn.prepareStatement("Select * from productos");
//            rs=prs.executeQuery();
//            while(rs.next()){
//                p.add(new Productos(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5)));
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        return p;
//    }
//  
//}
//



