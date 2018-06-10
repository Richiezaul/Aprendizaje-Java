package Graficos;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class CuandrodeTx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoContx2 miarco = new MarcoContx2();

	}

}

class MarcoContx2 extends JFrame{
	
	
	public MarcoContx2() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelContx2 panel = new PanelContx2();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
	
	
	
	
	
	
	
}


class PanelContx2 extends JPanel{
	
	JTextField micampo;
	
	public PanelContx2() {
		
		micampo= new JTextField(20);
		
		Escuchatexto eloyente = new Escuchatexto();
		
		Document midoc = micampo.getDocument();

		midoc.addDocumentListener(eloyente);
		
		add(micampo);
		
		
		
		
	}
	
	private class Escuchatexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			
			System.out.println("Has Insertado Texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has borrado texto");
			
		}
		
		
		
		
		
		
		
	}
	
	
	
}