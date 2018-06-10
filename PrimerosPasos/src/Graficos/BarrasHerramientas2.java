package Graficos;

import java.awt.*;

import javax.swing.*;

public class BarrasHerramientas2 {
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		MarcoBarra  marco = new MarcoBarra(); 
	
	

}

}

class MarcoBarra extends JFrame{

JMenuBar menubar;
JMenu Archivo;
JMenu Editar;
JMenu Formato;
JMenu Ayuda;
JMenu fuente;
JMenuItem addfunentes;
JToolBar toolbar;

	public MarcoBarra() {
		
		
		
	setLayout(new BorderLayout());
	
	String[] listafuente = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
	menubar = new JMenuBar();
	Archivo= new JMenu("Archivo");
	Editar= new JMenu("Editar");
	Formato = new JMenu("Formato");
	Ayuda = new JMenu("Ayuda");
	fuente = new JMenu("Fuente");
	addfunentes = new JMenuItem();
	JToolBar toolBar = new JToolBar();
	
	menubar.add(Archivo);
	menubar.add(Editar);
	menubar.add(Formato);
	menubar.add(Ayuda);
	
	/////Archivo Items/////////////////////////////////
	
	crearMenu("Archivo","Nuevo" , new ImageIcon("src/Graficos/new.png"));
	crearMenu("Archivo","Abrir..." , new ImageIcon("src/Graficos/Abrir.png"));
	crearMenu("Archivo","Guardar" , new ImageIcon(""));
	crearMenu("Archivo","Guardar como.." , new ImageIcon(""));
	Archivo.addSeparator();
	crearMenu("Archivo","Configuracion De Pagina" , new ImageIcon(""));
	crearMenu("Archivo","Imprimir" , new ImageIcon(""));
	crearMenu("Archivo","Salir" , new ImageIcon(""));
	
	//Editar Items///////////////////////////////////
	
	crearMenu("Editar","Dehacer", new ImageIcon(""));
	Editar.addSeparator();
	crearMenu("Editar","Cortar", new ImageIcon("Recursos/Cortar.gif"));
	crearMenu("Editar","Copiar", new ImageIcon("Recursos/Copiar.gif"));
	crearMenu("Editar","Pegar", new ImageIcon("Recursos/Pegar.gif"));
	crearMenu("Editar","Eliminar", new ImageIcon(""));
	Editar.addSeparator();
	crearMenu("Editar","Buscar", new ImageIcon(""));
	crearMenu("Editar","Buscar Siguiente", new ImageIcon(""));
	crearMenu("Editar","Remplasar ", new ImageIcon(""));
	crearMenu("Editar","Ir a", new ImageIcon(""));
	crearMenu("Editar","Selectionar todo", new ImageIcon(""));
	Editar.addSeparator();
	crearMenu("Editar","Hora y Fecha", new ImageIcon(""));
	
	///Formato Items/////////////////////////////////////////////////
	
	crearMenu("Formato", "Ajuste De Linea", new ImageIcon(""));
	
	for(int i = 0;i<listafuente.length;i++) {
		
		addfunentes = new JMenuItem(listafuente[i]);
		
		fuente.add(addfunentes);
		
		
	}
	
	//addfunentes.addActionListener(new StyledEditorKit.FontFamilyAction("Font Cambio", addfunentes.getName()));
	Formato.add(fuente);
	
	//////Ayuda items//////////
	
	crearMenu("Ayuda","Ver Ayuda" , new ImageIcon(""));
	Ayuda.addSeparator();
	crearMenu("Ayuda"," Acerca De Richie Editoro De Texto" , new ImageIcon(""));
	
	
	
	
	
	add(menubar, BorderLayout.NORTH);
	
	add(toolBar);
	
	setBounds(150,200,450,350);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	PanelBarra panel = new PanelBarra();
	
	add(panel);
	
	setVisible(true);
	
	
	
	
}
	
	

	public JMenuItem crearMenu(String menu, String name, Icon icono) {
	
	
		JMenuItem items = new JMenuItem(name,icono);
		
		if(menu=="Archivo") {
			
			
			Archivo.add(items);
			
			
			
		}
		
	if(menu=="Editar") {
			
			
		Editar.add(items);
			
			
			
		}
	
	if(menu=="Formato") {
		
		
		Formato.add(items);
			
			
			
		}
	if(menu=="Ayuda") {
		
		
		Ayuda.add(items);
			
			
			
		}

	return items;
	
	
}

	public JButton crearboton (Icon icono) {
		
		JButton botonbarra = new JButton(icono);
		
		toolbar.add(botonbarra);
		
		return botonbarra;
		
		
		
		
		
		
	}
	


}


class PanelBarra extends JPanel{


JTextPane areatexto;

JScrollPane Paneltexto;
JToolBar toolbar;
JButton boton = new JButton("lala");
JButton boton1 = new JButton("lala");
JButton boton2 = new JButton("lala");
JButton boton3 =new JButton("lala");
JButton boton4 = new JButton("lala");
JButton boton5= new JButton("lala");
JSplitPane split;

	public PanelBarra() {
		
		setLayout(new BorderLayout());
		areatexto= new JTextPane();
	
		Paneltexto = new JScrollPane(areatexto);
		
		toolbar = new JToolBar();
		
		split = new JSplitPane();
		
		//toolbar.setLayout(new GridLayout());
		
		toolbar.add(boton);
		toolbar.add(boton1);
		toolbar.add(boton2);
		toolbar.add(boton3);
		toolbar.addSeparator();
		toolbar.add(boton4);
		toolbar.add(boton5);
		//toolbar.add(split);
		
		add(Paneltexto, BorderLayout.CENTER);
		
		add(toolbar,BorderLayout.NORTH);
		
		
		
	
		
	
	
	
	
}
	
	
	
	

}




























































