package Graficos;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class WordFalso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoWord marco = new MarcoWord();

	}

}


class MarcoWord extends JFrame{
	
	
	public MarcoWord() {
		
		setTitle("WordFalso");
	//	setBounds(150,50,350,450);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelWord panel = new PanelWord();
		
		add(panel);
		
		setVisible(true);
		
		
		
	}
	
	
}

class PanelWord extends JPanel{
	
	JTextPane textarea;
	JSlider slider;
	JButton boton;
	JSpinner spinner;
	JScrollPane panel2;
	JPanel panel3;
	JLabel etiqueta;
	JComboBox desplegable;
	
	public PanelWord() {
		
		
		setLayout(new BorderLayout());
		
		String listaFont[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		textarea= new JTextPane();
		spinner = new JSpinner();
		boton=new JButton("Ajuste De Linea");
		slider = new JSlider(8,48,8);
		panel3=new JPanel();
		etiqueta = new JLabel();
		desplegable = new JComboBox(listaFont);
		
		
		
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		desplegable.setToolTipText("Fuentes");
		
		
		panel3.add(boton);
		etiqueta = new JLabel("Tamano de texto");
		panel3.add(etiqueta);
		panel3.add(slider);
		etiqueta = new JLabel("Fuentes");
		panel3.add(etiqueta);
		panel3.add(desplegable);
		
		add(panel3,BorderLayout.NORTH);
		
		
		panel2 = new JScrollPane(textarea);
		
		add(panel2,BorderLayout.CENTER);
		
		desplegable.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia.font",(String)desplegable.getSelectedItem()));
		
		
		
		
	}
	
	
	private class Actiones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			
		//	if 
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}

























































































