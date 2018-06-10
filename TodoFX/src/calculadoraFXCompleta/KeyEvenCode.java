package calculadoraFXCompleta;

import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class KeyEvenCode {
	
	
	

	public static void pressedKeyP(KeyEvent eke,Label screen,boolean start) {
		
		switch (eke.getCode()) {
		
		
		
		case NUMPAD1:
			
			if (start) {
				
				screen.setText("");
					
			}
			
			screen.setText(screen.getText() + "1");
			
			
			break;
			
		
		case NUMPAD2:
			
			if (start) {
				
				screen.setText("");
				
					
			}
			
			screen.setText(screen.getText() + "2");
			
			
			break;
			
		case NUMPAD3:
		
		if (start) {
			
			screen.setText("");
			
				
		}
		
		screen.setText(screen.getText() + "3");
		
		break;	
		
		
		case NUMPAD4:
			
			if (start) {
				
				screen.setText("");
				
					
			}
			
			screen.setText(screen.getText() + "4");
			
			
			break;	
			
		case NUMPAD5:
				
				if (start) {
					
					screen.setText("");
					
						
				}
				
				screen.setText(screen.getText() + "5");
				
				
				break;	
				
		case NUMPAD6:
					
					if (start) {
						
						screen.setText("");
						
							
					}
					
					screen.setText(screen.getText() + "6");
					
					
					break;	
					
		case NUMPAD7:
						
			if (start) {
						
				screen.setText("");
							
										
			}
						
			screen.setText(screen.getText() + "7");
						
						break;	
						
		case NUMPAD8:
							
			if (start) {
											
				screen.setText("");
														
						
			}
							
						
			screen.setText(screen.getText() + "8");
											
			break;	
							
		case NUMPAD9:
								
			if (start) {
									
				screen.setText("");
									
										
			}
								
			screen.setText(screen.getText() + "9");
								
								
			break;
		
		case NUMPAD0:
			
			if (start) {
									
				screen.setText("");
									
										
			}
								
			screen.setText(screen.getText() + "0");
								
								
			break;
			
		case DECIMAL:
			
			if (start) {
									
				screen.setText("");
									
										
			}
								
			screen.setText(screen.getText() + ".");
								
								
			break;

								
//////////////////////////////////	/////Operadores/////////////////////////////////////////////
		}
		

}
	
	
	public static void OperaradoresPressed(KeyEvent ek,double resultado1,double number2,String div0,Label screen) {
		
		
	switch (ek.getCode()) {
	


	case ADD:

 
		resultado1+= number2;
 

		break;


	case SUBTRACT:

 
		resultado1 -= number2;
 

		break;


	case MULTIPLY:

 
		resultado1*= number2;
 
 
		break;
 


	case DIVIDE:


		if(resultado1==0 || number2==0 ) {
	
	
			resultado1= 0;
	
	
			div0=" No Division By ";
	

		}


		if(resultado1!=0 && number2!=0) {

			resultado1/= number2;

		}

		break;


			


	case ENTER:

		resultado1=number2;


}


	screen.setText(div0+ resultado1);

	div0="";


}



		
	}
	


























































