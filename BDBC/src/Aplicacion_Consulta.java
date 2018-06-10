import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import javax.swing.*;
import org.mariadb.jdbc.MariaDbPoolDataSource;

public class Aplicacion_Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mimarco=new Marco_Aplicacion();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Marco_Aplicacion(){
		
		setTitle ("Consulta BBDD");
		
		setBounds(500,80,500,650);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		secciones=new JComboBox<String>();
		
		secciones.setEditable(false);
		
		secciones.addItem("Todos");
		
		paises=new JComboBox<String>();
		
		paises.setEditable(false);
		
		paises.addItem("Todos");
		
		resultado= new JTextArea(4,50);
		
		resultado.setEditable(false);
		
		lSeccion= new JLabel("Seccion");
		
		lPais= new JLabel("Pais");
		
		add(resultado);
		
		menus.add(lSeccion);
		
		menus.add(secciones);
		
		menus.add(lPais);
		
		menus.add(paises);	
		
		add(menus, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton botonConsulta=new JButton("Consulta");	
		
		botonConsulta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ejecutarConsulta();
				
				
			}
		});
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		////-------Conection con base de datos--------///////
		
	try(MariaDbPoolDataSource pool = new MariaDbPoolDataSource()) {
			
			//1.crear Connection
		
		//	DataSource dSource= new 
		
		
		
		pool.setUrl("jdbc:mariadb://localhost:3302/cursodbc");
		pool.setUser("root");
		pool.setPassword("Amv97135");
		
		//	 miConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3302/cursodbc", "root", "Amv97135");
		
		miConnection= pool.getConnection();
		
			
			// 2. crear objeto Statement
			
			Statement miStatement = miConnection.createStatement();
			
			String consulta = "SELECT DISTINCT SECCIÓN FROM PRODUCTOS ";
			
			ResultSet rs= miStatement.executeQuery(consulta);
			
			
			while (rs.next()) {
				
				
				secciones.addItem(rs.getString(1));
				
				
			}
			
			
			
			consulta = "SELECT DISTINCTROW PAÍSDEORIGEN FROM PRODUCTOS ";
			
			 rs= miStatement.executeQuery(consulta);
			
			
			while (rs.next()) {
				
				
				paises.addItem(rs.getString(1));
				
				
			}
			
			rs.close();

		} catch (Exception e) {
			System.out.println("NO Conection");
			
			System.out.println(e.getMessage());
		}

		
		
	}	
	
	private void ejecutarConsulta() {
		
		resultado.setText(" ");		
		ResultSet rs=null;
		
		
		
		
		
		try {
			
			String seccion= (String)secciones.getSelectedItem();
			
			String pais=(String) paises.getSelectedItem();
			
			
					
				if(!seccion.equals("Todos") && pais.equals("Todos")) {	
					
			
			enviaconsultaSeccion= miConnection.prepareStatement(consultaseccion);
			
			enviaconsultaSeccion.setString(1, seccion);
			
			rs= enviaconsultaSeccion.executeQuery();
			
				}else if(seccion.equals("Todos") && !pais.equals("Todos")) {
					
					enviaconsultaPais= miConnection.prepareStatement(consultapais);
					
					enviaconsultaPais.setString(1, pais);
					
					rs= enviaconsultaPais.executeQuery();
					
					
					
				}else if(!seccion.equals("Todos") && !pais.equals("Todos")) {
					
					
					enviaconsultaTodos= miConnection.prepareStatement(consultaTodos);
					
					enviaconsultaTodos.setString(1,seccion);
					
					enviaconsultaTodos.setString(2, pais);
					
					rs= enviaconsultaTodos.executeQuery();
					
					
				}
				
				else if (seccion.equals("Todos") && pais.equals("Todos")) {
					
					
					Statement miStatement = miConnection.createStatement();
					
					rs=miStatement.executeQuery("SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM  PRODUCTOS");
					
				}
				
				
				
				
			
			while (rs.next()) {
				
				resultado.append(rs.getString(1));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(2));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(3));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(4));
				
				resultado.append("\n ");
				
				
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	
		
		
	}
		
	private  Connection miConnection;
	
	private PreparedStatement enviaconsultaSeccion;
	
	private PreparedStatement enviaconsultaPais;
	
	private PreparedStatement enviaconsultaTodos;
	
	private final String consultaseccion="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM  PRODUCTOS WHERE SECCIÓN=? ";
	
	private final String consultapais="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM  PRODUCTOS WHERE PAÍSDEORIGEN=? ";
	
	//private final String consultaTodos = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM  PRODUCTOS WHERE SECCIÓN=? AND PAÍSDEORIGEN=?"; 
	
	private final String consultaTodos="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE  SECCIÓN=? AND PAÍSDEORIGEN=?";
	
	private JComboBox<String> secciones;
	
	private JComboBox<String> paises;
	
	private JTextArea resultado;	
	
	private JLabel lSeccion;
	
	private JLabel lPais;
	

	
}





















































