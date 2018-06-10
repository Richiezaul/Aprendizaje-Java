package tableView;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable {

	@FXML
	private TableView<Student> table;
	@FXML
	private TableColumn<Student,Integer > id;
	@FXML
	private TableColumn<Student, Integer> age;
	@FXML
	private TableColumn<Student,String > name;
	@FXML
	private TableColumn<Student, String > surname;
	
	
	public ObservableList<Student> list= FXCollections.observableArrayList(
			new Student(1,"manuel","Rodrigues",25),
			new Student(2,"RAmon","Montero",36),
			new Student(3,"camilo","Peres",42),
			new Student(4,"Manue","Rodrigues",20),
			new Student(5,"TonTon","Pena",39)
			
			
			);
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		age.setCellValueFactory(new PropertyValueFactory<>("age"));
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<>("surname"));
		
		table.setEditable(true);
		table.setItems(list);
		
	}

	
	
	
	
}
