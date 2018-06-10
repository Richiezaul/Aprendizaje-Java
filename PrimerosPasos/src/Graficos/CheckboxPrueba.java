package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckboxPrueba {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCheckBox mimarco = new MarcoCheckBox();

	}

}

class MarcoCheckBox extends JFrame{
	
	
	public MarcoCheckBox() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelCheckBox panel = new PanelCheckBox();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	



class PanelCheckBox extends JPanel{
	
	private JLabel texto;
	
	private JCheckBox check1, check2;
	
	JPanel panel2;
	
	public PanelCheckBox() {
		
		setLayout(new BorderLayout());
		
		Font miletra = new Font("Serif", Font.PLAIN, 20);
		
		texto = new JLabel("lacapoeida son todo los tigre del campo");
		
	    texto.setFont(miletra);
		
		 panel2 = new JPanel();
		
		panel2.add(texto);
		
		texto.setFont(miletra);
		
		add(panel2,BorderLayout.CENTER);
		
		JPanel panelChecks = new JPanel();
		
		check1 = new JCheckBox("Negrita");
		
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaCheck());
		
		check2.addActionListener(new ManejaCheck());
		
		panelChecks.add(check1);
		
		panelChecks.add(check2);
		
		add(panelChecks,BorderLayout.SOUTH);
		
	}

	private class ManejaCheck implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int tipo= 0 ;
			
			if (check1.isSelected()) { 
				
				
				tipo +=Font.BOLD;



}
			
			if(check2.isSelected()) {
				
				
				tipo += Font.ITALIC;
				
			}
			
			else {
				
				
				tipo +=Font.PLAIN;
			}
			
			
			texto.setFont(new Font("Serif",tipo,20));
			
			
			panel2=new JPanel() {
				
				protected void paintComponent(Graphics g ) {
					
					Graphics2D g2= (Graphics2D)g;
					
					Rectangle2D miRectangle = new Rectangle2D.Double (20,85,50,50); 
					
					g2.draw(miRectangle);
					
					
				}
				
			};
		}
		
		
		
		
		
		
	}
	
	
	
}

}


































