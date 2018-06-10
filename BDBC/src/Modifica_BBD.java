import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Modifica_BBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
try {
			
			//1.crear Connection
			
			Connection miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
			
			
			// 2. crear objeto Statement
			
			Statement miStatement = miConnection.createStatement();
			
			
			String InstuccionSQL= "DELETE FROM PRODUCTOS WHERE SECCIÓN = 'NULL'";
			
			miStatement.executeUpdate(InstuccionSQL);
			
			System.out.println("Datos MODIFICADO Correctamente");
		
		} catch (Exception e) {
			System.out.println("NO Conection");
		}

	}

//"INSERT INTO DATOSPERSONALES(NIF, NOMBRE, APELLIDO, EDAD) VALUES ('85245W', 'SAMUEL', 'MONTERO', 25)" ;
	
	//"UPDATE DATOSPERSONALES SET EDAD=EDAD+5 WHERE NIF='85245W'";


	}



































