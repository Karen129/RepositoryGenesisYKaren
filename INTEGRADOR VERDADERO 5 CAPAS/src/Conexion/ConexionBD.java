package Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
        private static Connection cnn;
	public static String url = "jdbc:postgresql://localhost:5432/Restaurant";
        public static String user = "postgres";
        public static String password = "diosito";
		    
        public static Connection Open() throws SQLException {
        	try {
		    Class.forName("org.postgresql.Driver");
			if (cnn == null){
		        	cnn = DriverManager.getConnection(url, user, password);
			}
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return cnn;
		}
          
}         
  
//
//    //CERRAR LOS COMANDOS Y CONEXION
//    
//    public static void cerrarPreparedStatement(PreparedStatement stm)throws SQLException{
//           if(stm!=null){
//              System.out.print("SENTENCIA PREPAREDSTATEMENT CERRADA...");
//              stm.close();
//           }
//    }
//    public static void cerrarCallableStatement(CallableStatement cst)throws SQLException{
//       if(cst!=null){
//         System.out.print("SENTENCIA CallableStatement CERRADA...");
//         cst.close();
//       }
//    }
//      public static void cerrarResultSet(ResultSet rs)throws SQLException{
//       if(rs!=null){
//         System.out.print("SENTENCIA ResultSet CERRADA...");
//         rs.close();
//       }
//    }
//     public static void cerrarConexion(Connection conn)throws SQLException{
//       if(conn!=null){
//        System.out.print("CONEXION CERRADA...");
//        conn.close();
//       }
//    }
//
//}
