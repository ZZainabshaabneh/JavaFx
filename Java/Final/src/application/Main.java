package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Pane myPan = new Pane(); //
		Stage mystage = new Stage();//the big parent
		Circle c1 = new Circle();
		c1.setRadius(15);
		c1.setStroke(Color.GREEN);//for border
//		c1.setCenterX(100);
//		c1.setCenterY(120);
		c1.setFill(Color.WHITE);
		Circle c2 = new Circle();
		c2.setRadius(15);
		c2.setStroke(Color.BLUE);//for border
		c2.setFill(Color.WHITE);
		Circle c3 = new Circle();
		c3.setRadius(15);
		c3.setStroke(Color.BROWN);//for border
		c3.setFill(Color.WHITE);
		StackPane st = new StackPane();//foucs on the center of object 
		st.getChildren().add(c1);
		Rectangle R1= new Rectangle();
		R1.setWidth(50);
		R1.setHeight(25);
	    R1.setLayoutX(200);
	    R1.setLayoutY(100);
		R1.setStroke(Color.BLACK);
		R1.setFill(Color.ORANGE);
		c1.centerXProperty().bind(myPan.widthProperty().divide(2));//to save the location and quartar value
		//myPan.getChildren().addAll(R1);//to show the circle
		//Scene myScene = new Scene(myPan,500,400);//size of scene
		//Scene mScene = new Scene(st,500,400);//size of scene
//		GridPane Gp= new GridPane();
//		Rectangle R2= new Rectangle();
//		R2.setWidth(40);
//		R2.setHeight(70);
//		R2.setFill(Color.BISQUE);
//		R2.setStroke(Color.RED);
//		Gp.add(R2, 1, 1);//the value like array
//		Gp.add(c1, 2, 2);
//		Gp.add(R1, 3, 3);
//		Scene myScene = new Scene(Gp,500,400);
    	BorderPane Bp= 	new BorderPane();//on the corner
//	    TextField T = new TextField();
//	    T.setLayoutX(100);
//	    T.setLayoutY(40);
//	    Label l = new Label("First Name:");
//	    l.setLayoutX(20);
//	    l.setLayoutY(40);
//	    TextField T2 = new TextField();
//	    T2.setLayoutX(100);
//	    T2.setLayoutY(80);
//	    Label l2 = new Label("Last Name:");
//	    l2.setLayoutX(20);
//	    l2.setLayoutY(80);
//	    Button B= new Button("Exit");
//	    B.setLayoutX(150);
//	    B.setLayoutY(150);
//	    Button B1= new Button("submit");
//	    B1.setLayoutX(220);
//	    B1.setLayoutY(150);
//	    myPan.getChildren().addAll(T,l,T2,l2,B,B1);
	//even handling 
		
	
		
		
		
		
		
		
		
	
		
		
		 TextField T = new TextField();
		 TextField T2 = new TextField();
		 Label l = new Label("First Name:");
		    Label l2 = new Label("Last Name:");
		   
		    Button B= new Button("Exit");
		    B.setStyle("-fx-border-color:blue;-fx-background-color:white");
		    Button B1= new Button("submit");
		 B1.setStyle("-fx-border-color:red;-fx-background-color:white");
		HBox H =new HBox();//in the same line 
		HBox H1 =new HBox();//in the same line 
		HBox H2 = new HBox();
		H2.getChildren().addAll(B,B1);
		H2.setLayoutX(70);
		H2.setLayoutY(120);
		 H.getChildren().addAll(l,T);
		 H1.getChildren().addAll(l2,T2);
		VBox V = new VBox();//in the same colum
		V.getChildren().addAll(H,H1,H2);
		VBox V1 = new VBox();//in the same colum
		V1.setLayoutX(200);
		V1.setLayoutY(70);
//		FlowPane flow = new FlowPane();
//	     flow.setVgap(70);
//	     flow.setHgap(4);
//	     flow.getChildren().addAll(H,H1);
		//V1.getChildren().addAll(c1,c2,c3);
		//Bp.getChildren().addAll(c1);
		myPan.getChildren().addAll(V,H2);
	    mystage.setTitle("MyFirstTrial");
	    
		Scene myScene = new Scene(myPan,500,400);
		mystage.setScene(myScene);
		mystage.show();//to show 
       //  original (0,0);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
