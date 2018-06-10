package socketClienteFX;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class EnviarMensaje  {
	
	
	
	public void enviar(ActionEvent e,TextArea str) {
		
		try {
			
			Socket miSocket = new Socket("10.0.0.8", 8888);
			
			DataOutputStream salida = new DataOutputStream(miSocket.getOutputStream());
			
			salida.writeUTF(str.getText());
			
			salida.close();
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}

}
