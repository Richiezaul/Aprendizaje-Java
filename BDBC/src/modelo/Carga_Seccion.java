package modelo;

import java.sql.*;




public class Carga_Seccion {
 

		
		Conexion miConexion;
		
		public ResultSet rs;
		
		
		public Carga_Seccion(){
			
			
			
			miConexion = new Conexion();
			
		
		}
		
		
		public String  ejecuta_Consulta() {
			
			
			Productos miProductos = null;
			
			Connection accesoBBDD= miConexion.dameConexion();
			
			
			
			try {
				
				Statement seccion= accesoBBDD.createStatement();
				
				rs= seccion.executeQuery("SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS");
				
				//while (rs.next()) {
					
				//	rs.previous();
					
					miProductos= new Productos();
					
					
					miProductos.setSeccion(rs.getString(1));
					
				//	return miProductos.getSeccion();
					
					
				//}
				
				rs.close();
				
				accesoBBDD.close();
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return miProductos.getSeccion();
			
			
		}
		
		
		
		

}























































































