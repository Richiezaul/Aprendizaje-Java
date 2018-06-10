package Practica1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.Border;

import com.sun.media.jfxmedia.events.NewFrameEvent;

class MarcoPratica1 extends JFrame{
	JPanel panelcuadricula ;
	JButton show;

	private PanelBottones paneltipo;
	private PanelBottones paneltipodemensaje;
	private PanelBottones panelmensaje;
	private PanelBottones panelconfirmar;
	private PanelBottones paneloptiones;
	private PanelBottones panelentrada;
	
	private String cadenademensaje= "Mensaje";
	private Icon iconomensaje= new ImageIcon("src/Practica1/Iconos/bola_roja.gif");
	private Object objectMensaje= new Date();
	private Component componentMensaje= new Panel_Ejemplo();
	
	public MarcoPratica1() {
		
		setLayout(new BorderLayout());
		
		show = new JButton("Show");
		
		show.addActionListener(new ActionMostrar());
		panelcuadricula = new JPanel();
		
		setBounds(150,200,600,450);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelcuadricula.setLayout(new GridLayout(2, 3));
		
		String tituloarray[] = {"Mensaje","Confirmar","Optiones","Entrada"};
		String tipodemensajearray[] = {"Error Mensaje","Informacion Mensaje","Warning Mensaje","Question Mensaje","Plain Mensaje"};
		String mensajearray[] = {"Cadena","Icono","Componentes","Otros", "Objects[]"};
		String confirmararray[] = {"Defaul Option","Yes_Not Option","Yes_Not_Cancel Option","Ok_Cancel Option"};
		String optionestituloarray[] = {"String[]","Icon[]","Object[]",};
		String entradaarray[] = {"Campo De Texto","Combo"};
		
		paneltipo = new PanelBottones("Tipo",tituloarray);
		paneltipodemensaje=new PanelBottones("Tipo Mensaje",tipodemensajearray);
		panelmensaje =new PanelBottones("Mensaje",mensajearray);
		panelconfirmar=new PanelBottones("Comfirmar",confirmararray);
		paneloptiones =new PanelBottones("Optiones",optionestituloarray);
		panelentrada=new PanelBottones("Entrada",entradaarray);
		
		
		
		panelcuadricula.add(paneltipo);
		panelcuadricula.add(paneltipodemensaje);
		panelcuadricula.add(panelmensaje);
		panelcuadricula.add(panelconfirmar);
		panelcuadricula.add(paneloptiones);
		panelcuadricula.add(panelentrada);
		
		JPanel panelbotonshow = new JPanel();
		
		panelbotonshow.add(show);
		
		
		
		add(panelcuadricula, BorderLayout.CENTER);
		
		add(panelbotonshow,BorderLayout.SOUTH);
		
		
		
		setVisible(true);
		
		
		
		
	}
	
	//-------------------------------------proporciona mesaje-------------------------------------------//
	
	
	public Object getmensaje() {
		
		
		
		String s= panelmensaje.getselection();
		
		if (s.equals("Cadena")) {
			
			return cadenademensaje;
			
		}
		
		else if (s.equals("Icono")) {
			
			return iconomensaje;
			
		}
		
		else if (s.equals("Componentes")) {
			
			return componentMensaje;
			
		}
		
		else if (s.equals("Otros")) {
			
			return objectMensaje;
		}
		
		if (s.equals("Objects[]")) {
			
			return new Object[] {
					cadenademensaje,
					iconomensaje,
					componentMensaje,
					objectMensaje
					
			};
			
				
		}
		
		else {
			
			return null;
		}
		
	}
	
	
	public int getType(PanelBottones panel) {
		
		
		String s = panel.getselection();
		
		if (s.equals("Error Mensaje")||s.equals("Yes_Not Option")) {
			
			return 0;
			
		}
		else if (s.equals("Informacion Mensaje")|| s.equals("Yes_Not_Cancel Option")) {
			
			
			return 1;
		}
		
		
		else if (s.equals("Warning Mensaje") || s.equals("Ok_Cancel Option")) {
			
			
			return 2;
		}
		
		else if (s.equals("Question Mensaje")) {
			
			
			return 3;
		}
		else if (s.equals("Plain Mensaje")||s.equals("Defaul Option")) {
			
			
			return -1;
		}
		
		else {
			return 0;
		}
		
		
	}
	///////Option input array object
	
	
	public Object[] getOption(PanelBottones panel) {
		
		
		String string= panel.getselection();
		
		if (string.equals("String[]")) {
			
			return new String[] {
					
					"Amarillo",
					"Azul",
					"Rojo"
					
			};
		}
			
			else if (string.equals("Icon[]")) {
				
				return new Object[] {
						new ImageIcon("Recursos/Copiar.gif"),
						new ImageIcon("Recursos/Cortar.gif"),
						new ImageIcon("Recursos/Pegar.gif")
				};
				
			}
		
		else if (string.equals("Object[]")) {
			
			return new Object[] {
					new ImageIcon("Recursos/Copiar.gif"),
					new ImageIcon("Recursos/Cortar.gif"),
					new ImageIcon("Recursos/Pegar.gif"),
					"Amarillo",
					"Azul",
					"Rojo"
			};
			
		}
		
	
			
	
			else {
				
			
		
		return null;
		
			}
	}
	
	
	
	
	private class ActionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//System.out.println(paneltitulo.getselection());
			
			
			if(paneltipo.getselection().equals("Mensaje")) {
				
				JOptionPane.showMessageDialog(MarcoPratica1.this, getmensaje(),"Titulo", getType(paneltipodemensaje), null);
				
			}
			
			else if (paneltipo.getselection().equals("Confirmar")) {
				

				JOptionPane.showConfirmDialog(MarcoPratica1.this, getmensaje(),"Titulo",getType(panelconfirmar), getType(paneltipodemensaje));
				
			}

			else if (paneltipo.getselection().equals("Optiones")) {
				

				JOptionPane.showOptionDialog(MarcoPratica1.this,getmensaje(), "Titulo", 0,getType(paneltipodemensaje) , null, getOption(paneloptiones), null);
				
				
				
			}

			else if (paneltipo.getselection().equals("Entrada")) {
	

				JOptionPane.showInputDialog(MarcoPratica1.this, getmensaje(),"Titulo", getType(paneltipodemensaje));
	
}
			
			
			
		}
		
		
		}
		
		class Panel_Ejemplo extends JPanel{
			
			
			
			
			
			
			
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);
				
				Graphics2D g2= (Graphics2D)g;
				
				
				Rectangle2D rectangle= new Rectangle2D.Double(0,0,getWidth(),getHeight());
				
				g2.setPaint(Color.yellow);
				
				g2.fill(rectangle);
				
			}
		
		
		
	
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
