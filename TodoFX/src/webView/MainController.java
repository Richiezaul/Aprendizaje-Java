package webView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable {
	
	@FXML
	
	private WebView webView;
	
	private WebEngine engine;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		engine= webView.getEngine();
		
		
		
		
	}
	
	public void btn1() {
		
		engine.load("http://www.google.com.do");
			
	}
	public void btn2() {
		
		engine.executeScript("window.location = \"http://easyonlineconverter.com//\";");
			
	}
	
	public void btn3() {
		
		engine.loadContent("<html><body><h1>Hello World</h1></body></html>");
			
	}
	
	public void btn4() {
		
		engine.reload();
		
		
			
	}

}
