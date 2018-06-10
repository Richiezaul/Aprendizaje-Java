package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> Paises=new LinkedList<String>();
		
		Paises.add("Espana");
		Paises.add("Colombia");
		Paises.add("Mexico");
		Paises.add("Peru");
		
		LinkedList<String> Capitales=new LinkedList<String>();
		
		Capitales.add("Madrid");
		Capitales.add("Bogota");
		Capitales.add("DF");
		Capitales.add("Lima");
		
		ListIterator<String> itP= Paises.listIterator();
		
		ListIterator<String> itC= Capitales.listIterator();
		
		while (itC.hasNext()) {
			
			if (itP.hasNext()) {
				
				
				itP.next();
				
			}
			
			itP.add(itC.next());
			
		}
		
		System.out.println(Paises);
		
		itC=Capitales.listIterator();
		
		while (itC.hasNext()) {
			
			itC.next();
			
			if (itC.hasNext()) {
				
				itC.next();
				
				itC.remove();
				
			}
			
		}
		
		System.out.println(Capitales);
		
		
		Paises.removeAll(Capitales);
		
		System.out.println(Paises);
		
		
	}
	

}

















































