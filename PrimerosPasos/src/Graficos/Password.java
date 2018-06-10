package Graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Password {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConPassword mimarco = new MarcoConPassword();
		

	}

}

class MarcoConPassword extends JFrame{
	
	
	public MarcoConPassword() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelConPassword panel = new PanelConPassword();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelConPassword extends JPanel{
	
	JPasswordField c_password;
	
	public PanelConPassword() {
		
		setLayout(new BorderLayout());
		
		JPanel panelsuperio = new JPanel();
		
		panelsuperio.setLayout(new GridLayout(3, 2));
		
		add(panelsuperio,BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("Usuario");

		JLabel etiqueta2 = new JLabel("Contrasena");
		
		JTextField c_ususario= new JTextField(15);
		
		c_password= new JPasswordField(15);
		
		Document docx = c_password.getDocument();
		
		docx.addDocumentListener(new Compruebapassword());
		
		panelsuperio.add(etiqueta1);
		
		panelsuperio.add(c_ususario);
		
		panelsuperio.add(etiqueta2);
		
		panelsuperio.add(c_password);
		
		panelsuperio.add(new JLabel(""));
		
		panelsuperio.add(new JLabel("From 8 to 12 caracteres"));
		
		add(new JButton("Enviar"),BorderLayout.SOUTH);
		
		
		
		
		
		
	
	
		
		
	}
	
	
	
	private class Compruebapassword implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char[] contrasena;
			
			contrasena = c_password.getPassword();
			
			if(contrasena.length<8 || contrasena.length >12) {
				
				c_password.setBackground(new Color(251,65,45));
				
				
			}
			
			else {
				
				c_password.setBackground(Color.white);
				
				
				
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char[] contrasena;
			
			contrasena = c_password.getPassword();
			
			if(contrasena.length>0 && contrasena.length<8 || contrasena.length >12) {
				
				c_password.setBackground(new Color(251,65,45));
				
				
			}
			
			else {
				
				c_password.setBackground(Color.white );
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}

