package Metadatos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Info_MetaDatos2 {
	
	
	public static void mostrarInfo_Tabla() {
		
		Connection miConnection=null;
		
		ResultSet miResultSet= null;
		
		try {
			miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
			
			// Obtencion de Metadatos
			
			DatabaseMetaData datosBBDD=miConnection.getMetaData();
			
			// lista de tablas
			
			System.out.println("Lista de Tablas");
			
			System.out.println("");
			
			miResultSet=datosBBDD.getTables(null, null, "c%", null);
			
			while (miResultSet.next()) {
				
				System.out.println(miResultSet.getString("TABLE_NAME"));
				
			
				
				
				
			}
			System.out.println("");
			
		/////////////////////lista de columna de productos/////////////////////////////////
			
		miResultSet=datosBBDD.getColumns(null, null, "Productos", null);
			
			while (miResultSet.next()) {
				
				System.out.println(miResultSet.getString("COLUMN_NAME"));
				
				//lista de columna de productos
				
				
				
			}
			
			
			
			
			
			
		}catch (Exception e) {
			
			// TODO: handle exception
		} finally {
			
			try {
				miConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}


















