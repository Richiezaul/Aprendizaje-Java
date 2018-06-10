import java.sql.*;

public class Consultas_Preparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			
			//1. create coneccion
			Connection miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
			
			//2.Prepare Statement
			
			PreparedStatement miSentencia= miConnection.prepareStatement("SELECT NOMBREART�CULO, SECCI�N, PA�SDEORIGEN FROM PRODUCTOS WHERE SECCI�N=? AND PA�SDEORIGEN=?");
			
			//3.estableser paramentros de consultas
			
			miSentencia.setString(1, "deportes");
			
			miSentencia.setString(2, "USA");
			
			//4.Ejectar
			
			ResultSet miResultSet= miSentencia.executeQuery();
			
			while (miResultSet.next()) {
				
				 
				System.out.println(miResultSet.getString(1) +" " + miResultSet.getString(2) +" " + miResultSet.getString(3) );
				
			}
			
			miResultSet.close();
			
			//4. reutilizacion consulta
			
//			System.out.println("Segunda Consulta");
//			
//			miSentencia.setString(1, "JAP�N");
//			
//			miSentencia.setString(2, "JUGUETER�A");
//			
//			//4.Ejectar
//			
//			ResultSet miResultSet2= miSentencia.executeQuery();
//			
//			while (miResultSet2.next()) {
//				
//				 
//				System.out.println(miResultSet.getString("SECCI�N"));				
//			}
//			
//			miResultSet2.close();
//			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}








