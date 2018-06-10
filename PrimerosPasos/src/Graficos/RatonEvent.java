package Graficos;


import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RatonEvent {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConRaton mimarcoR= new MarcoConRaton();
		

	}

}

class MarcoConRaton extends JFrame{
	
	
	public MarcoConRaton() {
		
		setBounds(150,200,450,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//PanelContx2 panel = new PanelContx2();
		
		//add(panel);
		
		setVisible(true);
		
		addMouseMotionListener( new EventoDeRaton());
		
		
		
		
	}
	
		
	
	



private class PanelConRaton extends JPanel{
	
	
	
	public PanelConRaton() {
		

		
		
		
		
	}
	

}

 class EventoDeRaton implements MouseMotionListener{
	 
	 int x;
	 int y;

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		x=e.getX();
		y=e.getY();
		
		
		System.out.println(x );
		System.out.println(y );
		
	}

	
	
	
	
	
	
	
}
}
	








































