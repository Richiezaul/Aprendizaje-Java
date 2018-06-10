package vista;

import java.awt.*;

import javax.swing.*;

import controlador.Controlador_Carga_Paises;
import controlador.Controlador_Carga_Secciones;
import modelo.Controlador_Button;

public class Marco_Aplicacion_2 extends JFrame {
	
	
	public Marco_Aplicacion_2() {
		// TODO Auto-generated constructor stub
	
	setTitle ("Consulta BBDD");
	
	setBounds(500,80,500,650);
	
	setLayout(new BorderLayout());
	
	JPanel menus=new JPanel();
	
	menus.setLayout(new FlowLayout());
	
	secciones=new JComboBox();
	
	secciones.setEditable(false);
	
	secciones.addItem("Todos");
	
	paises=new JComboBox();
	
	paises.setEditable(false);
	
	paises.addItem("Todos");
	
	resultado= new JTextArea(4,50);
	
	resultado.setEditable(false);
	
	lSeccion= new JLabel("Seccion");
	
	lPais= new JLabel("Pais");
	
	add(resultado);
	
	menus.add(lSeccion);
	
	menus.add(secciones);
	
	menus.add(lPais);
	
	menus.add(paises);	
	
	add(menus, BorderLayout.NORTH);
	
	add(resultado, BorderLayout.CENTER);
	
	JButton botonConsulta=new JButton("Consulta");
	
	add(botonConsulta, BorderLayout.SOUTH);
	
	botonConsulta.addActionListener(new Controlador_Button(this));
	
	addWindowListener(new Controlador_Carga_Secciones(this));
	
	addWindowListener(new Controlador_Carga_Paises(this));
	
	}
	
	
	
	public JComboBox secciones;
	
	public JComboBox paises;
	
	public JTextArea resultado;	
	
	private JLabel lSeccion;
	
	private JLabel lPais;
}
