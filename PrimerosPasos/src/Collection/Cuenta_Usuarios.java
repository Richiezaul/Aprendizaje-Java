package Collection;

import java.util.*;

public class Cuenta_Usuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente cl1= new Cliente("Antonio Banderas", "00001", 200000);
		
		Cliente cl2= new Cliente("Rafael Nadal", "00002", 250000);
		
		Cliente cl3= new Cliente("Penelope Cruz", "00003", 300000);
		
		Cliente cl4= new Cliente("Julio Iglesia", "00004", 400000);

		Cliente cl5= new Cliente("Antonio Banderas", "00007", 200000);
		
		Set<Cliente> clientesBanco= new HashSet<Cliente>();
		
		
		TreeSet<Cliente> ordenaCliente= new TreeSet<Cliente>(new Comparator<Cliente>() {

			@Override
			public int compare(Cliente o1, Cliente o2) {
				// TODO Auto-generated method stub
				String n_Cuenta1 =o1.getN_cuenta();
				
				String n_Cuenta2 =o2.getN_cuenta();
				
				return n_Cuenta1.compareTo(n_Cuenta2);
			}
		});
		
		
		ordenaCliente.add(cl1);
		ordenaCliente.add(cl2);
		ordenaCliente.add(cl3);
		ordenaCliente.add(cl4);
		ordenaCliente.add(cl5);
		
		for (Cliente cliente : ordenaCliente) {
			
			System.out.println(cliente.toString());
			
		}
		
		
		
		
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		

		
		Iterator<Cliente> it = clientesBanco.iterator();
		
		while (it.hasNext()) {
			
			String nombre= it.next().getNombre();
			
			if (nombre.equals("Julio Iglesia")) {
				
				it.remove();
				
			}
			
			
			
		}
		
		for (Cliente cliente : clientesBanco) {
			
			
			//System.out.println(cliente.getNombre() + " " +cliente.getN_cuenta() + " " + cliente.getSaldo() );
			
		}
	
		

	}

}








































