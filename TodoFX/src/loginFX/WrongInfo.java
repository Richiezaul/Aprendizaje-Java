package loginFX;

public class WrongInfo extends RuntimeException {
	
	
	public WrongInfo() {}
	
	public WrongInfo(String msj) {
		
		super(msj);
	}

}
