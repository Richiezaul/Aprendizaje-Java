package calculadoraFXCompleta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

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
	
	@FXML 
	private Label abouttext;
	
	Stage aboutStage;
	
	String line;
	
	
	
	
	
	
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
		
		
		
		
		Calculate(Double.parseDouble(screen.getText()));
		
		operator=value;
	
		start=true;
		
		
	}
			
			

	public void Calculate(double number2) {
		
		
				
				switch (operator) {
				case "+":
					
					 resultado+= number2;
					 
					 break;
					
				case "-":
					
					 resultado -= number2;
					 
					 break;
					
				case "*":
					
					 resultado*= number2;
					 
					 break;
					 
					
				case "/":
					if(resultado==0 || number2==0 ) {
						
						resultado= 0;
						
						div0=" No Division By ";
						
					}
					
					if(resultado!=0 && number2!=0) {
					resultado/= number2;
					}
					break;
					
				case "%":	
				
				if (resultado!=0) {
					
				
				resultado*=number2/100;
				
				}
				
				else {
					
					resultado=number2;
				}
				
				
				break;
					
				default:
					resultado=number2;
					
					
				}
				
				screen.setText(div0+ resultado);
				div0="";
				
				
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
				
		
		Calculate(x);
		
		
		
		
		
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
	
	public void help(ActionEvent event) {
		
		
		//MenuItem x=(MenuItem) event.getSource();
		FileReader helper;
		
		try {
			 helper=new FileReader(new File("C:/Users/Aaron/Desktop/Fichero.txt"));
			 
			 BufferedReader miBuffere = new BufferedReader(helper); 
			 
			  line="";
			 
			 while (line!=null) {
				
				 
				 line= miBuffere.readLine();
				 
				 if (line!=null) {
					 
					 
					System.out.println(line);
					
				//	abouttext.setText("klk");
					
					
				}
			}
			
			
			
			Stage Stage = new Stage();
			aboutStage= Stage;
			Parent root = FXMLLoader.load(getClass().getResource("/application/About.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage.setScene(scene);
			Stage.show();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("errr");
		}
		
	
	}
	
	
	public void aboutClose(ActionEvent event) {
	//	if (line!=null) {
			
		
		abouttext.setText(abouttext.getText()+line);
		
		
		
	}
	
	
	public void pressedKeyN(KeyEvent ek) {
	
		if (ek.getCode()==KeyCode.NUMPAD0 || ek.getCode()==KeyCode.NUMPAD1|| ek.getCode()==KeyCode.NUMPAD2 ||
				ek.getCode()==KeyCode.NUMPAD3 || ek.getCode()==KeyCode.NUMPAD4 ||ek.getCode()==KeyCode.NUMPAD5 ||
				ek.getCode()==KeyCode.NUMPAD6 || ek.getCode()==KeyCode.NUMPAD7 || ek.getCode()==KeyCode.NUMPAD8 ||
				ek.getCode()==KeyCode.NUMPAD9 ||ek.getCode()==KeyCode.DECIMAL) {
			
		
		KeyEvenCode.pressedKeyP(ek, screen, start);
		start=false;
		}
		
		System.out.println(ek.getCode().toString());
		
		if (ek.getCode()== KeyCode.ADD || ek.getCode()== KeyCode.MULTIPLY || ek.getCode()== KeyCode.SUBTRACT ||
				ek.getCode()== KeyCode.ENTER || ek.getCode()== KeyCode.DIVIDE ) {
			
			KeyEvenCode.OperaradoresPressed(ek, resultado, Double.parseDouble(screen.getText()), div0, screen);
			
		}
		
		
	}

	
	
	
	
		
}





















































