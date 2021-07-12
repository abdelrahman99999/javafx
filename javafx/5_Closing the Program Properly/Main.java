package sample;

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
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("Main program");
        //for closing program by x button on (head of program)
        window.setOnCloseRequest(e->{
            //before using e.consume() if i click on yes or no it will close
            e.consume();
            closeProgram();
        });
        Button button1=new Button("Click to close");
        button1.setOnAction(e->{
            closeProgram();});
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
    private void closeProgram(){

        confirmBox.display("Alert","are you sure to close?");
        boolean res=confirmBox.result;
        if(res){
            System.out.println("file is saved...");
            window.close();
        }
    }
}





