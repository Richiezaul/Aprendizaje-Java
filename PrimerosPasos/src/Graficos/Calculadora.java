package Graficos;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Calculadora {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora calculadora= new MarcoCalculadora();

	}

}

class MarcoCalculadora extends JFrame{
	
	
	public MarcoCalculadora() {
		
		
		setTitle("CaLculadora");
		setBounds(400,200,300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelCalculadora panel = new PanelCalculadora();
		add(panel);
		//pack();
		//setResizable(false);
//		Image imagen=null;
//		
//		try {
//			 imagen = ImageIO.read(new File("Iconos/calculadora.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		setIconImage(imagen);
		setVisible(true);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}


class PanelCalculadora extends JPanel{
	
	JPanel panel2;
	
	JButton pantalla;
	
	private boolean principio;
	
	private double resultado;
	
	private String ultimaoperacio;
	
	public PanelCalculadora() {
		
		principio=true;
		
		setLayout(new BorderLayout());
		
		 pantalla = new JButton("0");
		pantalla.setEnabled(false);
		
		add(pantalla,BorderLayout.NORTH);
		
		 panel2 = new JPanel();
		
		panel2.setLayout(new GridLayout(4,5,5,5));
		
		ActionListener inserta= new InsertaNumero();
		ActionListener orden = new AccionOrden();
		ActionListener borrar= new BorrarPantalla();
		
		ponerbotton("7",inserta);
		ponerbotton("8",inserta);
		ponerbotton("9",inserta);
		ponerbotton("/",orden);
		ponerbotton("%",null);
		ponerbotton("4",inserta);
		ponerbotton("5",inserta);
		ponerbotton("6",inserta);
		ponerbotton("*",orden);
		ponerbotton("CE",borrar);
		ponerbotton("1",inserta);
		ponerbotton("2",inserta);
		ponerbotton("3",inserta);
		ponerbotton("-",orden);
		ponerbotton("+",orden);
		ponerbotton(".",inserta);
		ponerbotton("0",inserta);
		ponerbotton("=",orden);
		
//		ponerbotton("");
//		ponerbotton("");
		
		ultimaoperacio="=";
		

	   
	   add(panel2,BorderLayout.SOUTH);	
		
	}
	
	
	private void ponerbotton(String rotulo, ActionListener oyente){
		
		
		JButton botton= new JButton(rotulo);
		
		botton.addActionListener(oyente);
		
		panel2.add(botton);
		
		
		
		
	}
	
	
//	class interna///////////////////////////////////////
	private class InsertaNumero implements ActionListener{

		
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			
			String entrada = e.getActionCommand();
			
			
			
			if(principio){
				
				
				pantalla.setText("");
				
				principio=false;
				
			}
			pantalla.setText(pantalla.getText()+ entrada);
			
			
			
			
		}
		
		
		
		

		
	}
	
	///class interna/////////////////////////////////////////////////////////////
	
	 class AccionOrden implements ActionListener{
		
		
		
		public void actionPerformed(ActionEvent e) {
			
			String operacion= e.getActionCommand();
			//System.out.println(operacion);
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaoperacio=operacion;
			
			
			principio = true;
			
		}
		
		
		public void calcular(double x){
			
			
			if(ultimaoperacio.equals("+")){
				
				
				resultado+=x;
				
				//System.out.println(resultado);
			}
			else if(ultimaoperacio.equals("*")){
				
				
				resultado*=x;
				
				
			}	
			else if(ultimaoperacio.equals("/")){
				
				
				resultado/=x;
				
				
			}			
			else if(ultimaoperacio.equals("-")){
				
				
				resultado-=x;
				
				
			}
			
			else if(ultimaoperacio.equals("=")){
				
				
				resultado=x;
				
				
			}
			



			
			pantalla.setText(""+ resultado);
			
			
				
			
		}
		
		
	
		
	}
	
private class BorrarPantalla implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		ultimaoperacio="=";
//		
//		pantalla.setText("0");
		
		
//		
		
		principio= true;
		
		
		
		
		if(principio){
			
			
			pantalla.setText("");
			
			
			
		}
		pantalla.setText("0");
		
		
		
		
	}
	
	
	
	
	
	
	
}
	
	
	
	
}

