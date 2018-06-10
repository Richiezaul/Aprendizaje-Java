package Metadatos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Info_MetaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostrarInfo_metadatos();
		
		Info_MetaDatos2.mostrarInfo_Tabla();
		

	}
	
	static void mostrarInfo_metadatos() {
		
		Connection miConnection=null;
		
		try {
			miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
			
			// Obtencion de Metadatos
			
			DatabaseMetaData datosBBDD=miConnection.getMetaData();
			
			//mostrar informcion de los metadatos
			
			System.out.println("Gestor de base de datos "+ datosBBDD.getDatabaseProductName() );
			
			System.out.println("version de gestor " + datosBBDD.getDatabaseProductVersion());
			
			System.out.println("Nombre de Driver " + datosBBDD.getDriverName());
			
			System.out.println("Driver Version " + datosBBDD.getDriverVersion());
			
			System.out.println("");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			try {
				
				miConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}










