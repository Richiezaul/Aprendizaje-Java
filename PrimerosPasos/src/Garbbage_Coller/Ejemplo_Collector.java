package Garbbage_Coller;

public class Ejemplo_Collector {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Runtime r = Runtime.getRuntime();
		
		
		Empleado miEmpleado = new Empleado();
		
		miEmpleado.setNombre("Michael");
		
		System.out.println(miEmpleado.getNombre());
		
		System.out.println("The total Memory is " + r.totalMemory()/1024 + "Kb");
		
	     System.out.println("The free Memory is " + r.freeMemory()/1024 + "Kb");
	     
	     miEmpleado=null;
	     
	     r.gc();
	     
	     System.out.println("The total Memory is "+ (r.totalMemory()/1024) + "Kb");
	     
	     System.out.println("The free Memory is " + r.freeMemory()/1024 + "Kb");

	     
	     
		
		

	}

}


class Empleado{
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
	
}














































