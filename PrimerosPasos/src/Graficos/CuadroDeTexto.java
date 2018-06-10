package Graficos;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CuadroDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto mimarco = new MarcoConTexto();

	}

}


class MarcoConTexto extends JFrame{
	
	
	
	public MarcoConTexto() {
		
		setBounds(150, 200, 600, 400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelConTexto panel= new PanelConTexto();
		
		add(panel);
		
		setVisible(true);
		
			
		
	}
	

}

class PanelConTexto extends JPanel{
	
	private JTextField texto1;
	private JLabel resultado;
	JPanel panel3;
	
	public PanelConTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel panel2 = new JPanel();
		 panel3 = new JPanel();
		
		panel2.setLayout(new FlowLayout());
		
		panel3.setLayout(new GridLayout(8,6));
		
		JLabel milableemail= new JLabel("Email:");
		
		panel2.add(milableemail);
		
		creatBoton("1");
		creatBoton("2");
		creatBoton("3");
		creatBoton("4");
		creatBoton("5");
		creatBoton("6");
		creatBoton("7");
		creatBoton("8");

		
		
		
		
		
		
		
		
		
		texto1= new JTextField(20);
		resultado = new JLabel("",JLabel.CENTER);
		
		panel2.add(texto1);
		
		add(resultado,BorderLayout.CENTER);
		
		JButton textoboton= new JButton("comprobar");
		
		panel2.add(textoboton);
		
		textoboton.addActionListener(new DameTexto());
		
		add(panel2,BorderLayout.NORTH);
		add(panel3, BorderLayout.SOUTH );
		
		
		
	}
	
	
	private void creatBoton(String x) {
		
		
		JButton boton = new JButton(x);
		
		panel3.add(boton);
		
		
		
		
		
	}
	
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int correcto=0;
			String email= texto1.getText().trim();
			
			for(int i=0;i<email.length();i++) {
				
				
				if(email.charAt(i)=='@') {
					
					correcto++;
						
				}
			
		
		
			}
			
			
			if(correcto==1) {
			resultado.setText("Correcto");
			
			
			}
			
			else {
				
				resultado.setText("incorrecto");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}













































