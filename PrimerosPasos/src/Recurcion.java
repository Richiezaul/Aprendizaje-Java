import javafx.scene.ParallelCamera;

public class Recurcion {
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(new Recurcion().par(85));
		
		
		
	}
	
	
	
	public boolean par(int numero) {
		
		if (numero==0) {
			
			return true;	
			
		}else {
			
			return impar(numero-1);
		}	
		
	}
	
	
	public boolean impar(int numero) {
		
		if(numero==0){
			
			return false;
			
		}
		
		else {
			return par(numero-1);
		}
		
		
	}
	
	

}


