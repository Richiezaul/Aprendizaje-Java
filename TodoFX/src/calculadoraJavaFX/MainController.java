package calculadoraJavaFX;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label screen;
	@FXML
	private Label mScreen;
	
	private double resultado;
	private double mvalue=0;
	
	private String operator="";
	private String div0= "";
	
	private boolean start=true;
	
	CalculateCode Inv= new CalculateCode();
	
	
	
	
	
	@FXML
	public void processNumber(ActionEvent event) {
		
		if (start) {
			
			screen.setText("");
			start=false;
				
		}
		String value= ((Button)event.getSource()).getText();
		
		screen.setText(screen.getText() + value);
		
		
		
	}

	@FXML
	public void processOperators(ActionEvent event) {
		
		String value= ((Button)event.getSource()).getText();
//		
//		Button button = ((Button) event.getSource());
		
		
		
		
		Inv.Calculate(Double.parseDouble(screen.getText()), resultado, div0, operator, screen);
		
		operator=value;
	
		start=true;
		
		
	}
			
			

	
	
	
	public void borrarTodo() {
		
		start=true;
		
		if (start) {
			
			screen.setText("");
			
		}
		
		screen.setText("0");
		
		operator="";
		
		
		
		
	}
	
	public void operatorAdv(ActionEvent event) {
		
		String value= ((Button)event.getSource()).getText();
		
		double x=Double.parseDouble(screen.getText());
		
		if(value.equals("Raiz")) {
			
			x= Math.sqrt(x);
			
					
					}
		
		else if(value.equals("±")) {
			
			x*=-1;
			
		}
		
		else if (value.equals("1/x")) {
			
			x= (1/x);
			
		}
				
		
		Inv.Calculate(x, resultado, div0, operator, mScreen);
		
		
		
		
		
	}
	
	public void borrarOneByOne() {
		
		
		
		if(screen.getText().length()!=0) {
			
			
			screen.setText(screen.getText().substring(0,screen.getText().length()-1));
		
	}
		
		if (screen.getText().equals("")) {
			
			screen.setText("0");
			
		}
		
		start=true;

		
	}
	
	
	public void MC () {
		
		mvalue=0;
		mScreen.setText("");
		
		
		start=true;
		
	}
	
	public void MR () {
		
		String aString = String.valueOf(mvalue);
		screen.setText(aString);
		
		start=true;
		
	}
	public void MS () {
		
		mvalue= Double.parseDouble(screen.getText());
		
		if (mvalue==0) {
			mScreen.setText(" ");
		}
		
		else {
			mScreen.setText("M");
		}
		
		start=true;
		
		
		
	}
	public void MPlus () {
		
		double mplu = Double.parseDouble(screen.getText());
		
		mvalue +=mplu;
		
		mScreen.setText("M");
		
		start=true;
		
	}
	public void Mminus () {
		
	double minus = Double.parseDouble(screen.getText());
		
		mvalue -=minus;
		
		mScreen.setText("M");
		
		start=true;
		
	}
		
}



















































