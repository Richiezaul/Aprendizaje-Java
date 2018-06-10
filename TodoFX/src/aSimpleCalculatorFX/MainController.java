package aSimpleCalculatorFX;







import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;


public class MainController implements Initializable {
	
	@FXML
	private TextField result;
	private long number1= 0;
	private String operator="";
	
	private boolean start=true;
	
	ModelClass model= new ModelClass();
	
	
	@FXML
	public void processNumber(ActionEvent event) {
		
		if (start) {
			
			result.setText("");
			start=false;
				
		}
		String value= ((Button)event.getSource()).getText();
		
		result.setText(result.getText() + value);
		
	}

	@FXML
	public void processOperators(ActionEvent event) {
		
		String value= ((Button)event.getSource()).getText();
		
		if (!value.equals("=")) {
			
			if (!operator.isEmpty()) {
				
				return;
			}
				
				operator=value;
				number1=Long.parseLong(result.getText());
				result.setText("");
		
		}
		else {
			
			if (operator.isEmpty()) {
				
				return;
			
			}
			
			long number2=Long.parseLong(result.getText());
			float output=model.Calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			operator ="";
			start=true;
		}
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		result.setOnKeyTyped(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				// TODO Auto-generated method stub
				
				
				if (result.getText().length()==12) {
					
					
					result.setEditable(false);
				}
				
				char caract = event.getCharacter().charAt(0);
				
				if(Character.isLetter(caract)|| Character.isSpaceChar(caract)) {
					
					event.consume();
					
					
					
				}
				
			}
		});
		
		
		
	}
	
}

















































