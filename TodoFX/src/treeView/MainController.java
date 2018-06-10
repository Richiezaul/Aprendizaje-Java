package treeView;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Icon;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {

	@FXML
	TreeView<String> treeview;
	
	Image Icon = new Image(
			getClass().getResourceAsStream("/Img/FolderFX.gif"));
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		TreeItem<String> root = new TreeItem<>("Root",new ImageView(Icon));
		
		root.setExpanded(true);
		
		TreeItem<String> nodeA = new TreeItem<>("node A",new ImageView(Icon));
		TreeItem<String> nodeB = new TreeItem<>("node B",new ImageView(Icon));
		TreeItem<String> nodeC = new TreeItem<>("node C",new ImageView(Icon));
		nodeA.setExpanded(true);
		
		
		
		TreeItem<String> nodeA1 = new TreeItem<>("node A 1",new ImageView(Icon));
		TreeItem<String> nodeA2 = new TreeItem<>("node A 2",new ImageView(Icon));
		TreeItem<String> nodeA3 = new TreeItem<>("node A 3",new ImageView(Icon));
		
		nodeA.getChildren().addAll(nodeA1,nodeA2,nodeA3);
		
		root.getChildren().addAll(nodeA,nodeB,nodeC);
		
		treeview.setRoot(root);
		
	}
	
	
	public void mouseClick( MouseEvent event) {
		
		if (event.getClickCount()==2) {
			
		
		
		TreeItem<String> item= treeview.getSelectionModel().getSelectedItem();
		
		System.out.println(item.getValue());
		
		}
	}

}



















































