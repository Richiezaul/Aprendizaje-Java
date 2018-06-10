package Graficos;


import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Barra mimarco=new Marco_Barra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Barra extends JFrame{
	
	public Marco_Barra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuración de acciones
		
		Action accionAzul=new AccionColor("Azul", new ImageIcon("src/Graficos/bola_azul.gif"), Color.BLUE);
		
		Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/Graficos/bola_amarilla.gif"), Color.YELLOW);
		
		Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/Graficos/bola_roja.gif"), Color.RED);
		
		Action accionsalir= new AbstractAction("Salir", new ImageIcon("src/Graficos/Salir.gif")) {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}
		};
		
		JMenu menu = new JMenu("Color");
		
		menu.add(accionAmarillo);
		menu.add(accionAzul);
		menu.add(accionRojo);
		
		JMenuBar barramenu = new JMenuBar();
		
		barramenu.add(menu);
		
	
		setJMenuBar(barramenu);
		
		JToolBar toobar = new JToolBar();
		
		toobar.add(accionAmarillo);
		toobar.add(accionAzul);
		toobar.add(accionRojo);
		
		toobar.addSeparator();
		
		toobar.add(accionsalir);
		
		
		
		add(toobar,BorderLayout.NORTH);
		
		
		
		
	}
		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	}
	private JPanel lamina;
}



