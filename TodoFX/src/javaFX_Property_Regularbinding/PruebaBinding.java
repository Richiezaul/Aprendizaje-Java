package javaFX_Property_Regularbinding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PruebaBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringProperty n = new SimpleStringProperty();
		
		StringProperty x = new SimpleStringProperty();
		
		n.setValue("hola");
		
		x.bind(n);
		
		
		System.out.println(n.getValue()+"......" + x.getValue());
		

	}

}
