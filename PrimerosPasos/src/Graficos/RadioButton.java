package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConRadioButton marco = new MarcoConRadioButton();
		

	}

}

class MarcoConRadioButton extends JFrame{
	
	
	public MarcoConRadioButton() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelConRadioButton panel = new PanelConRadioButton();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelConRadioButton extends JPanel{
	
	JRadioButton boton1 ;
	private JPanel panelbotton = new  JPanel();
	ButtonGroup migrupo1 = new ButtonGroup();
	JLabel texto;
	
	public PanelConRadioButton() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("la capoeida es lo mas bacanoooooo");
		
		add(texto,BorderLayout.CENTER);
		
		colocarBoton("pequeno", false, 10);
		
		colocarBoton("mediano", true, 12);
		
		colocarBoton("Grande", false, 18);
		
		colocarBoton("Muy Grande", false, 26);
		
		add(panelbotton,BorderLayout.SOUTH);
		
		
	
		
		
	}
	
	public void colocarBoton(String nombre,boolean seleccionado,int tamano) {
		
		
		JRadioButton boton = new JRadioButton(nombre,seleccionado);
	
		migrupo1.add(boton);
		
		panelbotton.add(boton);
		
		ActionListener mievento = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				texto.setFont(new Font("Serif",Font.PLAIN,tamano));
				
				
				
				
			}
		};
		
		boton.addActionListener(mievento);
		
		
		
		
		
		
		
		
		
		
	}
	

	

			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


































