package javaFX_Property_applicationBIdirect;

import java.net.URL;
import java.text.Format;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class MainController implements Initializable {
	
	@FXML
	TextField field;
	@FXML
	Slider slider;
	
	public static final double Value=50;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		field.setText(new Double(Value).toString());
		
		slider.setValue(Value);
		
		field.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
		
		
		
		
		
	}

}


































































