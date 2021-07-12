
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("Main program");

        BorderPane layout=new BorderPane();
        //top
        HBox topMenu=new HBox(20);
        Button b1=new Button("File");
        Button b2=new Button("Edit");
        Button b3=new Button("View");
        topMenu.getChildren().addAll(b1,b2,b3);
        //left
        VBox lefMenu=new VBox(5);
        Button b4=new Button("aaaaa");
        Button b5=new Button("bbbbb");
        Button b6=new Button("ccccc");
        lefMenu.getChildren().addAll(b4,b5,b6);

        layout.setLeft(lefMenu);
        layout.setTop(topMenu);

        Scene scene1=new Scene(layout,400,300);
        window.setScene(scene1);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}





