

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window=primaryStage;
        window.setTitle("Main window");

        Button button1=new Button("Click me,AlertBox!!!");
        button1.setOnAction(e->{
            alertBox.display("This Alert Box","please go again to main window");
        });
        Label label1=new Label("This is the Main stage");
        VBox layout=new VBox(50);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label1,button1);
        Scene scene1=new Scene(layout,300,250);
        window.setScene(scene1);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}





