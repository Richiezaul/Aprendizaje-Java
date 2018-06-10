package socketClienteFX;



import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MainControllerCliente {
	
	
	@FXML
	TextArea textArea =  new TextArea();
	
//	EnviarMensaje msj= new EnviarMensaje();
//	
//	
//	public void actionButton(ActionEvent e) {
//		
//		
//		msj.enviar(e, textArea);
//			
//	}
	
	
	public void enviar(ActionEvent event) {
		
		try {
			
			Socket miSocket = new Socket("10.0.0.7",2300);
			
			DataOutputStream salida = new DataOutputStream(miSocket.getOutputStream());
			
			salida.writeUTF(textArea.getText());
			
			salida.close();
			System.out.println("Enviando");
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		
		
		
		
	}

	
	
	
	

}
