package player;

import java.io.File;
import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;

import javax.naming.Binding;

import org.omg.CORBA.PUBLIC_MEMBER;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class MainController implements Initializable {
	
	

	
	@FXML private MediaView mv;
	
	private MediaPlayer mp;
	
	private Media me;
	
	@FXML private Slider timeplay = new Slider();
	
	@FXML private Label durationtx;
	@FXML
	
	Slider volumeSlider ;
	
	private Duration totaltime;
	


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		String path = new File("src/player_Media files/Ed Sheeran - Thinking Out Loud [Official Video].mp4").getAbsolutePath();
		
		me=new Media(new File(path).toURI().toString());
		
		mp= new MediaPlayer(me);
		
		mv.setMediaPlayer(mp);
		volumeSlider.setValue(mp.getVolume()*100);
		
		volumeSlider.valueProperty().addListener((Observable o) ->
		
		mp.setVolume(volumeSlider.getValue()/100));
		
	totaltime=mp.getTotalDuration();
	
	;
		
//		volumeSlider.valueProperty().addListener(new InvalidationListener() {
//			
//			@Override
//			public void invalidated(Observable arg0) {
//				// TODO Auto-generated method stub
//				
//				mp.setVolume(volumeSlider.getValue()/100);
//				
//			}
//		});
//		
		
//			timeplay.valueProperty().addListener(new InvalidationListener() {
//		    public void invalidated(Observable ov) {
//		       if (timeplay.isValueChanging()) {
//		       // multiply duration by percentage calculated by slider position
//		          mp.seek(duration.multiply(timeplay.getValue() / 100.0));
//		       }
//			
//		       }
//		});
		
		
		
		

				
	
		
		
		
		
//		DoubleProperty width = mv.fitWidthProperty();
//		DoubleProperty height = mv.fitHeightProperty();
//		width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
//		height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
				
		
	}

	public void play(ActionEvent event) {
		
		mp.play();
		mp.setRate(1);
		System.out.println(totaltime.toString());
		
		
		
	}
	
	public void pause(ActionEvent event) {
		
		mp.pause();
		
		
		
	}
	public void fast(ActionEvent event) {
		
		mp.setRate(2);
		
		
		
	}
	public void slow(ActionEvent event) {
		
		mp.setRate(.5);
		
		
		
	}
	public void reload(ActionEvent event) {
		
		mp.seek(mp.getStartTime());
		mp.play();
		
		
		
	}
	public void start(ActionEvent event) {
		
		mp.seek(mp.getStartTime());
		
		
		
	}
	public void last(ActionEvent event) {
		
		mp.seek(mp.getStopTime());
		mp.stop();
		
		
		
	}
	
	
	
	
}

























