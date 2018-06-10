package Pro_AlmacenadoBBDD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedimientos_Almacenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
			
			CallableStatement miSentencia = miConnection.prepareCall("call MUESTRA_R_CLIENTES");
			
			ResultSet rs=miSentencia.executeQuery();
			
			while (rs.next()) {
				
				
				System.out.println(rs.getString(1)+ " " + rs.getString(2) + " " 
				+ rs.getString(3) );
				
				
				
			}
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
