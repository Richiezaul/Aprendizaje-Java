package jsp_Methos;

public class Verifica_Par_Or_impar {
	
	public boolean par(int n) {
		
		if (n==0) {
			
			return true;
		}
		else {
			
			return impar(n-1);
		}
		
	}
	
	
	public boolean impar(int n) {
		
		if (n==0) {
			
			return false;
		}
		else {
			
			return par(n-1);
		}
		
	}

}
