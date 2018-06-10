package javaFX_Property;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class MainController implements Initializable {


final MyNumbre myNun= new MyNumbre();

@FXML
private Label label;

@FXML
private ProgressBar pb;

@FXML
private ProgressIndicator pi;



@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
	myNun.setNumber(0);
	
	myNun.numberProperty().addListener(new ChangeListener<Object>() {

		@Override
		public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
			// TODO Auto-generated method stub
			
			pb.progressProperty().bind(myNun.numberProperty());
			pi.progressProperty().bind(myNun.numberProperty());
			
		}
	});
}

public void BtnClickUp(ActionEvent event) {
	
	
	myNun.setNumber(myNun.getNumber()+ 0.1);
	
	
	
}

public void BtnClickDownd(ActionEvent event) {
	
	
	myNun.setNumber(myNun.getNumber()- 0.1);
	
	
	
}







}


































































