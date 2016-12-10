package Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
 
        static  String url="jdbc:postgresql://localhost:5432/Restaurante";
        static  String user="postgres";
        static  String password="1234";
        
        public static Connection open() throws ClassNotFoundException,SQLException{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            if(conn!=null){
                 System.out.print("CONECTANDO A LA BASE DE DATOS.....");
            }
            return conn;
//             return null;
        }
          
         
  

    //CERRAR LOS COMANDOS Y CONEXION
    
    public static void cerrarPreparedStatement(PreparedStatement stm)throws SQLException{
           if(stm!=null){
              System.out.print("SENTENCIA PREPAREDSTATEMENT CERRADA...");
              stm.close();
           }
    }
    public static void cerrarCallableStatement(CallableStatement cst)throws SQLException{
       if(cst!=null){
         System.out.print("SENTENCIA CallableStatement CERRADA...");
         cst.close();
       }
    }
      public static void cerrarResultSet(ResultSet rs)throws SQLException{
       if(rs!=null){
         System.out.print("SENTENCIA ResultSet CERRADA...");
         rs.close();
       }
    }
     public static void cerrarConexion(Connection conn)throws SQLException{
       if(conn!=null){
        System.out.print("CONEXION CERRADA...");
        conn.close();
       }
    }

}
