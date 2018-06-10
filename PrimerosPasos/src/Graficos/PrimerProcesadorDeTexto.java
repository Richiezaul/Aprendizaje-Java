package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.MissingFormatArgumentException;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class PrimerProcesadorDeTexto {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MarcoTextoP marco= new MarcoTextoP();

	}

}

class MarcoTextoP extends JFrame{
	
	
	public MarcoTextoP() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelTextoP panel = new PanelTextoP();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelTextoP extends JPanel{
	
	
	JTextPane areatexto;
	JPanel panelmenu ;
	
	JMenu fuente, style,tamano;
	
	Font letras;
	
	JTextPane texto; 
	JRadioButtonMenuItem elem_menu2;
	JCheckBoxMenuItem elem_menu;
	
	public PanelTextoP() {
		
		setLayout(new BorderLayout());
		
		panelmenu = new JPanel();
		
		JMenuBar bar = new JMenuBar();
		
		fuente = new JMenu("Fuente");
		style = new JMenu("Style");
		tamano = new JMenu("Tamano");
		
		//Fuente---------------------------------------------------------------------------------------------------------
		configura_menu("Arial", "fuente", "Arial",Font.PLAIN,10,"Recursos/Cortar.gif");
		configura_menu("Consolas", "fuente", "Consolas",Font.PLAIN,10,"Recursos/Cortar.gif");
		configura_menu("Verdana", "fuente", "Verdana",Font.PLAIN,10,"Recursos/Cortar.gif");
		
		//Tamano---------------------------------------------------------------------------------------------
		
//		configura_menu("10", "tamano", "Consolas",Font.PLAIN,10,"Recursos/Cortar.gif");
//		configura_menu("14", "tamano", "Consolas",Font.PLAIN,14,"Recursos/Cortar.gif");
//		configura_menu("20", "tamano", "Consolas",Font.PLAIN,20,"Recursos/Cortar.gif");
//		configura_menu("24", "tamano", "Consolas",Font.PLAIN,24,"Recursos/Cortar.gif");
//		
		
		ButtonGroup migrupo = new ButtonGroup();
		
		JRadioButtonMenuItem t12 = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem t16 = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem t20 = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem t24 = new JRadioButtonMenuItem("24");
		
		migrupo.add(t12);
		migrupo.add(t16);
		migrupo.add(t20);
		migrupo.add(t24);
		
		t12.addActionListener(new StyledEditorKit.FontSizeAction("Cambia tamano", 12));
		t16.addActionListener(new StyledEditorKit.FontSizeAction("Cambia tamano", 16));
		t20.addActionListener(new StyledEditorKit.FontSizeAction("Cambia tamano", 20));
		t24.addActionListener(new StyledEditorKit.FontSizeAction("Cambia tamano", 24));
		
		t24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		
		tamano.add(t12);
		tamano.add(t16);
		tamano.add(t20);
		tamano.add(t24);
		
		
		
		//style---------------------------------------------------------------------------------------------
		
		configura_menu("Negrita", "style", "Consolas",Font.BOLD,10,"Recursos/Cortar.gif");
		configura_menu("Cursiva", "style", "Consolas",Font.ITALIC,10,"Recursos/Cortar.gif");
		
		
		
		
		

		
		bar.add(fuente);
		bar.add(style);
		bar.add(tamano);
		
		panelmenu.add(bar);
		
		add(panelmenu,BorderLayout.NORTH);
		
		areatexto = new JTextPane();
		
		add(areatexto,BorderLayout.CENTER);	
		
	}
	
public void configura_menu(String rotulo, String menu, String tipo_letra, int estilo, int tam,String icono) {
	
	
	 elem_menu = new JCheckBoxMenuItem(rotulo, new ImageIcon(icono));
	
	 elem_menu2 = new JRadioButtonMenuItem(rotulo, new ImageIcon(icono));
	 
	 ButtonGroup funtegrup = new ButtonGroup();
	
	if(menu=="fuente") {
		
	//elem_menu = new JMenuItem(rotulo,new ImageIcon("Recursos/Cortar.gif"));
		
		
		
		if(tipo_letra== "Consolas") {
			
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("CambioFont","Consola"));
			
			//funtegrup.add(elem_menu2);
		}
		

		if(tipo_letra== "Arial") {
			
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("CambioFont","Arial"));
			
			//funtegrup.add(elem_menu2);
		}
		

		if(tipo_letra== "Verdana") {
			
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("CambioFont","Verdana"));
			
			//funtegrup.add(elem_menu2);
		}
		//elem_menu2.
		fuente.add(elem_menu2) ;
	}
	else if (menu=="style") {
		
		style.add(elem_menu);
		if(estilo == Font.ITALIC) {
			elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
			
			elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
		}
		
		else if(estilo==Font.BOLD) {
			elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,InputEvent.CTRL_DOWN_MASK));
			
			elem_menu.addActionListener(new StyledEditorKit.BoldAction());
		}
//			
//	}
//	else if(menu=="tamano"){
//		
//		tamano.add(elem_menu2);
//		
//		elem_menu2.addActionListener(new StyledEditorKit.FontSizeAction("Cambia tamano", tam));
//		
//	}
//	
	
		
		
	}


}
}
















