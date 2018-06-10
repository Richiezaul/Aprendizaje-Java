package Graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonRadio {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConRadio mimarco = new MarcoConRadio();

	}

}

class MarcoConRadio extends JFrame{
	
	
	public MarcoConRadio() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelConRadio panel = new PanelConRadio();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelConRadio extends JPanel{
	
	
	
	public PanelConRadio() {
		

		
		
		
		
	}

}

