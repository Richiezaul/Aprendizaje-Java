package modelo;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import vista.Marco_Aplicacion_2;

public class Controlador_Button implements ActionListener {
	
	Marco_Aplicacion_2 miMarco;

	
	public Controlador_Button(Marco_Aplicacion_2 miMarco) {
		
		this.miMarco=miMarco;
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		miMarco.resultado.setText("");
		
		String seleccion_Seccion= (String) miMarco.secciones.getSelectedItem();
		
		String selection_Paises = (String) miMarco.paises.getSelectedItem();
		
		resultadoConsulta =  new Ejeuta_Consulta().filtrarBBDD(seleccion_Seccion, selection_Paises);
		
		
		if (resultadoConsulta==null) {
			
			System.out.println("holas");
			
		}
		
		
		try {
			
			while (resultadoConsulta.next()) {
				
			miMarco.resultado.append(resultadoConsulta.getString(1));
			
			miMarco.resultado.append(", ");
			
			miMarco.resultado.append(resultadoConsulta.getString(2));
			
			miMarco.resultado.append(", ");
			
			miMarco.resultado.append(resultadoConsulta.getString(3));
			
			miMarco.resultado.append(", ");
			
			miMarco.resultado.append(resultadoConsulta.getString(4));
			
			miMarco.resultado.append("\n");
			
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		
	}
	
	private ResultSet resultadoConsulta;
	

}
