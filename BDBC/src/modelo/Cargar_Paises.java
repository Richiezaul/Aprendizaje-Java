package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



//// Cargar paises desde BB

public class Cargar_Paises {

	
	
	
	private  Conexion miConexion;
	
	public ResultSet rs;
	
	
	public Cargar_Paises(){
		
		
		
		miConexion = new Conexion();
		
	
	}
	
	
	public String  ejecuta_Consulta() {
		
		
		Productos miProductos = null;
		
		Connection accesoBBDD= miConexion.dameConexion();
		
		
		
		try {
			
			Statement pOrigen= accesoBBDD.createStatement();
			
			rs= pOrigen.executeQuery("SELECT DISTINCTROW PAÍSDEORIGEN FROM PRODUCTOS");
			
			//while (rs.next()) {
				
				miProductos= new Productos();
				
				
				miProductos.setpOrigen(rs.getString(1));
				
				//return miProductos.getpOrigen();
				
				
			//}
			
			rs.close();
			
			accesoBBDD.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return miProductos.getpOrigen();
		
		
	}
	
	
	
	

}













































