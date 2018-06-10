package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;


public class Menudesplegables {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcodesplegable marco = new Marcodesplegable();
		

	}

}

class Marcodesplegable extends JFrame{
	
	
	public Marcodesplegable() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Paneldesplegable panel = new Paneldesplegable();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class Paneldesplegable extends JPanel{
	
	JTextPane textpane;
	
	public Paneldesplegable() {
		
		setLayout(new BorderLayout());
		

		textpane= new JTextPane();
		
		JPopupMenu popupmenu= new JPopupMenu("Opciones");
		
		JMenuItem Option1 = new JMenuItem("redbackground");
		JMenuItem Option2 = new JMenuItem("Option2");
		JMenuItem Option3 = new JMenuItem("Option3");
		JMenuItem Option4 = new JMenuItem("Option4");
		JMenuItem Option5 = new JMenuItem("Option5");
		JMenuItem Option6 = new JMenuItem("Option6");
		
		popupmenu.add(Option1);
		popupmenu.add(Option2);
		
		
		
		popupmenu.addSeparator();
		
		popupmenu.add(Option3);
		popupmenu.add(Option4);
		popupmenu.add(Option5);
		popupmenu.add(Option6);
		
		popupmenu.setBackground(Color.darkGray);
		
		Option1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				textpane.setBackground(Color.red);
				
			}
		});
		
		Option2.addActionListener(new StyledEditorKit.BoldAction());
		
		
		JToolBar barra = new JToolBar();
		
		JMenu max= new JMenu();
		max.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new Font("arial", Font.BOLD,10);
				
			}
		});
		
		JButton surayar =new JButton(new ImageIcon("src/Graficos/Salir.gif"));
		
		surayar.addActionListener(new StyledEditorKit.UnderlineAction());
		
		barra.add(surayar);
		
		barra.setOrientation(1);
		
		add(barra, BorderLayout.WEST);
		
		
		
		textpane.setComponentPopupMenu(popupmenu); 
		
		add(textpane,BorderLayout.CENTER);
		
		
		
	}

}






































