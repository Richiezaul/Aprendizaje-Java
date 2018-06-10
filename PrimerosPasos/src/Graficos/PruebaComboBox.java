package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class PruebaComboBox {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoComboBox marco = new MarcoComboBox();

	}

}

class MarcoComboBox extends JFrame{
	
	
	public MarcoComboBox() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelComboBox panel = new PanelComboBox();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelComboBox extends JPanel{
	
	
	private JLabel texto;
	
	private JComboBox micombo;
	
	public PanelComboBox() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("El Problema No es La Piedra el Problema ");
		
		texto.setFont(new Font("Arial",Font.PLAIN,18));
		
		
		add(texto,BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		
		
		micombo = new JComboBox();
		
		micombo.setEditable(true);
		
		micombo.addItem("Serif");
		
		micombo.addItem("Arial");
		
		micombo.addItem("Consolas");
		
		micombo.addItem("Dialog");
		
		Evento_Combo evento = new Evento_Combo();
		
		
		micombo.addItemListener(new Porjoder());
		
		panel2.add(micombo);
		
		add(panel2,BorderLayout.NORTH);
		
		
		
		
	}
	
	
	private class Evento_Combo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
			
		}
		
		
		
		
		
		
		
	}




private class Porjoder implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
		
	}
	
	
	
	
	
	
}
}

















































