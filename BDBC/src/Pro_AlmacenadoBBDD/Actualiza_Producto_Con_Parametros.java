package Pro_AlmacenadoBBDD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Actualiza_Producto_Con_Parametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nPrecio= Integer.parseInt(JOptionPane.showInputDialog("Introduce Precio"));
		
		String nArticulo=JOptionPane.showInputDialog("Introduce Articulo");
		
		
		Connection miConnection;
		try {
			miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
			
			CallableStatement miSentencia = miConnection.prepareCall("call ACTUALIDA_R_PRO(?, ?)");
			
			miSentencia.setInt(1, nPrecio);
			
			miSentencia.setString(2, nArticulo);
			
			miSentencia.execute();
			
			System.out.println("Articulo Fue Actualisado");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			
			
		}
		

		

	}

}












































