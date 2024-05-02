package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;
 


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Circleship();
		//Calcultor();
	}
	public void Calcultor() {
		Stage ms=new Stage();
		Pane mp=new Pane();
		Label l1=new Label("    First Number : ");
		TextField T1=new TextField();
		Label l2=new Label("    Second Number : ");
		TextField T2=new TextField();
		Label l3=new Label("    Operation : ");
		TextField T3=new TextField();
		TextField T4=new TextField();
		T4.setEditable(false);
		T4.setMaxWidth(80);
		T4.setLayoutX(100);
		T4.setLayoutY(150);
		Button BB= new Button("  Result");
		
		Button B= new Button("  Exit");
		
		HBox h= new HBox(14);
		HBox h2= new HBox(14);
		HBox h3= new HBox(14);
		HBox h4= new HBox(14);
		 
 		
		h.getChildren().addAll(l1,T1);
		h2.getChildren().addAll(l2,T2);
		h3.getChildren().addAll(l3,T3);
		h4.getChildren().addAll(BB,B);
		VBox V=new VBox(30);
		BB.setOnAction(e->{
			int res=0;
			int x=Integer.parseInt(T1.getText());
			int y=Integer.parseInt(T2.getText());
			if(T3.getText().equals("-")) {
				res=x-y;
			}
			else if(T3.getText().equals("+")) {
			 res=x+y;
			}
			else if(T3.getText().equals("*")) {
				 res=x*y;
			}
			else {
			 res=x/y;	
			}
			T4.setText(String.valueOf(res));
			
			 //((int)(T1.getText())+(int)(T2.getText()));
		});
		B.setOnAction(e->{
			 ms.close();
		});
		V.getChildren().addAll(h,h2,h3,T4,h4);
		mp.getChildren().addAll(V);
		Scene sm=new Scene(mp,400,500);
		ms.setScene(sm);
		ms.show();
		ms.setTitle("Calculator");
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
//	class HandelEvents implements EventHandler<ActionEvent>{
//	 public void handle(ActionEvent arg0) {
//		 
//	 }
//	}
}
