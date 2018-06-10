package controlador;

import java.awt.event.*;

import modelo.*;
import vista.*;

public class Controlador_Carga_Secciones extends WindowAdapter {

	
	
	public Controlador_Carga_Secciones(Marco_Aplicacion_2 elmarco) {
		
		this.elMarco= elmarco;
		
		
		
	}
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
	
		
		obj.ejecuta_Consulta();
		
		try {
			
			
			while (obj.rs.next()) {
				
				
				elMarco.secciones.addItem(obj.rs.getString(1));
				
				
			}
			
		} catch (Exception e2) {
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	Carga_Seccion obj= new Carga_Seccion();
	
	private Marco_Aplicacion_2 elMarco;
	
	
			
	
	

}
