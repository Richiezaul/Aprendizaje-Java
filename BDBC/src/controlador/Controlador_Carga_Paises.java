package controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import modelo.*;
import vista.*;

public class Controlador_Carga_Paises extends WindowAdapter {
	
	
	
	public Controlador_Carga_Paises(Marco_Aplicacion_2 elMarco2) {
		// TODO Auto-generated constructor stub
		
		this.elMarco2=elMarco2;
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		obj.ejecuta_Consulta();
	
		try {
			
			
			
			while (obj.rs.next()) {
				
				
				elMarco2.paises.addItem(obj.rs.getString(1));
				
				
			}
			
			
		} catch (Exception e2) {
			// TODO: handle exception
		}

		
		
		
		
		
	}
	
	
	Marco_Aplicacion_2 elMarco2;
	
	Cargar_Paises obj= new Cargar_Paises();
	
	
	
	
	
	
	
	

}
