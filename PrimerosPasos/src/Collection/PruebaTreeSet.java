package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class PruebaTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		TreeSet<String> ordenaPersonas= new TreeSet<String>();
//		
//		ordenaPersonas.add("Sandra");
//		ordenaPersonas.add("Amanda");
//		ordenaPersonas.add("Diana");
//		
//		for (String e : ordenaPersonas) {
//			
//			System.out.println(e);
//			
//		}

		Articulo primero = new Articulo(1, "Primer Articulo");
		
		Articulo segundo = new Articulo(200, "Segundo Articulo");
		
		Articulo tercero = new Articulo(3, "Este es Tercer Articulo");
		
		TreeSet <Articulo> ordenarArticulos= new TreeSet<Articulo>();
		
		
		ordenarArticulos.add(tercero);
		ordenarArticulos.add(segundo);
		ordenarArticulos.add(primero);
		
		for (Articulo art : ordenarArticulos) {
			
			
			System.out.println(art.getDescription());
			
		}
		
		
		//Comparador_Articulo comparador_Articulo= new Comparador_Articulo();
		
		
	
//		Articulo comparadorarticulo= new Articulo();
//		
		TreeSet<Articulo> ordenaArticulos2= new TreeSet<Articulo>(new Comparator<Articulo>() {

			@Override
			public int compare(Articulo o1, Articulo o2) {
				// TODO Auto-generated method stub
				String descripcionA= o1.getDescription();
				
				String descripcionB= o2.getDescription();
				
				return descripcionA.compareTo(descripcionB);
			}
		});
//		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		for (Articulo art : ordenaArticulos2) {
			
			
			System.out.println(art.getDescription());
			
		}
		
		
		
	}

	

}

class Articulo implements Comparable<Articulo>{
	
	private int numero_articulo;
	
	private String description;
	

	
	public Articulo(int num ,String desc) {
		
		numero_articulo=num;
		description=desc;
		
		
	}
	
	
	
	
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo -o.numero_articulo;
	}




	public int getNumero_articulo() {
		return numero_articulo;
	}




	public void setNumero_articulo(int numero_articulo) {
		this.numero_articulo = numero_articulo;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}





	
	
	
	
	
	
}


class Comparador_Articulo implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		
		String descripcionA= o1.getDescription();
		
		String descripcionB= o2.getDescription();
		
		return descripcionA.compareTo(descripcionB);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


