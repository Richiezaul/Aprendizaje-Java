package Z.corp.Com;

import java.sql.*;


public class Conexion {

	
	public ResultSet table_Sql() {
		
		Connection miConnection=null;
		ResultSet rSet=null;
	
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			 miConnection= DriverManager.getConnection("jdbc:mariadb://localhost:3302/curso_sql", "root", "Amv97135");
			
			Statement miStatement=miConnection.createStatement();
			
			String sql= "SELECT * FROM PRODUCTOS";
			
			rSet=miStatement.executeQuery(sql);
			
			miConnection.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				miConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return rSet;
		
		
	}
	
	
}
