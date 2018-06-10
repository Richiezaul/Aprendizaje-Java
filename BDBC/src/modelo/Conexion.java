package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	Connection miConnection=null;
	
	
	public Conexion() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Connection dameConexion() {
		
		
		try {
			
			//1.crear Connection
			
			 miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
			
		
	} catch (Exception e) {
		// TODO: handle exception
		
		System.out.println(e.getMessage());
		
	}
		
		return miConnection;
		
	}

}
