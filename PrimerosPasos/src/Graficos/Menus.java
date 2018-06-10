package Graficos;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Menus {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoMenu marco= new MarcoMenu();
		

	}

}

class MarcoMenu extends JFrame{
	
	
	public MarcoMenu() {
		
		setLayout(new BorderLayout());
		
		JMenuBar menubar1 =new JMenuBar();
		
		JMenu option5 = new JMenu("Option5");
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelMenu panel = new PanelMenu();
		
		menubar1.add(option5);
		
		add(menubar1,BorderLayout.NORTH);
		
		add(panel,BorderLayout.CENTER);
		
		setVisible(true);
		
		
		
		
		
	}
	
		
	
	
}


class PanelMenu extends JPanel{
	
	JMenuBar menubar;
	JMenu archivo;
	JMenu edicion;
	JMenu herramientas;
	JCheckBox checkbox;
	public PanelMenu() {
	
		
		
		
		checkbox = new JCheckBox("Auto Guardado");
		menubar = new JMenuBar();
		
		archivo = new JMenu("Archivo");
		edicion= new JMenu("Edicion");
		herramientas = new JMenu("Herramienta");
		
		JMenu opciones = new JMenu("Öpciones");
		
		JMenuItem guardar= new JMenuItem("Guardar");
		JMenuItem guardarcomo= new JMenuItem("Guardar Como");
		
		
		JMenuItem Cortar= new JMenuItem("Cortar", new ImageIcon("Recursos/Cortar.gif"));
		
		Cortar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JMenuItem Copiar= new JMenuItem("Copiar", new ImageIcon("Recursos/Copiar.gif"));
		JMenuItem pegar= new JMenuItem("Pegar", new ImageIcon("Recursos/Pegar.gif"));
		
		
		JMenuItem general= new JMenuItem("Generales");
		
		JMenuItem Option1= new JMenuItem("Option1");
		JMenuItem Option2= new JMenuItem("Option2");
		
		
		
		opciones.add(Option1);
		opciones.add(Option2);
		
		
		archivo.add(guardar);
		archivo.add(guardarcomo);
		archivo.add(checkbox);
		
		edicion.add(Copiar);
		edicion.add(pegar);
		edicion.add(Cortar);
		
		herramientas.add(general);
		
		herramientas.addSeparator();
		herramientas.add(opciones);
		
		
		
		
		menubar.add(archivo);
		
		menubar.add(edicion);
		
		menubar.add(herramientas);
		
		menubar.
		
		add(menubar);
		
		
		
	}

}

//
//
//
//
//JMenuItem arial =new JMenuItem("Arial");
//
//arial.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		areatexto.setFont(new Font("Arial",Font.PLAIN,12));
//		
//		
//	}
//});
//
//JMenuItem consolas =new JMenuItem("Consolas");
//
////GestionaMenus tipoletra = new GestionaMenus();
//
//consolas.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		areatexto.setFont(new Font("Consolas",Font.PLAIN,12));
//		
//		
//	}
//});
//
//JMenuItem Verdana =new JMenuItem("Verdana");
//
//Verdana.addActionListener(new ActionListener() {
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		areatexto.setFont(new Font("Verdana",Font.PLAIN,12));
//		
//		
//	}
//});
//
//
////Style------------------------------------------------------------------------------------------------------------
//
//
//JMenuItem negrita =new JMenuItem("Bold");
//JMenuItem cursiva =new JMenuItem("Curve");
//
////Tamano-----------------------------------------------------------------------------------------------------------------
//
//
//JMenuItem a10=new JMenuItem("10");
//JMenuItem a18 =new JMenuItem("18");
//JMenuItem a24 =new JMenuItem("24");
//
//
////------------------------------------------------------------------
//
//style.add(negrita);
//style.add(cursiva);
//
//tamano.add(a10);
//tamano.add(a18);
//tamano.add(a24);
//
//
//
//fuente.add(arial);
//fuente.add(consolas);
//fuente.add(Verdana);










//@Override
//public void actionPerformed(ActionEvent e) {
//	// TODO Auto-generated method stub
//	
//	letras = areatexto.getFont();
//	
//	if(menu=="Arial" ||menu=="Consolas" || menu=="Verdana" ) {
//		
//		estilo_letra = letras.getStyle();
//	
//		tamano_letra = letras.getSize();
//	}
//	else if(menu=="Negrita" || menu=="Cursiva") {
//		
//		if(estilo_letra == 1 || estilo_letra == 2) {
//			
//			estilo_letra =3;
//		}
//		
//		tipo_texto=letras.getFontName();
//		tamano_letra= letras.getSize();
//		
//	} else if (menu=="10" || menu=="14" || menu=="24") {
//		
//		
//		tipo_texto=letras.getFontName();
//		estilo_letra = letras.getStyle();
//		
//		
//	}
//	
//	
//	
//	areatexto.setFont(new Font(tipo_texto,estilo_letra,tamano_letra));
//	
//}
//
//
//
//
//
//
//}



