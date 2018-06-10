package comBox;

import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable {

	@FXML
	public Label mylabel= new Label();
	
	@FXML
	public ComboBox<String> combobox;
	
	@FXML
	
	public ListView<String> mylistview;
	
	@FXML 
	
	public Button clickme = new Button();
	
	
	ObservableList<String> list=FXCollections.observableArrayList("Mark","Tom","Jhon","Jack");
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		//combobox.setItems(list);
		
	//	mylistview.setItems(list);
		mylistview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
		clickme = new Button("Aceptar", new ImageView(new Image(getClass().getResourceAsStream("050-right-alignment.png"))));
		
	}

	public void comboChaged(ActionEvent event) {
		
		mylistview.getItems().addAll("Ramob","pedro","RAMIRO","SAMUEL");
		combobox.getItems().addAll("Ramob","pedro","RAMIRO","SAMUEL");
		
	//	mylabel.setText(combobox.getValue());
		
		
	}
	
	public void comboButton(ActionEvent event) {
		
	//	mylistview.getItems().addAll("Ramob","pedro","RAMIRO","SAMUEL");
		
		combobox.getItems().addAll("Ramob","pedro","RAMIRO","SAMUEL");
		
	//	mylabel.setText(combobox.getValue());
		
		ObservableList<String> names;
		names= mylistview.getSelectionModel().getSelectedItems();
		
		for(String name : names) {
			
			System.out.println(name);
			
			
			
		}
		
	
	
	
}

}
































