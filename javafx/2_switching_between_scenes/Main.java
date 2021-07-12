
//switching between scenes
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    @Override

    public void start(Stage primaryStage) throws Exception{
		Stage window=primaryStage;
		Scene scene1,scene2;
		VBox pane1=new VBox();
		VBox pane2=new VBox();
		scene1=new Scene(pane1,300,400);
		scene2=new Scene(pane2,600,400);

		//scene1
		Label label1=new Label("this is the first scene");
		Button button1=new Button("click to go to the 2nd scene");
		pane1.getChildren().addAll(label1,button1);
		button1.setOnAction(e->{
			window.setScene(scene2);
		});

		//scene2
		Label label2=new Label("this is the second scene");
		Button button2=new Button("click to go  back to the 1st scene");
		pane2.getChildren().addAll(label2,button2);
		button2.setOnAction(e->{
			window.setScene(scene1);
		});


		window.setTitle("first program"); // Set the stage title
		window.setScene(scene1); // Put scene in stage
		window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
 