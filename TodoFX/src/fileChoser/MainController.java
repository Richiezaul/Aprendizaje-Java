package fileChoser;

import java.io.File;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;


public class MainController {
	
	@FXML
	private Button bt1;
	@FXML
	private Button bt2;
	@FXML
	private ListView listview;
	
	
	public void button1Action(ActionEvent event) {
		FileChooser fChooser= new FileChooser();
		fChooser.setInitialDirectory(new File("D:\\windows 7 iso"));
		
//		fChooser.getExtensionFilters().addAll(
//				
//				
//				new ExtensionFilter("PDF Files","*pdf")
//				
//				
//				);
//		
		//File x=fChooser.showSaveDialog(null);
		
	
		File selectedFile= fChooser.showOpenDialog(null);
		
		
//			if (fChooser != null) 
//				
//			listview.getItems().add(selectedFile.getName());
//		
			
	
				
			
	
		
	}
	
	

	public void button2Action(ActionEvent event) {
		
		
		FileChooser fChooser= new FileChooser();
		fChooser.setInitialDirectory(new File("D:\\windows 7 iso"));
		
//		fChooser.getExtensionFilters().addAll(
//				
//				
//				new ExtensionFilter("PDF Files","*pdf")
//				
//				
//				);
//		
		
		
	List<File> selectedFiles= fChooser.showOpenMultipleDialog(null);
		
		
			if (fChooser != null) 
				
				for (int i = 0; i < selectedFiles.size(); i++) {
					
				
				
			listview.getItems().add(selectedFiles.get(i).getParentFile());
		
				}
		
	}

	

}
