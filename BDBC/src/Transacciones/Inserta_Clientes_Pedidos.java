package Transacciones;
import java.sql.*;

import javax.swing.JOptionPane;

public class Inserta_Clientes_Pedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Connection miConexion=null;
		
	
		
		try{					
				
			 miConexion=DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");				
			
			miConexion.setAutoCommit(false);
			
			Statement miStatement =miConexion.createStatement();
			
		    String instruccionSql_1="DELETE FROM PRODUCTOS WHERE PAÍSDEORIGEN = 'CHINA' ";
			       
		    String instruccionSql_2="DELETE FROM PRODUCTOS WHERE PRECIO>300";
		    
		    String instruccionSql_3="UPDATE PRODUCTOS SET PRECIO = PRECIO*1.15";
		    
		    boolean ejecutar= ejecutar_transaccion();
		    
		    if (ejecutar) {
		    
		    miStatement.executeUpdate(instruccionSql_1);
			    
		    miStatement.executeUpdate(instruccionSql_2);
		    
		    miStatement.executeUpdate(instruccionSql_3);
		   				    
		    miConexion.commit();
		    
		    System.out.println("Datos INSERTADOS correctamente");
		    
		    }
		    else {
				System.out.println("Transaccion No Ejecutada");
			}
		    
		    miConexion.close();
				
		}catch(Exception e){
				
			System.out.println("ERROR EN LA INSERCIÓN DE DATOS!!");
			
			try {
				miConexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("Algo salio mal");
				
			}
				
			
			System.out.println(e.getMessage());
				
				
			}

		}

	private static boolean ejecutar_transaccion() {
		
		String ejecucion=JOptionPane.showInputDialog("Ejecutamos Transacion");
		
		if (ejecucion.equalsIgnoreCase("Si")) {
			
			return true;
			
		}
		
		else {
			return false;
		}
		
		
		
	}

	}


























































