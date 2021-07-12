package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


//FXML is essentially HTML for java
// you can use it to design the view in other words the layout or the interface for the user
//and then you can stick all of your brains all of the logic in a separate file called a controller
// and it breaks up everything it organizes your
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("hello world");

        Scene scene1=new Scene(root,300,200);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

}





