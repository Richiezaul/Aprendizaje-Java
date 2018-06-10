package menuBar;


import java.net.URL;
import java.util.ResourceBundle;



import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class MainController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}
	
	public void CloseApp(ActionEvent event) {
		
		
		MenuItem sItem =(MenuItem) event.getSource();
		
		String s = sItem.getText();
		
		
		
				
		
		
		if (s.equals("Save")) {
			
			System.out.println("Funciona");
			
		}
		
		
//		Platform.exit();
//		System.exit(0);
		
	}
	
	
	

}
















































































































