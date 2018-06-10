package Graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConSlider marco = new MarcoConSlider();

	}

}

class MarcoConSlider extends JFrame{
	
	
	public MarcoConSlider() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelConSlider panel = new PanelConSlider();
		
		add(panel);
		
		setVisible(true);
		
		
		
		
	}
	
		
	
	
}


class PanelConSlider extends JPanel{
	
	JSlider slider; 
	JLabel texto;
	private static int contador=0;
	
	public PanelConSlider() {
		
		setLayout(new BorderLayout());
		
		

		slider = new JSlider(10,50,12);
		
		texto = new JLabel("Lacapoida y la capoida y mama ,mama,mama");
		
		add(texto,BorderLayout.CENTER);
		
		
		
		//slider.setOrientation(SwingConstants.VERTICAL);
		
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(5);
		//slider.setMaximum(100);
		
		slider.setPaintTicks(true);
		
		slider.setFont(new Font("Consolas", Font.ITALIC, 10));
		
		slider.setPaintLabels(true);
		
		//slider.setSnapToTicks(true);
	  //  slider.setInverted(true);
		
		//slider.setExtent(100);
		
	//	slider.setPaintTrack(false);
		
		JPanel panelSlider = new JPanel();
		
		panelSlider.add(slider);
		
		add(panelSlider,BorderLayout.NORTH);
		
		slider.addChangeListener(new EventoSlider());
		
		
		
	}
	
	
	private class EventoSlider implements ChangeListener{

		
		
		@Override
		public void stateChanged(ChangeEvent e) {
			
			
			//System.out.println("manipulando el slider  " + slider.getValue());
			
			texto.setFont(new Font("Arial",Font.PLAIN,slider.getValue()));
			
		}
		
		
		
		
		
		
		
	}
	

}

















