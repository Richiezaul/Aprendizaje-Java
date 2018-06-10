package Graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoTextoR mimarco= new MarcoTextoR();
		
	}

}

class MarcoTextoR extends JFrame{
	
	
	public MarcoTextoR() {
		
		
		setTitle("pruebatexto");
		
		setBounds(150, 200, 450, 300);
		
		add(new PanelTextoR());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
	}
	
	
	
}


class PanelTextoR extends JPanel{
	
	JButton agregartx;
	JButton wraps;
	JTextArea textarea;
	JScrollPane ScrollPanel;
	JPanel panelbotton;
	
	public PanelTextoR() {
		
		
		setLayout(new BorderLayout());
		
		agregartx = new JButton("agregar texto");
		
		wraps = new JButton("LineWrap");
		
		textarea = new JTextArea(8,20);
		
		ScrollPanel = new JScrollPane(textarea);
		
		panelbotton = new JPanel();
		
		//panelbotton.setLayout(new GridLayout(1,2));
		
		panelbotton.add(agregartx);
		
		panelbotton.add(wraps);
		
		add(panelbotton,BorderLayout.SOUTH);
		
		add(ScrollPanel,BorderLayout.CENTER);
		
		agregartx.addActionListener(new ActionTexto());
		
		wraps.addActionListener(new ActionTexto());
		
		
		
		
		
	}
	
	private class ActionTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object botton = e.getSource();
			
			if (botton == agregartx) {
				
				textarea.append("La Vida es una Tombola TON TON TON y no tiene color Tombola");
				
				
			}
			
			if (botton == wraps) {
				
				boolean salto =!textarea.getLineWrap();
				
				textarea.setLineWrap(salto);
				
				if(salto) {
					
					
					wraps.setText("LineUnWrap");
				}
				
				else {
					
					wraps.setText("LineWrap");
					
				}
				
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}


























































