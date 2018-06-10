package Graficos;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AreasDeTx2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConAreaTx2 mimarco = new MarcoConAreaTx2();

	}

}

class MarcoConAreaTx2 extends JFrame{
	
	private JButton insertar;
	
	private JPanel panelbotones;
	private JButton  saltodelinea;
	private JTextArea areatexto;
	
	private JScrollPane panelsc;
	
	public MarcoConAreaTx2() {
		
		setTitle("Probando Area");
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelbotones = new JPanel();
		
		insertar = new JButton("insertar");
		
		saltodelinea = new JButton("Salto Linea");
		
		areatexto =new JTextArea(8,20);
		
		panelsc = new JScrollPane(areatexto);
		
		insertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				areatexto.append(" En un lugar de la mancha no quiero Acordarme ");
				
			}
		});
		
		panelbotones.add(insertar);
		
		saltodelinea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean saltar = !areatexto.getLineWrap();
				
				areatexto.setLineWrap(saltar);
				
				if(saltar) {
					
					
					saltodelinea.setText("Quitar Salto");
				}
				else {
					
					saltodelinea.setText("Salto Linea");
				}
				
				
			}
		});
		
		panelbotones.add(saltodelinea);
		
		
		add(panelbotones,BorderLayout.SOUTH);
		
		//add(areatexto);
		add(panelsc,BorderLayout.CENTER);
		
		setVisible(true);
		
		
		
		
		
		
	}
	
		
	
	
}
