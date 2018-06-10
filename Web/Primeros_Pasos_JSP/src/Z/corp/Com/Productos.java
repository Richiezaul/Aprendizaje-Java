package Z.corp.Com;

public class Productos {
	
	private String codigo_Articulo;
	private String seccion;
	private String nombre_Articulo;
	private String precio;
	private String fecha;
	private String importado;
	private String pais_origen;
	public Productos(String codigo_Articulo, String seccion, String nombre_Articulo, String precio, String fecha,
			String importado, String pais_origen) {
		super();
		this.codigo_Articulo = codigo_Articulo;
		this.seccion = seccion;
		this.nombre_Articulo = nombre_Articulo;
		this.precio = precio;
		this.fecha = fecha;
		this.importado = importado;
		this.pais_origen = pais_origen;
	}
	public String getCodigo_Articulo() {
		return codigo_Articulo;
	}
	public void setCodigo_Articulo(String codigo_Articulo) {
		this.codigo_Articulo = codigo_Articulo;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getNombre_Articulo() {
		return nombre_Articulo;
	}
	public void setNombre_Articulo(String nombre_Articulo) {
		this.nombre_Articulo = nombre_Articulo;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getImportado() {
		return importado;
	}
	public void setImportado(String importado) {
		this.importado = importado;
	}
	public String getPais_origen() {
		return pais_origen;
	}
	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}
	
	
	

}
