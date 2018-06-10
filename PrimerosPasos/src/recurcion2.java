
public class recurcion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new recurcion2().factorial(2));
		
		
	}
	
	
	
	public int factorial(int n) {
		
		if(n==0){
			
			return 1;
		}else {
			
			return factorial(n-1) * n;
			
		}
		
		
		
	}

}
