package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Circleship();
		 
	}
	public void Circleship() {
		Stage mS = new Stage();
		Pane mP = new Pane();
		Circle c1= new Circle();
		c1.setRadius(25);
//		c1.setLayoutX(120);
//		c1.setLayoutY(150);
		c1.centerXProperty().bind(mP.widthProperty().divide(2));
		c1.centerYProperty().bind(mP.heightProperty().divide(2));
		c1.setStroke(Color.LAVENDER);
		c1.setFill(Color.AQUA.darker());
         
		Button BB= new Button("click to increase size");
		BB.setOnAction(e->{
			c1.setRadius(c1.getRadius()*2);
		});
		Button B= new Button("click to decrease size");
		B.setOnAction(e->{
			c1.setRadius(c1.getRadius()/2);
		});
		HBox H=new HBox(15);
		H.setLayoutX(150);
		H.setLayoutY(350);
		H.getChildren().addAll(BB,B);
		mP.getChildren().addAll(c1,H);
		Scene ms= new Scene(mP,500,500);//hole for pane
		mS.setScene(ms);
		mS.show();
		mS.setTitle("Circleshape");
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
