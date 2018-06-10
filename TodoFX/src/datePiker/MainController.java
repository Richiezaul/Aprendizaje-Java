package datePiker;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML private DatePicker picker;
	
	@FXML private Label label;
	
	
	public void ShowDate(ActionEvent event) {
		
		LocalDate Time= picker.getValue();
		
		label.setText(Time.toString());
		
		
		System.out.println(Time.toString());
		
		
		
		
		
		
		
	}

}
