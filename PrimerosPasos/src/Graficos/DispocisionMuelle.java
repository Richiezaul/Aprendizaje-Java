package Graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class DispocisionMuelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConMuelle marco = new MarcoConMuelle();

	}

}

class MarcoConMuelle extends JFrame{
	
	
	public MarcoConMuelle() {
		
		setBounds(150,200,900,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelContx28 panel = new PanelContx28();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelContx28 extends JPanel{
	
	
	
	public PanelContx28() {
		

		JButton boton1 = new JButton("boton1");
		JButton boton2 = new JButton("boton2");
		JButton boton3 = new JButton("boton3");
		
		SpringLayout milayout = new SpringLayout();
		
		setLayout(milayout);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		Spring mimuelle = Spring.constant(100, 10, 100);
		Spring mimuellerigido = Spring.constant(30);
		
		milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
		
		milayout.putConstraint(SpringLayout.WEST, boton2, mimuellerigido, SpringLayout.EAST, boton1);
		
		milayout.putConstraint(SpringLayout.WEST, boton3, mimuellerigido, SpringLayout.EAST, boton2);
		
		milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
		
		
		
	}

}
