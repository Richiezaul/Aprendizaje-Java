import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conecta_BD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			//1.crear Connection
			
			Connection miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
			
			System.out.println("1");
			// 2. crear objeto Statement
			
			Statement miStatement = miConnection.createStatement();
			
			System.out.println("2");
			
			// 3. Ejecutar SQL;
			
			ResultSet miResultSet = miStatement.executeQuery("SELECT DISTINCT PAÍSDEORIGEN,SUM(PRECIO) FROM PRODUCTOS GROUP BY PAÍSDEORIGEN");
			
			System.out.println("3");
			
			//4.RECORER EL RESULSET.
			
			while (miResultSet.next()) {
				
				
				System.out.println(miResultSet.getString(1) + " " + miResultSet.getDouble(2));
				
				
			}
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("NO Conection");
			
			System.out.println(e.getMessage());
		}

	}

}





















































