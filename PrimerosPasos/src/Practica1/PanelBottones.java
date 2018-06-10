package Practica1;

import java.awt.*;

import javax.swing.*;

class PanelBottones extends JPanel{
	
 
	ButtonGroup grupo;
	
	public PanelBottones(String title, String[] optiones ) {
		
		
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));

		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		 grupo = new ButtonGroup();
		
		for(int i = 0; i<optiones.length;i++) {
			
			JRadioButton bot = new JRadioButton(optiones[i]);
			
			bot.setActionCommand(optiones[i]);
			
			grupo.add(bot);
			
			bot.setSelected(i==0);
			add(bot);
		}
		
		
	}
	
	public String getselection() {
		
		ButtonModel miboton= grupo.getSelection();
		
		String s = miboton.getActionCommand();
		
		return s;
		
		
		
		
	}
	
	
	
}




























