package aSimpleCalculatorFX;

public class ModelClass {
	
	
	public float Calculate(long number1,long number2,String operator) {
		
		switch (operator) {
		case "+":
			
			return number1 + number2;
			
		case "-":
			
			return number1 - number2;
			
		case "*":
			
			return number1 * number2;
			
		case "/":
			if(number1==0 || number2==0 ) {
				
				return 0;
			}
			return number1 / number2;
			
		default:
			return 0;
		}
		
		
		
		
	}

}