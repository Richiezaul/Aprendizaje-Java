package Graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanasEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

class MarcoEmergente extends JFrame{
	
	
	public MarcoEmergente() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panelemergente panel = new Panelemergente();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class Panelemergente extends JPanel{
	
	
	
	public Panelemergente() {
		

		
		
		
		
	}

}

