package animation;



import javafx.animation.PathTransition;
 import javafx.animation.Timeline;
 import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
 import javafx.scene.paint.Color;
 import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
 import javafx.util.Duration;

 public class Main extends Application {
	 
	 
 public static void main(String[] args) {
	 
	 launch(args);
	 
 }
 
 
 public void start(Stage primaryStage) {
 // Create a pane
 Pane pane = new Pane();

 // Create a rectangle
 Rectangle rectangle = new Rectangle (0, 0, 25, 50);
 rectangle.setFill(Color.ORANGE);

 // Create a circle
 Circle circle = new Circle(300, 200, 100);
 circle.setFill(Color.WHITE);
 circle.setStroke(Color.BLACK);
 
 //Create Line
 
 Line line= new Line(150,150, 400,150 );
 
 //Create Text
 
 //ImageView imageView = new ImageView("C:\\Users\\Aaron\\Desktop\\Java\\491862-text-editor\\png\\001-text-3.png");
 

 Text text = new Text(0, 0,"Aaron");
 text.setFont(new Font("Arial",20));
 
 text.setStyle("-fx-font-size:50px");
 //text.setStyle("-fx-text-fill: linear-gradient( from 0.0% 0.0% to 100.0% 100.0%, rgb(77,102,204) 0.0, rgb(204,51,51) 100.0)");
 
 

 // Add circle and rectangle to the pane
 //pane.getChildren().add(circle);
// pane.getChildren().add(rectangle);
 
 pane.getChildren().add(text);
// pane.getChildren().add(line);
// pane.getChildren().add(imageView);
 

 
// Create a path transition
 PathTransition pt = new PathTransition();
// PathTransition pt = new PathTransition(Duration.millis(10000),new Line(100, 200, 100, 0), imageView);
 pt.setDuration(Duration.millis(4000));
 pt.setPath(line);
 pt.setNode(text);
 pt.setOrientation(
 PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
 pt.setCycleCount(Timeline.INDEFINITE);
 pt.setAutoReverse(true);
 pt.play(); // Start animation

 circle.setOnMousePressed(e -> pt.pause());
 circle.setOnMouseReleased(e -> pt.play());

 // Create a scene and place it in the stage
 Scene scene = new Scene(pane, 500, 400);
 primaryStage.setTitle("PathTransitionDemo"); // Set the stage title

primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage
}

 }