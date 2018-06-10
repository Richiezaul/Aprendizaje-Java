package javaFX_Property_PropertyTexto;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class MainController implements Initializable {




@FXML
private Label label;

//@FXML
//private ProgressBar pb;

@FXML
private ProgressIndicator pi;

@FXML
private TextField field;

@FXML

ProgressIndicator pb;





@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	


	field.textProperty().addListener(new ChangeListener<Object>() {

		@Override
		public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
			// TODO Auto-generated method stub
			
			
			label.textProperty().bind(field.textProperty());
			pb.progressProperty().bind(field.textProperty().length());
			
		}
	});
	
	
}

	
	
}










































































