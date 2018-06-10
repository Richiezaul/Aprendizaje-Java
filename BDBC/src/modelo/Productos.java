package modelo;

public class Productos {
	
	
	private String nArticulo;
	
	private String seccion;
	
	private String precio;
	
	
	public Productos() {
		// TODO Auto-generated constructor stub
		
		
		nArticulo ="";
		
		seccion="";
		
		precio="";
		
		pOrigen="";
	}
	
	
	
	
	public String getnArticulo() {
		return nArticulo;
	}

	public void setnArticulo(String nArticulo) {
		this.nArticulo = nArticulo;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getpOrigen() {
		return pOrigen;
	}

	public void setpOrigen(String pOrigen) {
		this.pOrigen = pOrigen;
	}

	private String pOrigen;
	


}
