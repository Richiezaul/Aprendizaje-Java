package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		
		personal.put("145", new Empleado("Manuel"));
		personal.put("146", new Empleado("Rodolfo"));
		personal.put("147", new Empleado("Marcos"));
		personal.put("148", new Empleado("Pepe"));
		personal.put("149", new Empleado("Miosotis"));
		
		
		System.out.println(personal);
		
		personal.remove("147");
		
		System.out.println(personal);
		
		personal.put("148", new Empleado("Natalia"));
		
		System.out.println(personal);
		
		System.out.println(personal.entrySet());
		
		
		
		for (Map.Entry<String, Empleado> entrada : personal.entrySet()) {
			
			
			String clave= entrada.getKey();
			
			Empleado valor= entrada.getValue();
			
			System.out.println("Clave= " + clave + " Valor= " + valor);
			
			
			
			
		}

	}

}


class Empleado{
	
	private String name;
	
	private double sueldo;
	
	
	public Empleado(String n) {
		
		
		name=n;
		
		sueldo=2000;
	}
	
	@Override
	public String toString() {
		
		return "[Nombre = " + name + ",Sueldo = " + sueldo +
				"]";
	}
}
























