package loginFX;



import java.net.URL;
import java.util.ResourceBundle;

import javax.security.auth.login.LoginContext;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MainController implements Initializable {
	
	@FXML
	private Label lblogin = new Label();
	
	@FXML
	private Label lbstatus = new Label();
	
	@FXML
	private TextField username = new TextField();
	
	@FXML
	private TextField password = new TextField();
	
    Main xMain= new Main();
    
	
	
	public void Login(ActionEvent event) throws Exception {
		
		
		if (username.getText().equals("user") && password.getText().equals("pass")) {
			
			
			lbstatus.setText("Login Success");
			
			Stage Stage = new Stage();
			Parent root =FXMLLoader.load(getClass().getResource("/application/MainFX.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage.setScene(scene);
			Stage.show();
			
			xMain.Cstage.close();
			
			
		}
		
		else {
			lbstatus.setText("Login Fail");
			
			Alert otravez = new Alert(AlertType.INFORMATION,"Wrong Info Try Again",ButtonType.NO,ButtonType.YES);
			
			username.setStyle("-fx-border-color: red");
	
			otravez.showAndWait();
			
			if (otravez.getResult() == ButtonType.NO) {
				System.out.println("lalalalalala");
			}
			
			
//			
//			Alert alert = new Alert(AlertType.CONFIRMATION, "Delete " +"klk"+ " ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
//			alert.showAndWait();
//
//			if (alert.getResult() == ButtonType.YES) {
//			    System.out.println("klk");
//			}
				
			
			
			
			
			
			
			
			
		}
		
	}
	
	
	public void key() {
		
		
		
		
	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		password.setStyle("-fx-border-width: 50%");
		
		username.setStyle("-fx-border-width: 50%");
		
		//username.focusedProperty().addListener(new Foc);
		
		username.setOnKeyTyped(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				// TODO Auto-generated method stub
				
				char car = event.getCharacter().charAt(0);
				
				
				if (!Character.isLetter(car) || Character.isSpaceChar(car)) {
					
					event.consume();
					
				}
				
			}
			
			
			
			
		});
		
		
		
		
	}

	
	

}










































