package Graficos;

import java.awt.*;
import javax.swing.*;

public class Spinner {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConSpinner marco = new MarcoConSpinner();

	}

}

class MarcoConSpinner extends JFrame{
	
	
	public MarcoConSpinner() {
		
		setTitle("Spinners");
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelConSpinner panel = new PanelConSpinner();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelConSpinner extends JPanel{
	
	JSpinner control;
	
	public PanelConSpinner() {
		
		//String lista [] = {"Enero", "Febrero", "Marzo", "Abril"};
		
		String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		control = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			@Override
			public Object getNextValue() {
				// TODO Auto-generated method stub
				return super.getPreviousValue();
				
			}

			@Override
			public Object getPreviousValue() {
				// TODO Auto-generated method stub
				return super.getNextValue();
			}
			
		});
		
		Dimension tamano = new Dimension(200, 20);
		
		control.setPreferredSize(tamano);
		
		add(control);
		
		
		
		
	}
	
	
//	private class MiModeloSpinner extends SpinnerNumberModel{
//		
//		
//		public MiModeloSpinner() {
//			
//			super(5,0,10,1);
//			
//			
//		}
//
//		@Override
//		public Object getNextValue() {
//			// TODO Auto-generated method stub
//			return super.getPreviousValue();
//			
//		}
//
//		@Override
//		public Object getPreviousValue() {
//			// TODO Auto-generated method stub
//			return super.getNextValue();
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//	}

}

