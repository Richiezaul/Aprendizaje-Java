package calculadoraJavaFX;

import javafx.scene.control.Label;

public class CalculateCode {
	
	public  void Calculate(double number2,double resultado,String div0,String operator,Label screen) {
		
		switch (operator) {
		case "+":
			
			 resultado+= number2;
			 
			 break;
			
		case "-":
			
			 resultado -= number2;
			 
			 break;
			
		case "*":
			
			 resultado*= number2;
			 
			 break;
			 
			
		case "/":
			if(resultado==0 || number2==0 ) {
				
				resultado= 0;
				
				div0=" No Division By ";
				
			}
			
			if(resultado!=0 && number2!=0) {
			resultado/= number2;
			}
			break;
			
		case "%":	
		
		if (resultado!=0) {
			
		
		resultado*=number2/100;
		
		}
		
		else {
			
			resultado=number2;
		}
		
		
		break;
			
		default:
			resultado=number2;
			
			
		}
		
		screen.setText(div0+ resultado);
		div0="";
		
		
	}
	
	


}
