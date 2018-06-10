package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ejeuta_Consulta {
	
	
	public Ejeuta_Consulta() {
		// TODO Auto-generated constructor stub
		
		miConexion= new Conexion();
	}
	
	
	
	public ResultSet filtrarBBDD(String secction, String pais) {
		
		rs=null;
		

		
		Connection conecta= miConexion.dameConexion();
		
		try {
		
		if (!secction.equals("Todos") && pais.equals("Todos")) {
			
			envia=conecta.prepareStatement(consultaSeccion);
			
			envia.setString(1, secction);
			
			rs= envia.executeQuery();
			
			
		}
		
		else if (secction.equals("Todos") && !pais.equals("Todos")) {
			
			envia= conecta.prepareStatement(consultaPaise);
			
			envia.setString(1, pais);
			
			rs=envia.executeQuery();
			
			
		}
		
		
		else if (!secction.equals("Todos") && !pais.equals("Todos")) {
			
			
			envia=conecta.prepareStatement(consultaAmbos);
			
			envia.setString(1, secction);
			
			envia.setString(2, pais);
			
			rs=envia.executeQuery();

			
		}
		
		
		else  {
			
			enviatodo=conecta.createStatement();
			
			rs=enviatodo.executeQuery(consultaTodos);
			
			
			
			
			
		}
		
		}catch (Exception e) {
			
			
			System.out.println(e.getMessage());
		}
		
		return rs;
	
	}
	
	private Conexion miConexion;
	
	private ResultSet rs;
	
	private PreparedStatement envia;
	
	private Statement enviatodo;
	
	private final String consultaSeccion="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=?";
	
	private final String consultaPaise="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN=?";
	
	private final String consultaAmbos="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=? AND PAÍSDEORIGEN=?";
	
	private final String consultaTodos="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS";
			

}






