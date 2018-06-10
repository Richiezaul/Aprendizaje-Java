package Graficos;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DispociAvansada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConAvansado miMarcoConAvansado = new MarcoConAvansado();
	}

}

class MarcoConAvansado extends JFrame{
	
	
	public MarcoConAvansado() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lable = new JLabel("Nombre");
		JLabel lable2 = new JLabel("Password");
		
		JTextField texto1 = new JTextField(10);
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		
		Box cajaH1 = Box.createHorizontalBox();
		
		cajaH1.add(lable);
		
		cajaH1.add(Box.createHorizontalStrut(10));
		
		cajaH1.add(texto1);
	
		JTextField texto2 = new JTextField(10);
		
		Box cajaH2= Box.createHorizontalBox();
		
		cajaH2.add(lable2);
		
		cajaH2.add(Box.createHorizontalStrut(10));
		
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		cajaH2.add(texto2);
		
		JButton ok = new JButton("OK");
		JButton Cancelar = new JButton("Cancelar");
		
		Box cajaH3 = Box.createHorizontalBox();
		
		cajaH3.add(ok);
		
		cajaH3.add(Box.createGlue());
		
		cajaH3.add(Cancelar);
		
		Box cajavertical = Box.createVerticalBox();
		
		cajavertical.add(cajaH1);
		cajavertical.add(cajaH2);
		cajavertical.add(cajaH3);
		
		add(cajavertical,BorderLayout.CENTER);
		
		//PanelConAvansado panel = new PanelConAvansado();
		
		//add(panel);
		
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelConAvansado extends JPanel{
	
	
	
	public PanelConAvansado() {
		

		
		
		
		
	}

}

