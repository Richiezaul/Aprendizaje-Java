package Collection;

import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> persona= new LinkedList<String>();
		
		
		persona.add("Pepe");
		
		persona.add("Sandra");
		
		persona.add("Ana");
		
		persona.add("Laura");
		
		System.out.println(persona.size());
		

		//Collections.sort(persona);
		
		ListIterator<String> it = persona.listIterator();
		
		it.next();
		
		it.add("Juan");
		
		for (String personas : persona) {
			
			System.out.println(personas);
			
			
			
		}
		

	}

}
